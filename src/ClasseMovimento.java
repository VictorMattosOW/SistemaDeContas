
public class ClasseMovimento{

	int codigoContaMovimento;
	double valorMovimento;
	int tipoMovimento;
	int statusMovimento;

	// construtor
	ClasseMovimento() {
		this(0, 0.0, 0, 0);
	}

	ClasseMovimento(int codContaMovimento, double valorDoMovimento, int tipMovimento, int statusDoMovimento) {
		codigoContaMovimento = codContaMovimento;
		valorMovimento = valorDoMovimento;
		tipoMovimento = tipMovimento;
		statusMovimento = statusDoMovimento;

	}

}
