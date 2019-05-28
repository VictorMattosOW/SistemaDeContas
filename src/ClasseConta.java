//conta Corrente
public class ClasseConta {

	int codigoConta;
	String nomeClienteConta;
	double saldoConta;
	double limiteConta;
	int tipoConta;

	// contrutor
	ClasseConta() {
		this(0, " ", 0.0, 0.0, 0);
	}

	ClasseConta(int codConta, String nomeClienteCont, double saldoCont, double limiteCont, int tipoCont) {
		codigoConta = codConta;
		nomeClienteConta = nomeClienteCont;
		saldoConta = saldoCont;
		limiteConta = limiteCont;
		tipoConta = tipoCont;

	}

}
