public class MethodReturnValue {
    public static void main(String[] args) {

        // Memanggil method sum 1
        var hasil = sum(100, 100);
        System.out.println(hasil);

        // Memanggil method sum 2
        System.out.println(sum(200, 200));

        // Memanggil method hitung
        System.out.println(hitung(100, "-", 200));

    }

    // Contoh 1
    static int sum(int nilai1, int nilai2){
        var total = nilai1 + nilai2;
        return total;
    }

    // Contoh 2 dengan switch
    static int hitung(int nilai1, String operasi, int nilai2){
        switch (operasi){
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            default:
                return 0;
        }
    }

}
