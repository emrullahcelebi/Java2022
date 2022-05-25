package day18;

public class C08 {
    public static void main(String[] args) {

        String str="12 34";

        try{
            System.out.println(2*Integer.parseInt(str));
        }catch(NumberFormatException e){
            System.out.println("Girdiginiz String sayiya cevrilemez");

        }

    }
}
