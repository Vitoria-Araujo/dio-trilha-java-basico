import java.util.Scanner;

public class LeitorNome {
    public static void main(String[] args) {
        //FAÇA UM PROGRAMA QUE LEIA UM NOME E UM SOBRENOME E IMPRIMA NA TELA
        String nome, surname;

        Scanner leitor = new Scanner (System.in);

        System.out.println("Qual o seu nome? ");
        nome = leitor.nextLine();
        
        System.out.println("Qual o seu sobrenome? ");
        surname = leitor.nextLine();
        
        System.out.println( "Seu nome é :" + nome +" "+ surname);
    }
}
