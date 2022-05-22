package day15;

public class C06 {
    public static void main(String[] args) {
        C05 obj1=new C05();
        System.out.println(obj1.getOkulIsmi());//Yildiz Koleji
        System.out.println(obj1.getOkulHesapNo());
        System.out.println(obj1.isOkulAcikMi());

        obj1.setOkulIsmi("Mehmet Koleji");
        System.out.println(obj1.getOkulIsmi());//Mehmet Koleji

        C05 obj2=new C05();
        System.out.println(obj2.getOkulIsmi());//Yildiz Koleji
    }
}
