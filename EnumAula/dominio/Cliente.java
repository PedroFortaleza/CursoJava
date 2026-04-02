package EnumAula.dominio;

import javax.sound.midi.SysexMessage;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome + " Tipo de cliente: "+ this.tipoCliente + " " + this.tipoCliente.getValor() + " " + this.tipoCliente.getRelatorio() + " Tipo de pagamento: " + tipoPagamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }


}
