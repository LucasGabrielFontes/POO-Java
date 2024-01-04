public class Cliente {
    // Atributos
    int numConta;
    int saldoInicial;
    int despesas;
    int creditosAplicados;
    int creditosAutorizados;

    // Método construtor
    public Cliente (int numConta, int saldoInicial, int despesas, int creditosAplicados, int creditosAutorizados) {
	this.numConta = numConta;
	this.saldoInicial = saldoInicial;
	this.despesas = despesas;
	this.creditosAplicados = creditosAplicados;
	this.creditosAutorizados = creditosAutorizados;
    }

    // Métodos principal
    public int calculaNovoSaldo () {
	return (this.saldoInicial + this.despesas - this.creditosAplicados);
    }

    public boolean verificaCredito (int saldo) {
	if (saldo > this.creditosAutorizados) {
	    return false;
	} else {
	    return true;
	}
    }
}