package hello;

public class HelloNative {

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        int result = integerTest();
        if (result == 5)
	    System.out.println("All ok!");
        else
            System.out.println("Error!");
        System.exit(0);
    }
    public static native int integerTest();
}
