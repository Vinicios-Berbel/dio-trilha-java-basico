public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String meuNome = "Vinicios Berbel";
        int numeroInteiro = 15;
        double numeroDouble = 20.20;
        float numeroFloat = 10.10f;
        long numeroLong = 10585056565L;
        short numeroShort = 31000;
        boolean variavelBoolean= true;

        // Variavel final não pode ser alterada, Ex:

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

        //Java e fortemente tipado, um exemplo é que não é possivel colocar uma valor de inteiro em uma variavel short, EX:

        short valorCurto = 2;
        int valorNormal = valorCurto;
        short valorCurto2 = (short) valorNormal;

    }
}
