package instantiation;

import entity.MensagemSingletonLenta;

public class MainLento {
    public static void main(String[] args) {
        MensagemSingletonLenta mensagem = MensagemSingletonLenta.getInstancia();
        MensagemSingletonLenta mensagem2 = MensagemSingletonLenta.getInstancia();

        System.out.println("Singleton - Versão lenta/preguiçosa");

        System.out.println(mensagem.getMensagem());
        System.out.println(mensagem2.getMensagem());

        mensagem.setMensagem("mensagem um alterada primeira vez");
        mensagem2.setMensagem("mensagem dois alterada primeira vez");

        System.out.println(mensagem2.getMensagem());
        System.out.println(mensagem.getMensagem());
    }

}
