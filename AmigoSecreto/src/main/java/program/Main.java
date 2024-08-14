package program;

import entities.Mensagem;
import entities.Amigo;
import sistema.SistemaAmigo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ArrayList<Amigo> listaAmigos = new ArrayList<>();
        ArrayList<Mensagem> listaMensagens = new ArrayList<>();
        SistemaAmigo sistema = new SistemaAmigo(listaAmigos, listaMensagens);

        Scanner in = new Scanner(System.in);

        sistema.cadastraAmigo("zeca", "zeca@email.com");
        sistema.cadastraAmigo("chico", "chico@email.com");
        sistema.cadastraAmigo("maria", "maria@email.com");
        sistema.cadastraAmigo("marta", "marta@email.com");

        int quantAmigos = 4;

        //sorteia pode ser um metodo
        Random random = new Random();
        ArrayList<Amigo> listaAmigoSorteio = new ArrayList<>();
        listaAmigoSorteio = listaAmigos;
        for(int i=0;i<quantAmigos;i++){
            boolean go = true;
            while (go) {
                int numeroRandom = random.nextInt(0, listaAmigos.size());

                if ((listaAmigos.get(numeroRandom).getEmailAmigoSorteado() == null)) {
                    if(listaAmigoSorteio.get(numeroRandom)!=listaAmigos.get(i)) {
                        listaAmigos.get(numeroRandom).setEmailAmigoSorteado(listaAmigoSorteio.get(i).getEmail());
                        go = false;
                    }
                }
            }
        }

        for(Amigo amigo: listaAmigos){
            System.out.println(amigo.getNome()+" pegou "+amigo.getEmailAmigoSorteado());
        }

        sistema.enviarMensagemParaTodos("Oi gente", "maria@email.com",false);

    }
}
