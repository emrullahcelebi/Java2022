package day06;

public class C08 {
    public static void main(String[] args) {
        String str="Her gun Java gibi olsa";
        System.out.println(str.substring(10));//va gibi olsa  10. index dahil devami
        System.out.println(str.substring(str.length()-10));//" gibi olsa" son 10 harfi yazdirir
        System.out.println(str.substring(0,9));
        System.out.println("**********"+ str.substring(10));

    }
}
