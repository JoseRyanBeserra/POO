import entities.Amigo;
import entities.Mensagem;
import org.junit.jupiter.api.Test;
import sistema.SistemaAmigoMap;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaSistemaAmigoMap {

    @Test
    public void testaCadastraAmigo(){
        Map<String, Amigo> amigoMap = new HashMap<>();
        Map<Integer, Mensagem> mensagemMap = new HashMap<>();
        SistemaAmigoMap sistema = new SistemaAmigoMap(amigoMap, mensagemMap);
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