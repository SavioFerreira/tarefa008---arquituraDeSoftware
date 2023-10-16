package instantiation;

import entity.MensagemSingletonBlocoEstatico;
public class MainBlocoEstatico {

    public static void main(String[] args) {

        MensagemSingletonBlocoEstatico mensagem = MensagemSingletonBlocoEstatico.getInstancia();
        MensagemSingletonBlocoEstatico mensagem2 = MensagemSingletonBlocoEstatico.getInstancia();

        System.out.println("Singleton - Versão Bloco estático");

        System.out.println(mensagem.getMensagem());
        System.out.println(mensagem2.getMensagem());

        mensagem.setMensagem("mensagem um alterada primeira vez");
        mensagem2.setMensagem("mensagem dois alterada primeira vez");

        System.out.println(mensagem2.getMensagem());
        System.out.println(mensagem.getMensagem());

    }
}
