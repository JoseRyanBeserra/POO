public class Carro extends Veiculo{
    private int quantPortas;

    public Carro(){
        this.quilometragem = 0;
        this.fabricante = "";
        this.placa = "";
        this.valor = 0.0;
        this.quantPortas = 0;
    }
    public Carro(int quilometragem, String placa, String fabricante, double valor, int quantPortas){
        this.quilometragem = quilometragem;
        this.placa = placa;
        this.fabricante = fabricante;
        this.valor = valor;
        this.quantPortas = quantPortas;
    }
    public int getQuantPortas() {
        return this.quantPortas;
    }
    public void setQuantPortas(int quantPortas){
        this.quantPortas = quantPortas;
    }

}