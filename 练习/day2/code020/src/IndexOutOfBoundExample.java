public class IndexOutOfBoundExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        //数组过界限
        System.out.println(array[array.length]);
    }
}
