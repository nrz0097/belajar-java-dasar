public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //Tipe data non-primitif menngunakan huruf kapital didepan
        Byte iniByte = 10;
        Short inShort = 123;
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Boolean iniBoolean = true;
        Character iniChar = 'A';
        //Default value tipe data non-primitif adalah "null"

        //Konversi tipe data primitif ke non-primitif
        int angka = 100;
        Integer angkaKonversi = angka;

        //Konversi untuk tipe data berbeda
        short shortKonversi = angkaKonversi.shortValue();//ada method tambahan
        byte byteKonversi = angkaKonversi.byteValue();

    }
}
