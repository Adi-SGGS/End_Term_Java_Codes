package JavaGenerics;

public class GenericsMethord {
    public static <T> void GMethord(T data) {
        System.out.println("Generics Methord Called");
        System.out.println(" data : " + data);
    }

    public static void main(String args[]) {

        GMethord("Aditya_Battin");
        GMethord(45);
    }
}
