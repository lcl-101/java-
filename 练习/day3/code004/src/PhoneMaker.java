public class PhoneMaker {
    public static void main(String[] args) {
        //创建一个phone的实例
        Phone phone = new Phone();

        phone.hasFigurePrintUnlocker = true;
        phone.price = 1999;
        phone.screen = new Screen();

        phone.screen.producer = "京东方";
        phone.screen.size = 8.8;

        CPU cpu = new CPU();
        cpu.producer = "三星";
        cpu.speed = 3.5;

        Memory memory = new Memory();
        memory.producer = "";

        phone.mainboard = new Mainboard();
    }
}
