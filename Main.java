import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while (sair == false){
            System.out.println("*******************************");
            System.out.println("* 1 -> Isso    | 2 -> Aquilo  *");
            System.out.println("* 3 -> Naquilo | 4 -> Daquilo *");
            System.out.println("* 0 -> Sair                   *");
            System.out.println("*******************************");
            System.out.println("Digite a  opção desejada: ");
            int op = sc.nextInt();

            switch (op) {
                case 0:
                    sair = true;
                    System.out.println("Saindo");
                    break;
                case 1:
                    System.out.println("Opcao 01");
                    break;
                case 2:
                    System.out.println("Opcao 01");
                    break;
                case 3:
                    System.out.println("Opcao 01");
                    break;
                case 4:
                    System.out.println("Opcao 01");
                    break;
                default:
                    break;
            }


        }
    }
}