import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniChatbot chatbot = new MiniChatbot();
        boolean continuar = true;
        int num;

        System.out.println("Digite algo para começar: ");
        chatbot.iniciar = scanner.nextLine();
        chatbot.saudacoes();


        while(continuar){

            System.out.println("Pergunte-me algo");
            chatbot.guardarPerguntas = scanner.nextLine();
            chatbot.perguntas();

            System.out.println("deseja continuar?");
            System.out.println("1 - sim ");
            System.out.println("0 - não");
            num = scanner.nextInt();
            scanner.nextLine();

            if (num == 0){
                continuar = false;
            }

        }
    }
}