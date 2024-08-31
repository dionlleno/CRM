public class Imovel {

    private int id, cep;
    private String endereco, situacao;

    private Imovel(){
        ////
    }

    public int mostraId(){
        return this.id;
    }

    public String mostrasituacao(){
        return this.situacao;
    }

    public String mostraEndereco(){
        return this.endereco;
    }

    public int mostraCep(){
        return this.cep;
    }

    public void defineId(int id){
        this.id = id;
    }

    public void definesituacao(String situacao){
        this.situacao = situacao;
    }

    public void defineEndereco(String endereco){
        this.endereco = endereco;
    }

    public void defineCep(int cep){
        this.cep = cep;
    }


}
