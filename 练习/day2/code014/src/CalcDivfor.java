public class CalcDivfor {
    public static void main(String[] args) {
        int divided = 5;
        int divisor = 30;

        int found = 0;
        int toBeFound = 10;
//        for(int i=0;i< 100 && found < 10;i++){
//            if(divided % divisor == 0){
//                System.out.println(divided+"可以整除" + divisor + ",商为:" + (divided/divisor));
//                found++;
//            }
//            divided++;
//        }

        for(int i=0;i< 100;i++){
            if(divided < divisor){
                System.out.println(divided + "小于" + divisor + "单签循环退出");
                divided++;
                continue;
            }
            if(divided % divisor == 0){
                System.out.println(divided+"可以整除" + divisor + ",商为:" + (divided/divisor));
                found++;
            }
            if(found >= toBeFound){
                System.out.println("已经找到" + toBeFound + "个数, 循环退出");
                break;
            }
            divided++;
        }
    }
}
