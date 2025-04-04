package Estudo;

class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;


    // método para mudar o cpf

    public void mudaCPF(String cpf){
        if(this.idade <= 60){
            validaCPF(cpf);
        }
        this.cpf= cpf;
    }
    private void validaCPF(String cpf){

    }
}
