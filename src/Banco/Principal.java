package Banco;

public class Principal {
    public static void main(String[]args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Noah");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Emma");
        p2.abrirConta("CP");

        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100f);

        p1.sacar(350);
        p1.fecharConta();


        p1.estadoAtual();
        p2.estadoAtual();


    }
}
