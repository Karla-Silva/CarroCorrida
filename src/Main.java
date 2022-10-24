public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Andre", 20, Sexo.MASCULINO, "Rocket");
        Piloto piloto2 = new Piloto("Bruna", 25, Sexo.FEMININO, "Rocket");

        CarroCorrida carro1 = new CarroCorrida(1, piloto1, 100, 50, true);
        CarroCorrida carro2 = new CarroCorrida(2, piloto2, 80, 0, false);

        carro1.acelerar(10);
        System.out.println(carro1.getVelocidadeAtual());
        carro1.acelerar(70);
        System.out.println(carro1.getVelocidadeAtual());

        carro2.acelerar(10);
        carro2.frear(10);

        carro1.frear(20);
        System.out.println(carro1.getVelocidadeAtual());
        carro1.frear(50);
        System.out.println(carro1.getVelocidadeAtual());

        carro1.parar();
        System.out.println(carro1.getVelocidadeAtual());

        carro2.ligar();
        carro1.desligar();
        System.out.println(carro1);
        System.out.println(carro2);
    }
}
