package com.example.designdemo.singelton;

public class DoubleCheckMode {
    private volatile static DoubleCheckMode sDoubleCheckMode;

    public DoubleCheckMode() {
    }

    public static DoubleCheckMode getInstance() {
        if (sDoubleCheckMode == null)
            synchronized (DoubleCheckMode.class) {
                if (sDoubleCheckMode == null) {
                    sDoubleCheckMode = new DoubleCheckMode();
                }
            }
        return sDoubleCheckMode;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    System.out.println("thread" + getId());
                    DoubleCheckMode.getInstance();
                }
            }.start();
        }
    }

}
