public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Zen");
        sayHello("Zen", 25);

    }

    // Membuat method dengan nama yang sama tapi wajib berbeda parameter
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String nama){
        System.out.println(nama);
    }
    static void sayHello(String nama, int umur){
        System.out.println(nama + ' ' + umur);
    }
}
