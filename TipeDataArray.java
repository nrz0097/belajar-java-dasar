import java.util.Arrays;

public class TipeDataArray {
    public static void main(String[] args) {
        //Cara penulisan 1
        String[] namaMurid; //array tipe data String, bisa diganti yg lain
        namaMurid = new String[3];
        namaMurid[0] = "Budi"; //nomor index array dimulai dari 0
        namaMurid[1] = "Jaka";
        namaMurid[2] = "Anton";

        //Cara penulisan 2
        String[] namaGuru = new String[2];
        namaGuru[0] = "Pak Hanus";
        namaGuru[1] = "Bu Gubur";

        //Cara penulisan 3
        int[] angka = new int[]{
            10, 90, 80, 10, 20
        };

        //Cara penulisan 4
        long[] angka2 = {
            100, 200, 300, 100
        };

        //Mencetak array
        System.out.println(namaGuru[1]);
        System.out.println(namaMurid[0]);
        System.out.println(angka[2]);
        System.out.println(angka2[1]);
        System.out.println(Arrays.toString(namaMurid));

        //Mengetahui panjang array
        System.out.println("Panjang array " + angka.length);
        System.out.println("Panjang array " + angka2.length);

        //Data array tidak bisa dihapus, hanya bisa diganti 0 atau null
        namaMurid[0] = null;
        angka[2] = 0;
        System.out.println(namaMurid[0]);
        System.out.println(angka[2]);

        //Array dalam array
        String[][] anggota = {
                {"Zen", "Anto"},
                {"Welly", "Kyrniawan", "Ali"},
                {"Rafael"}
        };
        System.out.println(anggota[0][1]);
        System.out.println(anggota[1][1]);
        System.out.println(anggota[2][0]);
    }
}
