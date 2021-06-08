public class KonversiNumber {
    public static void main(String[] args) {

        //Widening Casting -> Konversi Otomatis byte-double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInteger = iniShort;
        long iniLong = iniInteger;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        //Narrowing Casting -> Konversi Manual double-byte
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInteger2 = (int) iniLong2;
        short iniShort2 = (short) iniInteger2;
        byte iniByte2 = (byte) iniShort2;

        /*Hati-hati jika mengkonversi dari angka besar ke angka kecil
        bisa terjadi eror 'Number Overflow'
         */
    }
}
