package day19;

public class C05 {
    public static void main(String[] args) throws C04 {

        String email="eee@gamail.com";
        mailDogrulama(email);
    }

    public static void mailDogrulama(String email) throws C04 {
        if (email.contains("@gmail.com")||email.contains("@hotmail.com")) {
            System.out.println("Basarili");
        }else{
            throw new C04("email uygun degil");
        }
    }
}
