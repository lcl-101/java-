public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;

        {
            int inter = 10;
            System.out.println("outer变量值是" + outer + ". inner变量的值是" + inter);
        }

        int a1 = 1;
        {
            int a2 = a1 + a1;
            {
                int a3 = a2 + 1;
                System.out.println(a3);
            }
            {
                int a3 = a2 + 10;
                System.out.println(a3);
            }
            System.out.println(a2);
        }
    }
}
