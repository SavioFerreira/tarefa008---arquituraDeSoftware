package entity;

public class MensagemSingletonAnsiosa {

    private static final MensagemSingletonAnsiosa instancia = new MensagemSingletonAnsiosa("Mensagem padrão");
    private String mensagem;
    private MensagemSingletonAnsiosa(String msg){
        this.mensagem = msg;
    }

    public static MensagemSingletonAnsiosa getInstancia(){
        return instancia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
