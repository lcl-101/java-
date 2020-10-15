public class BItOprtUsage {
    public static void main(String[] args){
        int base = 1;
        // 0001
        int is_student_mask = base;
        // 0010
        int is_programmer_mask = base << 1;
        // 0100
        int is_drover_mask = base << 2;
        // 1000
        int is_painter_mask = base << 3;

        //二进制 101
        int data = 5;

        // 0101 & 0001 = 0001
        boolean isStudent = (data & is_student_mask) != 0;
        System.out.println(isStudent);
        // 0101 & 0010 = 0000
        boolean isProgrammer = (data & is_programmer_mask) != 0;
        System.out.println(isProgrammer);
        // 0101 & 0100 = 0100
        boolean isDriver = (data & is_drover_mask) != 0;
        System.out.println(isDriver);
        // 0101 & 1000 = 0
        boolean isPainter = (data & is_painter_mask) != 0;
        System.out.println(isPainter);
    }
}

