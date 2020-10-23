public class RanDomNumber {
    public static void main(String[] args) {
        double randNum = 0;

        //要生成一个大于0.5的随机数,只有随机数大于了0.5循环才会退出
        while (randNum < 0.5) {
            //使用java中的Math.random(), 生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("生成的大于0.5的随机数是:" + randNum);

        int rangeStart = 30;
        int rangeEnd = 90;

        int mod = rangeEnd - rangeStart;
        for (int i = 0;i< 50;i++){
            int bigRandom = (int) (Math.random() * (rangeEnd * 100));
            int numberToGuess = (bigRandom % mod) + rangeStart;
            System.out.println("mod=" + mod + ", numberToGuess=" + numberToGuess);
        }

    }
}
