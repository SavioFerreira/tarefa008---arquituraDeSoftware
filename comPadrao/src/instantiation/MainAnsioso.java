package instantiation;

import entity.MensagemSingletonAnsiosa;

public class MainAnsioso {
    public static void main(String[] args) {

        MensagemSingletonAnsiosa mensagem = MensagemSingletonAnsiosa.getInstancia();
        MensagemSingletonAnsiosa mensagem2 = MensagemSingletonAnsiosa.getInstancia();

        System.out.println("Singleton - Versão Ansioso");

        System.out.println(mensagem.getMensagem());
        System.out.println(mensagem2.getMensagem());

        mensagem.setMensagem("mensagem um alterada primeira vez");
        mensagem2.setMensagem("mensagem dois alterada primeira vez");

        System.out.println(mensagem2.getMensagem());
        System.out.println(mensagem.getMensagem());

    }
}