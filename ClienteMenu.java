import java.util.Scanner;

public class ClienteMenu {
    ClienteMenu(){
        ////
    }
    public static void openMenu() {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (sair == false){
            System.out.println("*********************************");
            System.out.println("* 1 -> Cadastrar | 2 -> Buscar  *");
            System.out.println("* 3 -> Atualizar | 4 -> Remover *");
            System.out.println("* 0 -> Sair                     *");
            System.out.println("*********************************");
            System.out.println("Digite a  opção desejada: ");
            int op = sc.nextInt();
            sc.close();

            switch (op) {
                case 0:
                    sair = true;
                    System.out.println("Saindo!");
                    break;
                case 1:
                    System.out.println("Cadastrar");
                    break;
                case 2:
                    System.out.println("Buscar");
                    break;
                case 3:
                    System.out.println("Atualizar");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    break;
            }
        }
    }
}

