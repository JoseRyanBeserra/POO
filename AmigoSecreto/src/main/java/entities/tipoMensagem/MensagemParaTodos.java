package entities.tipoMensagem;

import entities.Mensagem;

public class MensagemParaTodos extends Mensagem {

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonimo) {
        super(texto, emailRemetente, anonimo);
    }

    @Override
    public String getTextoCompletoAExibir() {
        if(ehAnonima()){
            return "Mensagem para todos, Texto: "+this.texto;
        }
        return "Mensagem de "+this.emailRemetente+" para todos, Texto: "+ this.texto;
    }
}
