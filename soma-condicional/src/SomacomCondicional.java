import java.util.Scanner;

public class SomacomCondicional {

    
	public static void main (String[] args) {
        
         // FAÇA UM PROGRAMA QUE LEIA 2 NÚMEROS INTEIROS E
        // IMPRIMA NA TELA SE A SOMA ENTRE ELES FOR MAIOR QUE 10
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int a = leitor.nextInt();//declara a variavel junto com o leitor
        
        System.out.println("Digite um número: ");
        int b= leitor.nextInt();//declara a variavel junto com o leitor
        
        
        int soma = a + b; // Declara variável soma
        
        
        
        if(soma > 10){
          System.out.println ("Soma maior que 10" +  " " + "Total: " + soma);
        }
        else {
        	
          System.out.println("Menor");
        }
   } 
 }  

