package Locadora;

public class Cliente extends Pessoa {
    private String RG, CPF;
    
    public Cliente(String nome, String telefone, String RG, String CPF) {
        super(nome, telefone);
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
