package Estudo;

class Conta {
    String titular;
    int numero;
    private double saldo;


    void saca(double valor){
        if(valor > this.saldo ){
            System.out.println("não é possivel sacar!");
        }
        else{
            this.saldo = this.saldo - valor;
        } 

    }
    
}
