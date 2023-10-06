import java.util.Scanner;

public class Menu {
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma ação:");
        System.out.println("1. Mover para cima");
        System.out.println("2. Mover para baixo");
        System.out.println("3. Mover para a esquerda");
        System.out.println("4. Mover para a direita");
        System.out.println("5. Atacar inimigo");
        System.out.println("6. Usar habilidade");
        System.out.println("7. Usar item");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }
}
