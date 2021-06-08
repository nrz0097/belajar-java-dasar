public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

    }
}
