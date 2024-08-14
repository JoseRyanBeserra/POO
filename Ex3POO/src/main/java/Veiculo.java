public class Veiculo implements Comparable<Veiculo>{
    protected int quilometragem;
    protected String fabricante;
    protected String placa;
    protected double valor;

    public Veiculo(){
        this.quilometragem = 0;
        this.fabricante = "";
        this.placa = "";
        this.valor = 0.0;
    }
    public int getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Veiculo outroVeiculo){
        return this.placa.compareTo(outroVeiculo.getPlaca());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}