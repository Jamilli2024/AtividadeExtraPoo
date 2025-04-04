 public class Papagaio extends Animal {

	private String corPenas;
	private boolean podeFalar;
    private String origem;
    private double alturaVoo;

    public Papagaio(){}

    public Papagaio(String nome, int idade, String corPenas, boolean podeFalar, String origem, double alturaVoo){
        super(nome, idade);
        this.corPenas = corPenas;
        this.podeFalar = podeFalar;
        this.origem = origem;
        this.alturaVoo = alturaVoo;
    }

    public String getCorPenas(){
        return corPenas;
    }

    public void setCorPenas(String corPenas){
        this.corPenas = corPenas;
    }

    public boolean getPodeFalar(){
        return podeFalar;
    }

    public void setPodeFalar(boolean podeFalar){
        this.podeFalar = podeFalar;
    }

    public String getOrigem(){
        return origem;
    }

    public void setOrigem(String origem){
        this.origem = origem;
    }

    public double getAlturaVoo(){
        return alturaVoo;
    }

    public void setAlturaVoo(double alturaVoo){
        this.alturaVoo = alturaVoo;
    }

    @Override
    public void emitirSom(){
        System.out.println("curupaco paco");
    }
}
 