public class SuperMarket {
    public static void main(String[] args) {

        //商品1
        Merchandise m1 = new Merchandise();
        m1.name = "茉莉花茶叶20包";
        m1.id = "000099518";
        m1.count = 1000;
        m1.price = 99.9;

        //商品2
        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐,300ml";
        m2.id = "000099519";
        m2.count = 1000;
        m2.price = 3.0;

        //卖出一个商品1
        int m1ToSolid = 1;
        System.out.println("感谢购买" + m1ToSolid + "个" + m1.name + ". 商品单价为" + m1.price + "消费总价为" + m1.price + m1ToSolid + ".");
        m1.count -= m1ToSolid;
        System.out.println(m1.id + "剩余的库存数量为" + m1.count);
    }
}
