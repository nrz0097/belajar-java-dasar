public class Method {
    public static void main(String[] args) {
        // Memanggil method
        sayHelloWorld();
        // Bisa dipanggil berkali kali
        sayHelloWorld();
        sayHelloWorld();
    }

    // Method atau Function baru
    static void sayHelloWorld(){
        System.out.println("Hello, World 1");
        System.out.println("Hello, World 2");
        System.out.println("Hello, World 3");
    }
}
