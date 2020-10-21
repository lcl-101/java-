public class PrintChars {
    public static void main(String[] args) {
        char ch = 'A';
        int startNum = ch;
        for (int i = 0; i < 26; i++) {
            System.out.println((startNum + i) + "\t" + (char)(startNum + i));
        }
    }
}
