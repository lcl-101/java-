package com.geekbang.supermarket;

public class MerchandistV2DescAppMain {
    public static void main(String[] args) {
        MerchandistV2 merchandistV2 = new MerchandistV2();

        merchandistV2.name = "书桌";
        merchandistV2.soldPrice = 999.9;
        merchandistV2.purchasePrce = 500;
        merchandistV2.count = 40;
        merchandistV2.id = "DESK9527";

        merchandistV2.describe();
    }
}
