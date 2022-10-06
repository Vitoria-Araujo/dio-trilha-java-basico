
public class OperadoresRelacionais {
 public static void main(String[] args) {
    String nomeUm = "Vitória";
    String nomeDois = new String("Vitória");

    System.out.println(nomeUm.equals(nomeDois));



    int num1 = 1;
    int num2 = 2;

    boolean simNao = num1 == num2;

    if(num1 == num2){ //true
        System.out.println(" A nossa condição é verdadeira");
    }


    System.out.println("numero um é igual ao numero dois?" + simNao);

    simNao = num1 != num2;
    System.out.println("numero um é diferente ao numero dois?" + simNao);

    simNao = num1 > num2;
    System.out.println("numero um é maior ao numero dois?" + simNao);



    
 }   
}
