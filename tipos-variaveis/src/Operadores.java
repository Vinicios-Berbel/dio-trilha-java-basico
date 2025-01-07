public class Operadores {

    public static void main(String[] args){
        // String nomeCompleto = "Linguagem" + " " + "Java";
        // System.out.println(nomeCompleto);


        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);

        // concatenacao = "1"+ (1+1+1);
        // System.out.println(concatenacao);
        

        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = - numero;
        // ou numero = numero * -1;
        System.out.println(numero);
        
        System.out.println(numero --);
        System.out.println(numero);

        System.out.println(numero ++);
        System.out.println(numero);


        boolean teste = true;

        System.out.println(!teste);
        System.out.println(teste);

        int numero1 = 1, numero2 = 2;
        boolean num = numero1 == numero2;

        if(num){
            System.out.println("Numero 1 é igual numero 2");
        }
        else{
            System.out.println("Numero 1 não é igual numero 2");
        }

        boolean condicao1= true;
        boolean condicao2= true;

        if((condicao1 == condicao2) && (num = false)){
            System.out.println("Tudo verdadeiro");
        }
        else{
            System.out.println("Uma ou mais condições falsas");
        }

        if((condicao1 == condicao2) || (num = false)){
            System.out.println("Tudo verdadeiro");
        }
        else{
            System.out.println("Uma ou mais condições falsas");
        }
    }
    
}
