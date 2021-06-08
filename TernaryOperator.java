public class TernaryOperator {
    public static void main(String[] args) {

        // Penulisan lama
        var nilai = 75;
        String ucapan;

        if(nilai >= 75){
            ucapan = "Selamat anda lulus";
        }else {
            ucapan = "Maaf coba lagi";
        }
        System.out.println(ucapan);

        // Penulisan dengan Ternary Operator
        var nilai2 = 70;
        String ucapan2 = nilai2 >= 75 ? "Lulus" : "Tidak lulus";
        System.out.println(ucapan2);

    }
}
