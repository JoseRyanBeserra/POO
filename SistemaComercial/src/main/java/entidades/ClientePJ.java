package entidades;

public class ClientePJ extends Cliente{

    private String cnpj;

    public ClientePJ(String nome, String endereco, String email, String cnpj){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cnpj = cnpj;
    }

    @Override
    public String getId() {
        return this.cnpj;
    }
}