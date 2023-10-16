package entity;

public class MensagemSingletonBlocoEstatico {
    private static MensagemSingletonBlocoEstatico instancia;
    private String mensagem;

    static {
        try {
            instancia = new MensagemSingletonBlocoEstatico("Mensagem padrão");
        } catch (Exception e){
            throw new RuntimeException("Ocorreu um erro: " + e.getMessage());
        }
    }
    private MensagemSingletonBlocoEstatico(String msg){
        this.mensagem = msg;
    }
    public static MensagemSingletonBlocoEstatico getInstancia(){
        return instancia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}