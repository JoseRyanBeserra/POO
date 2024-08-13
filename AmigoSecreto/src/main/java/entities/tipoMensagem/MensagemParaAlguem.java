package entities.tipoMensagem;

import entities.Mensagem;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonimo) {
        super(texto, emailRemetente, anonimo);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir() {
        if(ehAnonima()){
            return "Mensagem para "+this.emailDestinatario+", Texto: "+this.texto;
        }
        return "Mensagem de "+this.emailRemetente+" para "+this.emailDestinatario+", Texto: "+ this.texto;
    }
}