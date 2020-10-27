public class Example {
    public static void main(String[] args) {
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int Wuli = 3;
        int HuaXue = 4;
        int SHengWu = 5;

        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];

        String[] scoresName = new String[totalScoreCount];

        scoresName[YuWen] = "语文";
        scoresName[ShuXue] = "数学";
        scoresName[WaiYu] = "外语";
        scoresName[Wuli] = "物理";
        scoresName[HuaXue] = "化学";
        scoresName[SHengWu] = "生物";

        for(int i  =0;i< totalScoreCount;i++){
            scores[i] = 80 + Math.random() * 20;
            System.out.println(scoresName[i] + "的成绩是:" + scores[i]);
        }

        double maxScores = 0;
        int maxScoreIndex = -1;

        for(int i=0;i<totalScoreCount;i++){
            if(scores[i] > maxScores){
                maxScores = scores[i];
                maxScoreIndex = i;
            }
        }

        System.out.println("最好成绩科目为:" + scoresName[maxScoreIndex] + ";成绩是:" + maxScores);
    }
}
