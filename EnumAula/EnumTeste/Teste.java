package EnumAula.EnumTeste;

import EnumAula.dominio.Cliente;
import EnumAula.dominio.TipoCliente;
import EnumAula.dominio.TipoPagamento;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ratão", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    
        System.out.println(cliente1);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(300));
    }
}
