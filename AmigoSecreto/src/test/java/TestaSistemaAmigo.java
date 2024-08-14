import entities.Amigo;
import entities.Mensagem;
import org.junit.jupiter.api.Test;
import sistema.SistemaAmigo;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

public class TestaSistemaAmigo {
    @Test
    public void testaCadastraAmigo(){
        ArrayList<Amigo> amigoArrayList = new ArrayList<>();
        ArrayList<Mensagem> mensagemArrayList = new ArrayList<>();
        SistemaAmigo sistema = new SistemaAmigo(amigoArrayList, mensagemArrayList);
        sistema.cadastraAmigo("jose", "jose@email.com");
        sistema.cadastraAmigo("maria", "maria@email.com");
        assertEquals(sistema.pesquisaAmigo("jose@email.com").getNome(), "jose");
        assertEquals(sistema.pesquisaAmigo("maria@email.com").getNome(), "maria");
        sistema.pesquisaAmigo("jose@email.com").setEmailAmigoSorteado("maria@email.com");
        assertEquals(sistema.pesquisaAmigo("jose@email.com").getEmailAmigoSorteado(), "maria@email.com");
        sistema.pesquisaAmigo("maria@email.com").setEmailAmigoSorteado("jose@email.com");
        assertEquals(sistema.pesquisaAmigo("maria@email.com").getEmailAmigoSorteado(), "jose@email.com");
        sistema.enviarMensagemParaAlguem("Oi","maria@email.com", "jose@email.com", true);
        assertEquals(sistema.pesquisaMensagensAnonimas().size(), 1);
        sistema.enviarMensagemParaAlguem("Oi","jose@email.com", "maria@email.com", true);
        assertEquals(sistema.pesquisaMensagensAnonimas().size(), 2);
        for(Mensagem mensagem:sistema.pesquisaMensagensAnonimas()){
            System.out.println(mensagem.getTextoCompletoAExibir());
        }
        if(sistema.pesquisaAmigoSecretoDe("jose@email.com").equals("maria@email.com"));
        System.out.println("OK");
    }
}
