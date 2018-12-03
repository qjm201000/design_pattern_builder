package com.pattern;

/**
 * 建造者接口
 */
public interface Builder {
    void builderBasic();//建造地基
    void builderWall();//建造墙
    void builderRoofed();//建造楼顶
    Product getProduct();//生成房子
}
