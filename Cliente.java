public class Cliente {

    private int id, cep, telefone;
    private String nome, endereco, email;

    private Cliente(){
        ////
    }

    public int mostraId(){
        return this.id;
    }

    public String mostraNome(){
        return this.nome;
    }
    
    public int mostraTelefone(){
        return this.telefone;
    }

    public String mostraEndereco(){
        return this.endereco;
    }

    public int mostraCep(){
        return this.cep;
    }

    public String mostraEmail(){
        return this.email;
    }

    public void defineId(int id){
        this.id = id;
    }

    public void defineNome(String nome){
        this.nome = nome;
    }
    
    public void mdefineTelefone(int telefone){
        this.telefone = telefone;
    }

    public void defineEndereco(String endereco){
        this.endereco = endereco;
    }

    public void defineCep(int cep){
        this.cep = cep;
    }

    public void defineEmail(String email){
        this.email = email;
    }

}
