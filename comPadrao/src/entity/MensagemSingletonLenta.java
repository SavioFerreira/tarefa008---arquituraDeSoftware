package entity;

public class MensagemSingletonLenta {
    private static MensagemSingletonLenta instancia;
    private String mensagem;
    private MensagemSingletonLenta(String msg){
        this.mensagem = msg;
    }
    public static MensagemSingletonLenta getInstancia(){
        if (instancia == null){
            instancia = new MensagemSingletonLenta("Mensagem padrão");
        }
        return instancia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
