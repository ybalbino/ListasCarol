public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault(2019, 35000, "Prata", 4, 0);
        Fiat fiat = new Fiat(2020, 30000, "Vermelho", 4, 3);
        Hyundai hyundai = new Hyundai(2021, 45000, "Branco", 4, 5);

        renault.iniciarMotor();
        renault.acelerar();
        renault.frear();
        renault.frear();

        System.out.println();

        fiat.iniciarMotor();
        fiat.acelerar();
        fiat.frear();

        System.out.println();

        hyundai.iniciarMotor();
        hyundai.acelerar();
        hyundai.acelerar();
        hyundai.frear();
    }
}