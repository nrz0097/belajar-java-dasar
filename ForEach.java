public class ForEach {
    public static void main(String[] args) {

        // Penulisan lama
        String[] nama = {
                "Zen", "Budi", "Ali",
                "Juned", "Alam", "Galuh"
        };

        for(var i = 0; i < nama.length; i++){
            System.out.println(nama[i]);
        }

        // Penulisan dengan For Each
        for(var names : nama){
            System.out.println(names);
        }

    }
}
