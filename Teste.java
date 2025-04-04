package Estudo;

public class Teste {
    public static void main(String []args){
        Conta minhaConta = new Conta();
         minhaConta.deposita(1000);

         int total = Conta.getTotalContas();
         System.out.println("Total de contas criadas "+ total);
         System.out.println("Saldo: " + minhaConta.pegaSaldo());
    }
}
