package com.example.designdemo.singelton;

public class InnerStaticMode {
    private static class SingleTonHolder {
        public static InnerStaticMode sInnerStaticMode = new InnerStaticMode();
    }

    public static InnerStaticMode getInstance() {
        return SingleTonHolder.sInnerStaticMode;
    }

}
