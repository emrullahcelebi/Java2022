package day19;

public class C01 {
    public static void main(String[] args) {
        int yas=0;
try {
    if (yas > 0) {
        System.out.println(yas);
    } else {
        throw new IllegalArgumentException();
    }
}catch(IllegalArgumentException e) {
  e.printStackTrace();

        }
    }
}
