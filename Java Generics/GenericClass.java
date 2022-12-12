package JavaGenerics;

// import java.util.*; //Does not require any packages
// for inplimenting java generics 
// we will define generic class here 
class GClass<T> {
    T data;

    // constructor
    public GClass(T data) {
        this.data = data;
    }

    // getData Methord
    public T getData() {
        return data;
    }
}

public class GenericClass {
    public static void main(String args[]) {
        // using generics class
        GClass<String> strObj = new GClass<>("Aditya Battin from A Div");
        GClass<Integer> intObj = new GClass<>(45);

        System.out.println("Hi My name is " + strObj.getData());
        System.out.println("My Roll Number is : " + intObj.getData());

    }
}
