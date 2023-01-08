public class RestoDiv {
    public static void main(String[] args) {
        //FAÇA UM PROGRAMA QUE MOSTRE O RESTO DA DIVISAO DE 2 NÚMEROS QUEBRADOS
        double a = 3.2;
        double b = 1.5;
        double restoDaDivisao = a % b;
        //Formata em duas casas decimais( função é String.format)
        System.out.println(" Resto: " + String.format("%.2f",restoDaDivisao));
    }
}
