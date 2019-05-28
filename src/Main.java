import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int i, opc = 0;

		Metodos metodos = new Metodos();

		ClasseConta[] contaC = new ClasseConta[3];
		ClasseConta[] contaA = new ClasseConta[3];
		ClasseMovimento[] movimento = new ClasseMovimento[4];

		for (i = 0; i < contaC.length; i++) {
			contaC[i] = new ClasseConta();
		}

		for (i = 0; i < contaA.length; i++) {
			contaA[i] = new ClasseConta();
		}

		for (i = 0; i < movimento.length; i++) {
			movimento[i] = new ClasseMovimento();
		}

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"[MENU PRINCIPAL] \n1- Cadastrar Contas Correntes \n2-Cadastrar Movimento \n3-Gerar Contas Atualizadas \n4-Consulta Cadastro  \n9-Sair "));

			switch (opc) {

			case 1:
				contaC = metodos.fCadastraConta(contaC);
				break;

			case 2:
				movimento = metodos.fCadastraMovimento(movimento);
				break;

			case 3:
				contaA = metodos.fBalanceLine(contaC, movimento, contaA);
				break;
				
			case 4:
				metodos.menuSwitchCase2(contaC, movimento, contaA);
				break;

			case 9:
				System.out.println("Você Saiu do Sistema");
				break;
			}

		}
	}
}
