package aula04;

public class Caneta01 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta01(){
        this.modelo = "BIG";
        this.ponta = 0.4f;
        this.cor = "Salmão";
        this.tampar();
    }
    public String getmodelo(){
        return this.modelo ;
    }
    public void setModelo (String m){
        this.modelo=m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}

