package com.pattern;

/**
 * 工程队1
 */
public class ConcreteBuilder1 implements Builder{
    private Product product = new Product();

    @Override
    public void builderBasic() {
        product.setBasic("建造房子1-地基");
    }

    @Override
    public void builderWall() {
        product.setWall("建造房子1-墙");
    }

    @Override
    public void builderRoofed() {
        product.setRoofed("建造房子1-楼顶");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
