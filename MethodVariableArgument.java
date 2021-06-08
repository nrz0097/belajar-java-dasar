public class MethodVariableArgument {
    public static void main(String[] args) {

    // Memanggil method nilaiAkhir
    int[] nilai = {80, 90, 70, 70};
    nilaiAkhir("Zainuddin", nilai);

    // Memanggil method nilaiAkhir2
    nilaiAkhir2("Badrun", 80, 50, 70, 90);

    }

    // Penulisan lama
    static void nilaiAkhir(String nama, int[] nilai){
        var total = 0;
        for(var semuaNilai : nilai){
            total += semuaNilai;
        }
        var nilaiHasil = total / nilai.length;
        if(nilaiHasil >= 75){
            System.out.println("Selamat " + nama + " anda lulus");
        }else {
            System.out.println("Maaf " + nama + " anda gagal");
        }
    }

    // Penulisan dengan "Variable Argument"
    static void nilaiAkhir2(String nama, int... nilai){
        var total = 0;
        for(var semuaNilai : nilai){
            total += semuaNilai;
        }
        var nilaiHasil = total / nilai.length;
        if(nilaiHasil >= 75){
            System.out.println("Selamat " + nama + " anda lulus!");
        }else {
            System.out.println("Maaf " + nama + " anda gagal!");
        }
    }
}
