public class IFElseNestSimple {
    public static void main(String[] args) {
        int a = 99;
        int b = 66;
        int c = 33;

        if(a == b && b == c){
            System.out.println("a,b和c等打,为" + a);
        }else if(a > b && a > c){
            System.out.println("a最大, 为" + a);
        }else if(b > a && b > c){
            System.out.println("b最大, 为" + b);
        }else if(c > a && c > b){
            System.out.println("c最大, 为" + c);
        }else if(a == b && b > c){
            System.out.println("a和b等打切最大,为" + a);
        }else if(a == c && a > b){
            System.out.println("a和c等打切最大,为" + a);
        }else if(b == c && c > a){
            System.out.println("b和c等打切最大,为" + b);
        }
    }
}
