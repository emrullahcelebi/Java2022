package day18;

public class C07 {
    public static void main(String[] args) {
        int sayi=10;
        //String str=sayi;
        String str="123456";
        System.out.println(str+10);

        int strSayi=Integer.parseInt(str);
        System.out.println(strSayi+10);
        String str2="123a456";
        //System.out.println(Integer.parseInt(str2));//NumberFormatException

        Object sayi2=40;
        String sayiStr=(String)sayi2;//ClassCastException
    }
}
