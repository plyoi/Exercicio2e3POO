package br.ufpb.amigosecreto;

public class MensagemParaTodos extends Mensagem {
    private String emailDestinatario;
    public MensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima ) {
        super(texto, emailRemetente, ehAnonima);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
    public String getTextoCompletoAExibir() {
        if (!super.ehAnonima()){
            return "br.ufpb.amigosecreto.Mensagem de: "
                    +super.getEmailRemetente()
                    + " para "+this.getEmailDestinatario()
                    + " texto: " + super.getTexto();
        } else {
            return "br.ufpb.amigosecreto.Mensagem para "
                    +this.getEmailDestinatario()
                    + " texto: " + super.getTexto();
        }
    }
}
