public class MiniChatbot {

    String iniciar;
    String guardarPerguntas;

    public void saudacoes() {
        if (iniciar != " ") {
            System.out.println("Olá, tudo bem? Sou o MiniChatbot");
        }
    }

    public void perguntas() {


        if (guardarPerguntas.toLowerCase().contains("nome")) {
            System.out.println("Sou conhecido como MiniChatBot!");

        } else if (guardarPerguntas.toLowerCase().contains("como está") ||
                guardarPerguntas.toLowerCase().contains("como esta") ||
                guardarPerguntas.toLowerCase().contains("como voce esta") ||
                guardarPerguntas.toLowerCase().contains("como você está")) {
            System.out.println("Estou funcionando, obrigado por perguntar");

        } else if (guardarPerguntas.toLowerCase().contains("clima")) {
            System.out.println("Está muito calor, espero ter ajudado");
        } else if (
                !guardarPerguntas.toLowerCase().contains("nome") &&
                        !guardarPerguntas.toLowerCase().contains("como esta") &&
                        !guardarPerguntas.toLowerCase().contains("clima") &&
                        !guardarPerguntas.toLowerCase().contains("como voce está") &&
                        !guardarPerguntas.equals("1")

        ) {
            System.out.println("Não entendi sua pergunta");
        }

    }
}