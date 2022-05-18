package org.cland;

import java.util.function.*;

public class Case02 {

    public static void main(String[] args) {
        //Predicate<T>-- 对象的布尔值属性
        System.out.println("Predicate<T>-- 对象的布尔值属性");
        Predicate<Object> predicate = x -> x != null && x instanceof X;
        System.out.println(predicate.test(new X()));
        System.out.println(predicate.test(new Y()));
        System.out.println(predicate.test(null));
        //Consumer<T> //-- 对对象执行的操作
        System.out.println("Consumer<T> //-- 对对象执行的操作");
        Consumer<X> consumer = x -> {
            if (x != null) {
                System.out.println("不为空消费他," + x);
            } else System.out.println("算了");
        };
        consumer.accept(new X());
        //Function<T,R> //-- 将 T 转换为 R 的函数
        System.out.println("Function<T,R> //-- 将 T 转换为 R 的函数");
        Function<X,Y> converter= x->new Y();
        System.out.println("转化X为Y："+converter.apply(new X()));
        //Supplier<T> //-- 提供一个 T 的实例（例如一个工厂）
        System.out.println("Supplier<T> //-- 提供一个 T 的实例（例如一个工厂）");
        Supplier<X> xSupplier=()->new X();
        System.out.println("获取一个实例："+xSupplier.get());
        //UnaryOperator<T> //-- 从 T 到 T 的函数
        System.out.println("UnaryOperator<T> //-- 从 T 到 T 的函数");
        //和 Function 函数一样，只是转化目标最终也是同一个类型
        UnaryOperator<Integer> unaryOperator=x->x*5;
        System.out.printf("从 T=[%d] 到 T=[%d]%n",5,unaryOperator.apply(5));
        //BinaryOperator<T> //-- 从 (T, T) 到 T 的函数
        System.out.println("BinaryOperator<T> //-- 从 (T, T) 到 T 的函数");
        BinaryOperator<Integer> binaryOperator1=(x,y)->x+y;
        System.out.printf("加 6+1=%d%n",binaryOperator1.apply(6,1));
        BinaryOperator<Integer> binaryOperator2=(x,y)->x-y;
        System.out.printf("减 3-1=%d%n",binaryOperator2.apply(3,1));
        BinaryOperator<Integer> binaryOperator3=(x,y)->x*y;
        System.out.printf("乘 4*1=%d%n",binaryOperator3.apply(4,1));
        BinaryOperator<Integer> binaryOperator4=(x,y)->x/y;
        System.out.printf("除 2/1=%d%n",binaryOperator4.apply(2,1));
    }

    private static class X {
        private Integer btc;
    }

    private static class Y {
        private Integer btc;
    }
}
