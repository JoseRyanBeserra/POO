package entities;

import java.util.Objects;

public abstract class Mensagem {

    protected String texto;
    protected String emailRemetente;
    protected boolean anonimo;

    public Mensagem(String texto, String emailRemetente, boolean anonimo) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonimo = anonimo;
    }

    public abstract String getTextoCompletoAExibir();

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public boolean ehAnonima(){
        return this.anonimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem = (Mensagem) o;
        return anonimo == mensagem.anonimo && Objects.equals(texto, mensagem.texto) && Objects.equals(emailRemetente, mensagem.emailRemetente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, emailRemetente, anonimo);
    }
}