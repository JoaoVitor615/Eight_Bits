package com.example.eightbits;



public class Constants {

    public static final String STORAGE_TYPE = "storage_type";
    public static final String FILE_NAME = "arquivo.txt";

    public Constants() {
    }

    public enum Type {
        INTERNAL,
        EXTERNAL;

        private Type() {
        }
    }
}
