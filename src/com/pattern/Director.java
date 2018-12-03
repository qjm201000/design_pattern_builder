package com.pattern;

/**
 * 设计者
 */
public class Director {
    public Product constructProduct(Builder builder){
        builder.builderBasic();//先建造地基
        builder.builderWall();//再建造墙
        builder.builderRoofed();//最后建造楼顶
        return builder.getProduct();
    }
}
