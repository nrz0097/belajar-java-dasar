public class IfStatement {
    public static void main(String[] args) {
        // Cara penulisan 1
        var nilai = 75;
        var absen = 80;

        if(nilai >= 75 && absen >= 75){ // Value if harus boolean
            System.out.println("Selamat anda Lulus");
        }

        // Cara penulisan 2 dengan "Else"
        var nilai2 = 80;
        var absen2 = 70;
        var lulus = nilai2 >= 75 && absen2 >= 75;

        if(lulus){
            System.out.println("Selamat anda lulus");
        }else {
            System.out.println("Maaf anda gagal");
        }

        // Cara penulisan 3 dengan "Else If"
        var nilai3 = 50;
        var absen3 = 50;

        if(nilai3 >= 80 && absen3 >= 80){
            System.out.println("Nilai anda A");
        }else if(nilai3 >= 70 && absen3 >= 70){
            System.out.println("Nilai anda B");
        }else if(nilai3 >= 60 && absen3 >= 60){
            System.out.println("Nilai anda C");
        }else {
            System.out.println("Nilai anda D");
        }

    }
}
