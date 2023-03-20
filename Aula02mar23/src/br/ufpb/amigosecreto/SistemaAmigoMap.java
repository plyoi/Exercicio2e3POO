package br.ufpb.amigosecreto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAmigoMap {

    private List<Mensagem> mensagens;
    private Map<String, Amigo> amigosMap;

    public SistemaAmigoMap() {
        this.mensagens = new ArrayList<>();
        this.amigosMap = new HashMap<>();
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
        //TODO
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        //TODO
    }

    public void cadastraAmigo(String nome, String email) throws AmigoJaExisteException {
        if (this.amigosMap.containsKey(email)) {
            throw new AmigoJaExisteException();
        } else {
            Amigo amigo = new Amigo(nome, email);
            this.amigosMap.put(email, amigo);
        }
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        //TODO
        return null;
    }

}