package day19;

public class C07 extends C06 {


    @Override
    public void deneme() {
        System.out.println("child class");
    }

    public final void deneme2(){
        System.out.println("deneme2");
    }

    public static void main(String[] args) {
        System.out.println(C06.SAYI);

        C07 obj1=new C07();
        obj1.deneme();

    }
}
