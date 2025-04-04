package Estudo;

public class Teste {
    public static void main(String []args){
        Conta minhaConta = new Conta();
        minhaConta.saldo = 1000;
        minhaConta.saca(5000);

        double novoSaldo = -200;

        //testa se o novo saldo é válido
        if (novoSaldo < 0){
            System.out.println("Não é possivel mudar o saldo");

        }
        else{
            minhaConta.saldo = novoSaldo;
        }
    }
    
}
