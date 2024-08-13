package entities;

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

}