public class Operadores {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && (7>4)){
            System.out.println("as duas condições são verdadeiras");
                       
        }
        if (condicao1 || condicao2){
            System.out.println("uma das condições são verdadeiras");
        }

          System.out.println("fim");
        
     

        String nomeUm = "Carlos";
        String nomeDois = "Carlos";

        System.out.println(nomeUm.equals(nomeDois));


   
        
        int numero1 = 1; 
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        
        System.out.println("numeroUm é maior que numeroDois?" + simNao);


   
}


    }
