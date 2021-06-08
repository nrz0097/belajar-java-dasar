public class Variable {
    public static void main(String[] args) {

        //Cara penulisan 1
        String nama;
        nama = "Zainuddin Nor"; //Value harus sesuai dengan tipe data
        System.out.println(nama);

        //Cara penulisan 2
        int umur = 25;
        String alamat = "Balikpapan";

        //Memanggil variable kedua kali dapat mengubah valuenya
        nama = "Joni yes papa";

        //Cara penulisan 3 menggunakan "var"
        var firstName = "Jokowa";
        var age = 65;

        //Menggunakan kata kunci "final" untuk mengunci variable
        final String nama1 = "Bapau";
        final var nama2 = "Tiger Wong";

        System.out.println(nama + umur + alamat + firstName + age + nama1 + nama2);
    }
}
