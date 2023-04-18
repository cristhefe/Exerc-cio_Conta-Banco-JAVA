package Banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t=="CC"){
            this.setSaldo(50);
        }else if(t=="CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso!");

    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro!");
        } else if (this.getSaldo()<0) {
            System.out.println("Conta em débito!");
        }else
            this.setStatus(false);
        System.out.println("Conta fechada com Sucesso!");
    }
    public void depositar(float v){
        if(this.getStatus()==true){
            this.setSaldo((int) (getSaldo() + v));
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar.");
        }

    }
    public void sacar(float v){
        if(this.getStatus()==true){
            if(this.getSaldo()>=v){
                this.setSaldo((int) (getSaldo()-v));
                System.out.println("Saldo realizado na conta " + this.getDono());
            }else {
                System.out.println("Saldo insuficente para saque.");
            }

            }else {
            System.out.println("Impossivel sacar!");
        }

    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo()=="CC"){
            v=12;

        }else if (this.getTipo()=="CP") {
            v = 20;
        }
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade Paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossivel pagar uma conta fechada");
        }

    }

    public void contaBnaco(){
       setSaldo(0);
        setStatus(false);

    }

    public void setNumConta(int n) {
        this.numConta =n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
