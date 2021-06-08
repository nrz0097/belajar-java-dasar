public class Continue {
    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++){
            if(x % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil-" + x);
        }

    }
}
