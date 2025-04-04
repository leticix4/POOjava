package Estudo;

class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private double limite;
    private static int totalContas;

    Conta(){
       Conta.totalContas = Conta.totalContas + 1;
    }

    public static int getTotalContas(){
        return Conta.totalContas;
    }


    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }


    public double getSaldo(){
        return this.saldo + this.limite;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }



    public double pegaSaldo(){
        return this.saldo;
    }

    void saca(double valor){
        if(valor > this.saldo ){
            System.out.println("não é possivel sacar!");
        }
        else{
            this.saldo = this.saldo - valor;
        } 

    }

    void deposita(double valor){
        if( valor < 0){
            System.out.println("Valor não é positivo!");
        }
        else{
            this.saldo = this.saldo + valor;
        }
        
    }
    
}
