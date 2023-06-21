package Atividade1;

import Atividade1.Carros;

public class Renault extends Carros {
    public Renault(int ano, double valor, String cor, int portas, int velocidade) {
        super("Renault", ano, valor, cor, portas, velocidade);
    }

    @Override
    public void iniciarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        System.out.println("Freando... minha velocidade está em " + getVelocidade() + " km/h");
        setVelocidade(getVelocidade() - 5);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade() + " km/h");
        setVelocidade(getVelocidade() + 10);
    }
}
