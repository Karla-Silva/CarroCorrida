public class CarroCorrida {
     private int numeroCarro;
     private Piloto piloto;
     private float velocidadeMaxima;
     private float velocidadeAtual;
     private boolean ligado;

     public CarroCorrida(int numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado){
          this.numeroCarro = numeroCarro;
          this.piloto = piloto;
          this.velocidadeMaxima = velocidadeMaxima;
          this.velocidadeAtual = velocidadeAtual;
          this.ligado = ligado;
     }

     public int getNumeroCarro() {
          return numeroCarro;
     }

     public void setNumeroCarro(int numeroCarro) {
          this.numeroCarro = numeroCarro;
     }

     public Piloto getPiloto() {
          return piloto;
     }

     public void setPiloto(Piloto piloto) {
          this.piloto = piloto;
     }

     public float getVelocidadeMaxima() {
          return velocidadeMaxima;
     }

     public void setVelocidadeMaxima(float velocidadeMaxima) {
          this.velocidadeMaxima = velocidadeMaxima;
     }

     public float getVelocidadeAtual() {
          return velocidadeAtual;
     }

     private void setVelocidadeAtual(float velocidadeAtual) {
          if (velocidadeAtual<=getVelocidadeMaxima() && velocidadeAtual>=0){
               this.velocidadeAtual = velocidadeAtual;
          } else if(velocidadeAtual<0){
               System.out.println("A velocidade não pode ser menor que zero.");
          } else{
               System.out.println("A velocidade máxima não pode ser ultrapassada.");
          }
     }

     public boolean getLigado(){
          return ligado;
     }

     private void setLigado(boolean ligado) {
          this.ligado = ligado;
     }

     @Override
     public String toString() {
          return "CarroCorrida{" +
                  "numeroCarro=" + numeroCarro +
                  ", piloto=" + piloto +
                  ", velocidadeMaxima=" + velocidadeMaxima +
                  ", velocidadeAtual=" + velocidadeAtual +
                  ", ligado=" + ligado +
                  '}';
     }

     public void acelerar(float aumentoVelocidade){
          if (this.getLigado()){
               float novaVelocidade = this.getVelocidadeAtual() + aumentoVelocidade;
               this.setVelocidadeAtual(novaVelocidade);
          } else {
               System.out.println("Carro desligado. Não é possível acelerar.");
          }
     }

     public void frear(float reducaoVelocidade){
          if (this.getLigado()){
               float novaVelocidade = this.getVelocidadeAtual() - reducaoVelocidade;
               this.setVelocidadeAtual(novaVelocidade);
          } else {
               System.out.println("Carro desligado. Não é possível frear.");
          }
     }

     public void parar(){
          this.setVelocidadeAtual(0.0f);
     }

     public void ligar(){
          this.setLigado(true);
     }

     public void desligar(){
          if (this.getVelocidadeAtual()==0){
               this.setLigado(false);
          } else {
               System.out.println("O carro precisa estar parado para ser desligado.");
          }
     }
}
