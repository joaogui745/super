
package Locadora;

public class Chamado {
    private String data;
    private String tipo;
    private String origem, destino;
    private Cliente cliente;

    public Chamado(String data, String tipo, String origem, String destino, Cliente cliente) {
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
