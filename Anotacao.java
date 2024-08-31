public class Anotacao {

    private int id, data;
    private String assunto, conteudo;

    private Anotacao(){
        ////
    }

    public int mostraId(){
        return this.id;
    }

    public int mostraData(){
        return this.data;
    }
    
    public String mostraAssunto(){
        return this.assunto;
    }

    public String mostraConteudo(){
        return this.conteudo;
    }

    public void defineId(int id){
        this.id = id;
    }

    public void defineData(int data){
        this.data = data;
    }
    
    public void mdefineAssunto(String assunto){
        this.assunto = assunto;
    }

    public void defineConteudo(String conteudo){
        this.conteudo = conteudo;
    }

}
