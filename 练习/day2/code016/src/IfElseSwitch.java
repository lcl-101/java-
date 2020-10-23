public class IfElseSwitch {
    public static void main(String[] args) {
        int n = 2;

        String str = n + "对应的中文数字是:";

        switch (n){
            case 1:
                str += "壹";
                break;
            case 2:
                str += "贰";
                break;
            case 3:
                str += "肆";
                break;
            default:
                System.out.println("错误的n");
        }
        System.out.println(str);
    }
}
