package com.example.designdemo.singelton;

public class LazyMode {
    private static LazyMode sLazyMode;

    private LazyMode() {
    }

    public static LazyMode getInstance() {
        if (sLazyMode == null) {
            sLazyMode = new LazyMode();
        }
        return sLazyMode;
    }

    public static void main(String[] args) {
        LazyMode.getInstance();
    }

}
