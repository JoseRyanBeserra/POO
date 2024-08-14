import java.util.ArrayList;
public class SistemaConcessionaria {
    private ArrayList<Veiculo> listaDeVeiculos;
    public SistemaConcessionaria(ArrayList<Veiculo> listaDeVeiculos){
        this.listaDeVeiculos = listaDeVeiculos;
    }
    public void addVeiculo(Veiculo veiculo){
        this.listaDeVeiculos.add(veiculo);
    }
    public void removeVeiculo(Veiculo veiculo){
        this.listaDeVeiculos.remove(veiculo);
    }
    public void ordenaListaDeVeiculos(){
        Veiculo maiorVeiculo = new Veiculo();
        ArrayList<Veiculo> listaDeVeiculos1 = new ArrayList<>();
        for (Veiculo v:this.listaDeVeiculos) {
            maiorVeiculo = v;
            for(Veiculo veiculo: this.listaDeVeiculos){
                if(maiorVeiculo.getValor()>veiculo.getValor()){
                    maiorVeiculo = v;
                }
            }
            listaDeVeiculos1.add(maiorVeiculo);
            this.listaDeVeiculos.remove(maiorVeiculo);
        }
        this.listaDeVeiculos = listaDeVeiculos1;
    }
}
