package entidades;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(String nome, String endereco, String email, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String getId() {
        return this.cpf;
    }
}