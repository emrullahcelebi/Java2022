package day17;

public class C03 {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=0;

        try{
            System.out.println(sayi1/sayi2);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
