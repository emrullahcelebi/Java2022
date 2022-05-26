package day19;

public class C03 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        try{
            System.out.println(arr[20]);
        }/*catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }*/finally {
            System.out.println("calis");
            }
        }




}
