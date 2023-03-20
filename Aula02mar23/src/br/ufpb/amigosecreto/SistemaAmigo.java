package br.ufpb.amigosecreto;

import java.util.LinkedList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;
    public SistemaAmigo(){
        mensagens = new LinkedList<>();
        amigos = new LinkedList<>();
    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new LinkedList<>();
        for (Mensagem m: this.mensagens){
            if (m.ehAnonima()){
                mensagensAnonimas.add(m);
            }
        }
        return mensagensAnonimas;
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return this.mensagens;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        for (Amigo amigo: this.amigos){
            if (amigo.getEmail().equals(emailDaPessoa)){
                amigo.setEmailAmigoSorteado(emailAmigoSorteado);
                return;
            }
        }
        throw new AmigoInexistenteException("Não existe pessoa na brincadeira com o email: "+emailDaPessoa);
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException{
        for (Amigo amigo: this.amigos){
            if (amigo.getEmail().equals(emailDaPessoa)){
                if (amigo.getEmailAmigoSorteado()==null){
                    throw new AmigoNaoSorteadoException("Não foi sorteado o amigo da pessoa com email "+emailDaPessoa);
                } else {
                    return amigo.getEmailAmigoSorteado();
                }
            }
        }
        throw new AmigoInexistenteException("Não existe pessoa na brincadeira com o email: "+emailDaPessoa);
    }
}
