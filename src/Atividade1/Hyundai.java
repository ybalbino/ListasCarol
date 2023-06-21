import Atividade1.Carros;

public class Hyundai extends Carros {
    public Hyundai(int ano, double valor, String cor, int portas, int velocidade) {
        super("Hyundai", ano, valor, cor, portas, velocidade);
    }

    @Override
    public void iniciarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        System.out.println("Freando... minha velocidade está em " + getVelocidade() + " km/h");
        setVelocidade(getVelocidade() - 2);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade() + " km/h");
        setVelocidade(getVelocidade() + 15);
    }
}
