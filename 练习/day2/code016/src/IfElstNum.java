public class IfElstNum {
    public static void main(String[] args) {
        int n = 1;

        String str = n + "对应的中文数字是:";
        if(n == 1){
            str += "壹";
        }else if(n == 2){
            str += "贰";
        }else if(n == 3){
            str += "肆";
        }else {
            System.out.println("错误的n");
        }
        System.out.println(str);
    }
}
