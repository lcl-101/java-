public class OneStatementEles {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("省略大括号");
        //只能有一行
        if (a > 0)
            System.out.println("a大于0");
        else
            System.out.println("a小于等于0");

        if (a > 0) {
            System.out.println("a大于0");
        } else if (a == 0) {
            System.out.println("a等于0");
        } else {
            System.out.println("a小于0");
        }

        if (a > 0)
            System.out.println("a大于0");
        else if (a == 0)
            System.out.println("a等于0");
        else
            System.out.println("a小于0");

        if (a == 0) {

        } else if (a == 1) {

        } else if (a == 2) {

        } else if (a == 3) {

        }
    }
}
