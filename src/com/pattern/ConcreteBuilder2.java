package com.pattern;

/**
 * 工程队2
 */
public class ConcreteBuilder2 implements Builder{
    private Product product = new Product();

    @Override
    public void builderBasic() {
        product.setBasic("建造房子2-地基");
    }

    @Override
    public void builderWall() {
        product.setWall("建造房子2-墙");
    }

    @Override
    public void builderRoofed() {
        product.setRoofed("建造房子2-楼顶");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
