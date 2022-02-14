package com.example.gles;

public class TestJni {
    public native String stringFromJNI();
    static {
        System.loadLibrary("native-lib");
    }
}
