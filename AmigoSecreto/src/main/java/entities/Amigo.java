package entities;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Amigo: " + "email = " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amigo amigo = (Amigo) o;
        return Objects.equals(nome, amigo.nome) && Objects.equals(email, amigo.email) && Objects.equals(emailAmigoSorteado, amigo.emailAmigoSorteado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, emailAmigoSorteado);
    }
}