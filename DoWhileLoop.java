public class DoWhileLoop {
    public static void main(String[] args) {

        var x = 100;
        do {
            System.out.println("Perulangan ke " + x); // Statement akan di eksekusi sekali meskipun kondisi salah
            x++;
        }while (x <= 5);

    }
}
