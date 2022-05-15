public class Velocidade {

    double ulterro = 0, integral = 0, kp, kd, ki;

    Velocidade(double kp,double kd,double ki){
        this.kp = kp;
        this.kd = kd;
        this.ki = ki;
    }
    
    double getPower(double velocidadeAlvo, int posicao, int ultposicao){

        double velocidade = (posicao - ultposicao)/0.02;

        double erro = velocidadeAlvo - velocidade;

        double derivada = (erro - ulterro)/0.02;
        ulterro = erro;

        //integral = erro*0.02+integral;

        return erro*kp + derivada*kd /*+ integral*ki*/;
    }
}
