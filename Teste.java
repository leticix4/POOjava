package Estudo;

public class Teste {
    public static void main(String []args){
        Conta minhaConta = new Conta();
         minhaConta.deposita(1000);
         System.out.println("Saldo: " + minhaConta.pegaSaldo());
    }
}
