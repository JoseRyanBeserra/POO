package entities;

public class Amigo {

    private String nome;
    private String email;
    private String emailAmigoSorteado;

    public Amigo(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.emailAmigoSorteado = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmailAmigoSorteado(String email){
        this.emailAmigoSorteado = email;
    }
    public String getEmailAmigoSorteado(){
        return this.emailAmigoSorteado;
    }
}