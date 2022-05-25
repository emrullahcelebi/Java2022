package day18;



public class C05 {
    public static void main(String[] args) {
        String str1=" ";
        String str2="";
        String str3=null;

        System.out.println(str1.length());
        System.out.println(str2.length());
        //System.out.println(str3.length());//NullPointerException

        System.out.println(str3+"bos");
        System.out.println(str3.concat("bos"));
    }
}
