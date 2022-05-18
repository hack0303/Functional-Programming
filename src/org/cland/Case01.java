package org.cland;

public class Case01 {

    public static void main(String[] args) {
        Runnable runnable = null;
        System.out.println("====");
        InterfaceX x = () -> {
            System.out.println("===========");
        };
        x.test();
        test(() -> {
            System.out.println("===========");
        });
    }

    public static void test(InterfaceX func) {
        func.test();

    }

    @FunctionalInterface
    public interface InterfaceX {

        void test();
        //void asd(Integer x);
    }

}
