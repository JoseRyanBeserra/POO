package sistema;

import categoria.Categoria;
import entidades.Cliente;
import entidades.Produto;
import exception.ClienteNaoExisteException;
import exception.ProdutoNaoExisteException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComercialMap {
    private Map <String, Cliente> clientes;
    private Map <String, Produto> produtos;

    public SistemaComercialMap(){
        this.clientes = new HashMap<String, Cliente>();
        this.produtos = new HashMap<String, Produto>();
    }

    public boolean existeProduto(Produto produto){
        if(this.produtos.containsKey(produto.getCodigo())){
            return true;
        }
        return false;
    }

    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        if(this.produtos.containsKey(codigoProduto)){
            return produtos.get(codigoProduto);
        }
        throw new ProdutoNaoExisteException("Produto não encontrado");
    }

    public boolean cadastraProduto(Produto produto){
        if(existeProduto(produto)){
            return false;
        }
        produtos.put(produto.getCodigo(), produto);
        return true;
    }

    public boolean existeCliente(Cliente cliente){
        if(clientes.containsKey(cliente)){
            return true;
        }
        return false;
    }

    public boolean cadastraCliente(Cliente cliente){
        if(existeCliente(cliente)){
            return false;
        }
        clientes.put(cliente.getId(), cliente);
        return true;
    }

    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        if(clientes.containsKey(id)){
            return clientes.get(id);
        }
        throw new ClienteNaoExisteException("Cliente não encontrado");
    }

    public Collection<Produto> pesquisaProdutosDaCategoria(Categoria categoria){
        Collection<Produto> produtosList = new ArrayList<>();
        for(Produto produto: produtos.values()){
            if(produto.getCategoriaProduto().equals(categoria)){
                produtosList.add(produto);
            }
        }
        return produtosList;
    }
    public Collection<Cliente> pesquisaClienteComONomeComecandoCom(String prefixo){
        Collection<Cliente> clientesList = new ArrayList<>();
        for(Cliente cliente: clientes.values()){
            if(cliente.getNome().startsWith(prefixo)){
                clientesList.add(cliente);

            }
        }
        return clientesList;
    }
}