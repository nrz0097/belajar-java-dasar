public class Break {
    public static void main(String[] args) {

        var x = 1;
        while (true){
            System.out.println("Perulangan ke-" + x);
            x++;

            if(x > 10){
                break;
            }
        }
        System.out.println("Perulangan Berhenti");

    }
}
