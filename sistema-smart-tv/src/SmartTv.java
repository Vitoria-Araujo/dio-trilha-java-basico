public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Criando os metodos que manipulam esses status

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada=true;

    }
    public void desligar(){
        ligada=false;

    }
}
