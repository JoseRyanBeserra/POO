public class Moto extends Veiculo{
    private
    int cilindradas;

    public Moto(int cilindradas,int quilometragem, String placa, String fabricante, double valor){
        this.cilindradas = cilindradas;
        this.quilometragem = quilometragem;
        this.placa = placa;
        this.fabricante = fabricante;
        this.valor = valor;
    }
    public Moto(){
        this.cilindradas = 0;
        this.quilometragem = 0;
        this.placa = "";
        this.fabricante = "";
        this.valor = 0.0;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
}
