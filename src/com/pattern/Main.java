package com.pattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();//设计师,设计房子

        Builder builder1 = new ConcreteBuilder1();//工程队1
        Product product1 = director.constructProduct(builder1);
        System.out.println(product1);

        Builder builder2 = new ConcreteBuilder2();//工程队2
        Product product2 = director.constructProduct(builder2);
        System.out.println(product2);
    }
}
