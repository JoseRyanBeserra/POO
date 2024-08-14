package sistema;

import entities.Amigo;
import entities.Mensagem;
import entities.tipoMensagem.MensagemParaAlguem;
import entities.tipoMensagem.MensagemParaTodos;
import exceptions.JaTemAmigoSecretoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SistemaAmigoMap {
    // amigoMap recebe o email como key
    private Map<String, Amigo> amigoMap;

    //mensagemMap recebe o hashCode da Mensagem como key
    private Map<Integer, Mensagem> mensagemMap;

    public SistemaAmigoMap(Map<String, Amigo> mapAmigo, Map<Integer, Mensagem> mapMensagem){
        this.amigoMap = mapAmigo;
        this.mensagemMap = mapMensagem;
    }

    public void cadastraAmigo(String nome, String email){
        Amigo amigo = new Amigo(nome, email);
        amigoMap.put(email, amigo);
    }
    public Amigo pesquisaAmigo(String email){
        if(amigoMap.containsKey(email)){
            return amigoMap.get(email);
        }
        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
        Mensagem mensagemParaTodos = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        mensagemMap.put(mensagemParaTodos.hashCode(),mensagemParaTodos);
        mensagemParaTodos.getTextoCompletoAExibir();
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        Mensagem mensagemParaAlguem = new MensagemParaAlguem(texto,emailRemetente,emailDestinatario,ehAnonima);
        mensagemMap.put(mensagemParaAlguem.hashCode(), mensagemParaAlguem);
        mensagemParaAlguem.getTextoCompletoAExibir();
    }

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new ArrayList<>();
        for(Mensagem mensagem:mensagemMap.values()){
            if(mensagem.ehAnonima()){
                mensagensAnonimas.add(mensagem);
            }
        }
        return mensagensAnonimas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens(){
        ArrayList<Mensagem> listaMensagem = new ArrayList<>();
        for(Mensagem mensagem:mensagemMap.values()){
            listaMensagem.add(mensagem);
        }
        return listaMensagem;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws JaTemAmigoSecretoException {
        Amigo amigo = pesquisaAmigo(emailDaPessoa);
        if(amigo.getEmailAmigoSorteado() == null){
            amigo.setEmailAmigoSorteado(emailAmigoSorteado);
        }
        throw new JaTemAmigoSecretoException("Pessoa ja tem amigo secreto");
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa){
        for(Amigo amigo: amigoMap.values()){
            if(amigo.getEmail().equals(emailDaPessoa)){
                return amigo.getEmailAmigoSorteado();
            }
        }
        return null;
    }
}
