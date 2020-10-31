import java.util.Scanner;

public class ScoreMaster {
    public static void main(String[] args) {
        //生命六个变量, 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuliIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        int totalScoreCount = 6;

        //每门课的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuliIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner in = new Scanner(System.in);

        System.out.println("请问要保存几年的成绩?");

        int ysarCode = in.nextInt();

        double[][] scores = new double[ysarCode][totalScoreCount];

        for (int i = 0; i < ysarCode; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年的" + names[j] + "成绩是:" + scores[i][j]);
            }
        }

        int year = 0;
        boolean count = true;
        while (count) {
            System.out.println("请输入要进行的操作编号");
            System.out.println("1:求某年最好成绩\n" + "2:求某年的平均成绩\n" + "3:求所有年份的最好成绩\n" + "4:求某门课历年的最好成绩");

            int oprId = in.nextInt();

            switch (oprId) {
                case 1:
                    System.out.println("请输入要求哪一年的最好成绩:");
                    year = in.nextInt() - 1;
                    if (year < 0 || year > ysarCode) {
                        System.out.println("非法年份");
                        break;
                    }
                    int bestYearOfScoreId = 0;
                    for (int i = 0; i < scores[year].length; i++) {
                        if(scores[year][bestYearOfScoreId] < scores[year][i]){
                            bestYearOfScoreId = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年最好成绩是: " + names[bestYearOfScoreId] + ";" + scores[year][bestYearOfScoreId]);
                    break;
                case 2:
                    System.out.println("请输入要求哪一年的平均成绩:");
                    year = in.nextInt() - 1;
                    if (year < 0 || year > ysarCode) {
                        System.out.println("非法年份");
                        break;
                    }
                    double totalScore = 0;
                    for (int i = 0; i < scores[year].length; i++) {
                        totalScore += scores[year][i];
                    }
                    System.out.println("第" + (year + 1) + "年平均成绩是: " + (totalScore/ names.length));
                    break;
                case 3:
                    int bestOfYearScoreId = 0;
                    year = 0;
                    for(int i =0;i < scores.length;i++){
                        for(int j = 0;j < scores[i].length; j++){
                            if(scores[year][bestOfYearScoreId] < scores[i][j]){
                                year = i;
                                bestOfYearScoreId = j;
                            }
                        }
                    }
                    System.out.println("历年最好成绩为第" + (year + 1) + "年的" + names[bestOfYearScoreId] + "成绩:" + scores[year][bestOfYearScoreId]);
                    break;
                case 4:
                    System.out.println("请问要查询哪门课的历年成绩");
                    int scoreId = in.nextInt();
                    year = 0;
                    for(int i = 0; i < scores.length;i++){
                        if(scores[year][scoreId] < scores[year][scoreId]){
                            year = i;
                        }
                    }
                    System.out.println(names[scoreId] + "历年做好成绩为第" + (year + 1) +"年,成绩为:" + scores[year][scoreId]);
                    break;
                default:
                    System.out.println("程序结束.");
                    count = false;
            }
        }
    }
}
