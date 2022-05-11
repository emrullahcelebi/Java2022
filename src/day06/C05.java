package day06;

public class C05 {
    public static void main(String[] args) {
        String str="Her gun Java";
        System.out.println(str.startsWith("H"));//true
        System.out.println(str.startsWith("gun",4));//true
        System.out.println(str.isEmpty());//false

        String str2="";

        System.out.println(str2.isEmpty());//true

        String str3=null;
        System.out.println(str3.isEmpty());//RTE


    }
}
