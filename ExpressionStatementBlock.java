public class ExpressionStatementBlock { // Block
    public static void main(String[] args) { // Block

        String hello; // Expression
        hello = "Hello, World!"; //Expression

        System.out.println(hello); // Statement

        { // Block
            var iniStatement = "Ini Statement"; // Expression

            System.out.println(iniStatement); // Statement
        } // Block

    } // Block
} // Block
