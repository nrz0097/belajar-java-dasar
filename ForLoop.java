public class ForLoop {
    public static void main(String[] args) {

        // Infinite loop
//        for(;;){ // Jika kondisi tidak diisi maka valuenya akan selelau "True"
//            System.out.println("Infinite and beyond");
//        }

        // Loop dengan kondisi
        var counter = 1;
        for(; counter <= 10 ;){
            System.out.println("Perulangan");
            counter++;
        }

        // Init Statement + Kondisi
        for(int angka = 1; angka <= 5;){
            System.out.println("Init Statement");
            angka++;
        }

        // Init Statmenet + Kondisi + Post statement
        for(int angka2 = 1; angka2 <= 4; angka2++){
            System.out.println("Post Statement");
        }


    }
}
