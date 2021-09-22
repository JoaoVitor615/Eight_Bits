package com.example.eightbits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;

public class Compras extends AppCompatActivity implements BuscarEndereco.OnTaskCompleted {

    public static final String PREFERENCIAS_NAME = "com.example.android.localizacao";
    private static final String TRACKING_LOCATION_KEY = "tracking_location";
    private static final int REQUEST_LOCATION_PERMISSION = 1;
    private static final String LATITUDE_KEY = "latitude";
    private static final String LONGITUDE_KEY = "longitude";
    private static final String LASTDATE_KEY = "data";

    // Views
    private Button mLocationButton;
    private TextView mLocationTextView;
    private static final String LASTADRESS_KEY = "adress";
    private FusedLocationProviderClient mFusedLocationClient;
    private LocationCallback mLocationCallback;
    // private Location location;
    // classes Location
    private boolean mTrackingLocation;

    // Shared preferences
    private SharedPreferences mPreferences;
    private String lastLatitude = "";
    private String lastLongitude = "";
    private String lastAdress = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_compras);

        mLocationButton = (Button) findViewById(R.id.btnBuscar);
        mLocationTextView = (TextView) findViewById(R.id.textview_location);

        // Inicializa FusedLocationClient.
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(
                this);

        // Recupera o estado da aplicação quando é recriado
        if (savedInstanceState != null) {
            mTrackingLocation = savedInstanceState.getBoolean(
                    TRACKING_LOCATION_KEY);
        }

        // Listener do botão de localização.
        mLocationButton.setOnClickListener(new View.OnClickListener() {
            /**
             * Toggle the tracking state.
             * @param v The track location button.
             */
            @Override
            public void onClick(View v) {
                if (!mTrackingLocation) {
                    startTrackingLocation();
                } else {
                    stopTrackingLocation();
                }
            }
        });

        // Inicializa os callbacks da locations.
        mLocationCallback = new LocationCallback() {
            /**
             * This is the callback that is triggered when the
             * FusedLocationClient updates your location.
             * @param locationResult The result containing the device location.
             */
            @Override
            public void onLocationResult(LocationResult locationResult) {
                // If tracking is turned on, reverse geocode into an address
                if (mTrackingLocation) {
                    new BuscarEndereco(Compras.this, Compras.this)
                            .execute(locationResult.getLastLocation());
                }
            }
        };

        //inicializa as preferências do usuário
        mPreferences = getSharedPreferences(PREFERENCIAS_NAME, MODE_PRIVATE);
        //recupera as preferencias
        recuperar();
    }

    /**
     * Inicia a busca da localização.
     * Busca as permissões e requisição se não estiverem presentes
     * Se estiverem requisitas as atualizações, define texto de carregamento
     */
    private void startTrackingLocation() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION_PERMISSION);
        } else {
            mTrackingLocation = true;
            mFusedLocationClient.requestLocationUpdates
                    (getLocationRequest(),
                            mLocationCallback,
                            null /* Looper */);

            // Set a loading text while you wait for the address to be
            // returned
            mLocationTextView.setText(getString(R.string.endereco,
                    getString(R.string.loading), null, null,
                    System.currentTimeMillis()));
            mLocationButton.setText(R.string.parar_busca);

        }
    }

    /**
     * Define os location requests
     *
     * @return retorna os parametros.
     */
    private LocationRequest getLocationRequest() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(10000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        return locationRequest;
    }

    /**
     * Para a busca da localização
     */
    private void stopTrackingLocation() {
        if (mTrackingLocation) {
            mTrackingLocation = false;
            mLocationButton.setText(R.string.iniciar_busca);
            mLocationTextView.setText(R.string.hint);
        }
    }

    /**
     * Salva a ultima localização
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(TRACKING_LOCATION_KEY, mTrackingLocation);
        super.onSaveInstanceState(outState);
    }

    /**
     * Callback chamado com a resposta da request permission
     *
     * @param requestCode  Código da requisição
     * @param permissions  Array com as requisições solicitadas.
     * @param grantResults Array com a resposta das requisições
     */


    @Override
    public void onRequestPermissionsResult(int requestCode,@NonNull String[] permissions,@NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_LOCATION_PERMISSION:
                // Permissão garantida
                if (grantResults.length > 0
                        && grantResults[0]
                        == PackageManager.PERMISSION_GRANTED) {
                    startTrackingLocation();
                } else {
                    Toast.makeText(this,
                            R.string.permissao_recusada,
                            Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }


    //Método com a resposta da BuscarEndereco
    @Override
    public void onTaskCompleted(String[] result) {
        if (mTrackingLocation) {
            // Update the UI
            lastLatitude = result[1];
            lastLongitude = result[2];
            lastAdress = result[0];
            mLocationTextView.setText(getString(R.string.endereco,
                    lastAdress, lastLatitude, lastLongitude, System.currentTimeMillis()));
        }
    }

    //sobrescreve os métodos referentes aos sensores
    @Override
    protected void onPause() {
        super.onPause();
        if (mTrackingLocation) {
            stopTrackingLocation();
            mTrackingLocation = true;
            armazenar(lastLatitude, lastLongitude, lastAdress);
        }
    }


    @Override
    protected void onResume() {
        if (mTrackingLocation) {
            startTrackingLocation();

        }
        recuperar();
        super.onResume();
    }


    //armazena os dados

    private void armazenar(String latitude, String longitude, String lastAdress) {
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putString(LATITUDE_KEY, latitude);
        preferencesEditor.putString(LONGITUDE_KEY, longitude);
        preferencesEditor.putLong(LASTDATE_KEY, System.currentTimeMillis());
        preferencesEditor.putString(LASTADRESS_KEY, lastAdress);
        preferencesEditor.apply();
    }

    private void recuperar() {
        lastLatitude = mPreferences.getString(LATITUDE_KEY, "");
        lastLongitude = mPreferences.getString(LONGITUDE_KEY, "");
        long time = mPreferences.getLong(LASTDATE_KEY, 0);
        lastAdress = mPreferences.getString(LASTADRESS_KEY, "");
        Toast.makeText(this,
                getString(R.string.endereco,
                        lastAdress, lastLatitude, lastLongitude, time),
                Toast.LENGTH_SHORT).show();

    }
}