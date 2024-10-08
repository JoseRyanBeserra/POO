package sistema;

import entities.Amigo;
import entities.Mensagem;
import entities.tipoMensagem.MensagemParaAlguem;
import entities.tipoMensagem.MensagemParaTodos;
import exceptions.JaTemAmigoSecretoException;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {

    private ArrayList<Amigo> amigoArrayList;
    private ArrayList<Mensagem> mensagemArrayList;

    public SistemaAmigo(ArrayList<Amigo> listaAmigo, ArrayList<Mensagem> listaMensagem){
        this.amigoArrayList = listaAmigo;
        this.mensagemArrayList = listaMensagem;
    }

    public void cadastraAmigo(String nome, String email){
        Amigo novoAmigo = new Amigo(nome, email);
        amigoArrayList.add(novoAmigo);
    }

    public Amigo pesquisaAmigo(String emailAmigo){
        for(Amigo amigo: amigoArrayList){
            if(amigo.getEmail().equals(emailAmigo)){
                return amigo;
            }
        }
        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
        Mensagem mensagemParaTodos = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        mensagemArrayList.add(mensagemParaTodos);
        mensagemParaTodos.getTextoCompletoAExibir();
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        Mensagem mensagemParaAlguem = new MensagemParaAlguem(texto,emailRemetente,emailDestinatario,ehAnonima);
        mensagemArrayList.add(mensagemParaAlguem);
        mensagemParaAlguem.getTextoCompletoAExibir();
    }

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new ArrayList<>();
        for(Mensagem mensagem:mensagemArrayList){
            if(mensagem.ehAnonima()){
                mensagensAnonimas.add(mensagem);
            }
        }
        return mensagensAnonimas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens(){
        return mensagemArrayList;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws JaTemAmigoSecretoException {
        Amigo amigo = pesquisaAmigo(emailDaPessoa);
        if(amigo.getEmailAmigoSorteado() == null){
            amigo.setEmailAmigoSorteado(emailAmigoSorteado);
        }
        throw new JaTemAmigoSecretoException("Pessoa ja tem amigo secreto");
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa){
        for(Amigo amigo:amigoArrayList){
            if(amigo.getEmail().equals(emailDaPessoa)){
                return amigo.getEmailAmigoSorteado();
            }
        }
        return null;
    }
}