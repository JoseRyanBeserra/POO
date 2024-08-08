
import entidades.Produto;
import org.junit.jupiter.api.Test;
import sistema.SistemaComercialMap;
import categoria.Categoria;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SistemaComercialMapTest {

    @Test
    public void testaCadastroProdutos() {
        SistemaComercialMap sistema = new SistemaComercialMap();
        Produto novoProduto = new Produto("abc", "bomba mofi", 2.5,1,Categoria.ALIMENTO);
        sistema.cadastraProduto(novoProduto);
        ArrayList<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(Categoria.ALIMENTO);
        assertTrue(alimentos.size()==1);
        assertTrue(sistema.existeProduto(novoProduto));

    }

}