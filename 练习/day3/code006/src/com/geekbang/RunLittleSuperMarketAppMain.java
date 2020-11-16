package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.Merchandis;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.border.TitledBorder;
import java.util.Scanner;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandis = new Merchandis[200];
        littleSuperMarket.merchandistSold = new int[littleSuperMarket.merchandis.length];

        Merchandis[] all = littleSuperMarket.merchandis;

        for(int i = 0;i<all.length;i++){
            Merchandis m = new Merchandis();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("超市开门了");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);
        while (open){
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("本店地址" + littleSuperMarket.address);
            System.out.println("共有停车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandis.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + (int)(Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if(customer.isDrivingCar){
                if(littleSuperMarket.parkingCount > 0){
                    System.out.println("欢迎" + customer.name + "驾车而来,本店已为您安排了车位,停车免费哦.停车位为"+ littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                }else {
                    System.out.println("不好意思,本店车位已满,欢迎下次再来");
                }
            }else {
                System.out.println("欢迎" + customer.name + "光临本店");
            }

            double totalCost = 0;
            while (true){
                System.out.println("本店提供" + all.length + "中商品,欢迎选购,请输入商品编号");
                int index = scanner.nextInt();

                if(index < 0){
                    break;
                }
                if(index >= all.length){
                    System.out.println("本店没有中商品,请输入标号在0到" + (all.length - 1) + "之内的商品标号.");
                    continue;
                }

                Merchandis m = all[index];

                System.out.println("您选购的商品名字" + m.name + ". 单价是" + m.soldPrice + ". 请问购买多少个?");
                int numToBuy = scanner.nextInt();

                if(numToBuy <= 0 ){
                    System.out.println("不买看看也好.欢迎继续挑选");
                    continue;
                }

                if(numToBuy > m.count){
                    System.out.println("本店此商品库存没有这么多,欢饮继续挑选");
                    continue;
                }

                if(numToBuy * m.purchasePrice > customer.money){
                    System.out.println("您带的钱不够,欢饮继续挑选");
                    continue;
                }

                totalCost += numToBuy * m.soldPrice;

                m.count -= numToBuy;
                littleSuperMarket.merchandistSold[index] += numToBuy;
            }

            customer.money -= totalCost;
            if(customer.isDrivingCar){
                littleSuperMarket.parkingCount++;
            }
            System.out.println("顾客" + customer.name + "共消费了" + totalCost);

            littleSuperMarket.incomingSum = totalCost;

            System.out.println("还继续营业么?");
            open = scanner.nextBoolean();
        }

        System.out.println("超市关门了");
        System.out.println("今天总共的营业额为"+ littleSuperMarket.incomingSum + "营业情况如下");

        for(int i = 0; i < littleSuperMarket.merchandistSold.length; i++){
            Merchandis m = all[i];
            int numSold = littleSuperMarket.merchandistSold[i];
            if(numSold > 0){
                double incomming = m.soldPrice * numSold;
                double netIncomming = (m.soldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个, 销售额为" + incomming + ", 净利润为" + netIncomming);
            }
        }
    }
}
