package instantiation;

import entity.Mensagem;

public class Main {
    public static void main(String[] args) {

        Mensagem mensagem1 = new Mensagem("Mensagem padrão");
        Mensagem mensagem2 = new Mensagem("Mensagem alterada");

        System.out.println(mensagem1.getMensagem());
        System.out.println(mensagem2.getMensagem());

        mensagem1.setMensagem("mensagem um Alterada");
        mensagem2.setMensagem("mensagem dois alterada");

        System.out.println();
        System.out.println(mensagem1.getMensagem());
        System.out.println(mensagem2.getMensagem());
    }

}