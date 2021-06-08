public class MethodRecursive {
    public static void main(String[] args) {

        // Mencetak method factorialLoop
        System.out.println(factorialLoop(5));

        // Mencetak method factorialRecursive
        System.out.println(factorialRecursive(5));

        // Memanggil method loop
        loop(10000); // nilai 10K dapat menyebabkan eror stack overflow

    }
    // Penulisan dengan perulangan
    static int factorialLoop(int nilai){
        var hasil = 1;
        for(var counter = 1; counter <= nilai; counter++){
            hasil *= counter;
        }

        return hasil;
    }

    // Penulisan dengan "Recursive Method"
    static int factorialRecursive(int nilai){
        if(nilai == 1){
            return 1;
        }else {
            return nilai * factorialRecursive(nilai - 1);
        }
    }

    /* Penggunaan recursive method terlalu dalam/banyak dapat
    menyebabkan eror StackOverflow
     */
    // Contoh
    static void loop(int nilai){
        if(nilai == 0){
            System.out.println("Selesai");
        }else {
            System.out.println("Loop " + nilai);
            loop(nilai - 1);
        }
    }

}
