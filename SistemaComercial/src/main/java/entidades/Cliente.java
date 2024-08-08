package entidades;

public abstract class Cliente {

    protected String nome;
    protected String endereco;
    protected String email;

    public abstract String getId();

    public Cliente(String nome, String endereco, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Cliente(){
        this.nome = "";
        this.endereco = "";
        this.email = "";
    }

    @Override
    public String toString() {
        return "Cliente: " + "nome = " + nome + ", endereco = " + endereco + ", email = " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}