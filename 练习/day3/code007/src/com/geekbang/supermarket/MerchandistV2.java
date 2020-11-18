package com.geekbang.supermarket;

public class MerchandistV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrce;
    String madeIn;

    // >> TODO 访问修饰符
    // >> TODO 返回值类型: 无需返回值则用void表示, void是java中的关键字
    // >> TODO 方法名: 任意合法的标识符
    // >> TODO 参数列表
    // >> TODO 方法体
    // >> TODO 方法体内部定义的变量叫做局部变量
    public void describe() {
        double netIncome = soldPrice - purchasePrce;
        System.out.println("商品名字叫做" + name + ". id是" + id + ". 商品售价是" + soldPrice + ". 商品进价是" + purchasePrce + ". 商品库存是" + count + ". 销售一个的毛利是" + netIncome + ". 制造地是" + madeIn);
    }
}
