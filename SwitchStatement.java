public class SwitchStatement {
    public static void main(String[] args) {

        // Switch case biasa
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Cukup Baik");
                break;
            case "D":
                System.out.println("Baik");
                break;
            default:
                System.out.println("Kurang Baik");
        }

        // Switch Case Lambda (untuk java 14 keatas)
        // Penulisan 1
        switch (nilai) {
            case "A" -> System.out.println("Sangat Baik");
            case "B", "C" -> System.out.println("Cukup Baik");
            case "D" -> System.out.println("Baik");
            default -> System.out.println("Kurang Baik");
        }

/*         Jika value lebih dari satu bisa menggunakan kurung kurawal {}
           default -> {
               System.out.println("Kurang Baik");
                }
 */
        // Penulisan 2
            String ucapan;
            switch (nilai) {
                case "A" -> ucapan = "Sangat baik";
                case "B", "C" -> ucapan = "Cukup baik";
                case "D" -> ucapan = "Baik";
                default -> ucapan = "Kurang baik";
            }
        System.out.println(ucapan);

        // Kata kunci yield (untuk java 14 keatas)
        var nilai2 = "B";
        String ucapan2 = switch (nilai2){
            case "A" :
                yield "Sangat baik";
            case "B", "C" :
                yield "Cukup baik";
            case "D" :
                yield "Baik";
            default :
                yield "Kurang baik";
        }; // Harus ada titik koma
        System.out.println(ucapan2);






    }
}
