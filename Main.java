import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while (sair == false){
            System.out.println("*********************************");
            System.out.println("* 1 -> Cliente   | 2 -> Imovel  *");
            System.out.println("* 3 -> Anotacoes | 4 -> Visitas *");
            System.out.println("* 0 -> Sair                     *");
            System.out.println("*********************************");
            System.out.println("Digite a  opção desejada: ");
            int op = sc.nextInt();
            sc.close();

            switch (op) {
                case 0:
                    sair = true;
                    System.out.println("Saindo!");
                    ClienteMenu.openMenu();
                    break;
                case 1:
                    System.out.println("Clinte");
                    break;
                case 2:
                    System.out.println("Imovel");
                    break;
                case 3:
                    System.out.println("Anotacoes");
                    break;
                case 4:
                    System.out.println("Visitas");
                    break;
                default:
                    break;
            }


        }
    }
}