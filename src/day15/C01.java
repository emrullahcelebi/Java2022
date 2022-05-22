package day15;

public class C01 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Rumeysa");
        System.out.println(sb1);

        sb1.append(" ").append("Cetinturk");
        System.out.println(sb1);
        sb1.append("Javayi cok sever",6,9);
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println(sb1.charAt(1));
        sb1.delete(17,21);
        System.out.println(sb1);
        sb1.deleteCharAt(7);
        System.out.println(sb1);

        String isim="RumeysaCetinturk";
        System.out.println(sb1.equals(isim));

        System.out.println(sb1.indexOf("Cetin"));
        System.out.println(sb1.indexOf("e",6));

        sb1.insert(7," ");
        System.out.println(sb1);
       String cumle="Merhaba Dunya";
        sb1.insert(0,cumle,0,8);
        System.out.println(sb1);
        System.out.println(sb1.lastIndexOf("t"));

        sb1.replace(8,15,"Seher");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();
        sb1.setCharAt(10,'k');
        System.out.println(sb1);
        System.out.println(sb1.subSequence(8,13));
        System.out.println(sb1.substring(8));

        StringBuilder sb3=new StringBuilder("Bava cok guzel");
        StringBuilder sb4=new StringBuilder("cava cok guzel");

        System.out.println(sb3.equals(sb4));//false
        System.out.println(sb3.toString().equals(sb4.toString()));//true
        System.out.println(sb3.toString().concat("Yasamak cok guzel"));
        sb1.trimToSize();

        System.out.println(sb3.compareTo(sb4));






    }
}
