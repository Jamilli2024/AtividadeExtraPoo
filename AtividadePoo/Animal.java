public class Animal {
    private String nome;
    private int idade;

    public Animal(){

    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public string getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade)throws Exception{
        if(idade <0) {
            throw new Exception();
        }

    }

    public void emitirSom(){}
}
