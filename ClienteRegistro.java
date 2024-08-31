public class ClienteRegistro {
    public void cadastrar(int clienteId, Cliente cliente){
        if (cliente.mostraNome().length() > 50){
            System.out.println("Nome possui mais de 50 caracteres.");
        }
        if (cliente.mostraEmail().contains(" ")){
            System.out.println("Nome possui mais de 50 caracteres.");
        }
    }
}
