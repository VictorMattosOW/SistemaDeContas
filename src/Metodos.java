import javax.swing.*;

public class Metodos {

	public ClasseConta[] fCadastraConta(ClasseConta[] vetor) {
		int i, j, aux = 0;
		String[] tConta = { " ", "Fisica", "Conjunta", "Juridica", "Especial" };

		for (i = 0; i < vetor.length; i++) {
			vetor[i].codigoConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de conta : "));
			vetor[i].nomeClienteConta = JOptionPane.showInputDialog("Digite o nome do Cliente :");
			vetor[i].saldoConta = (int) (Math.random() * 6000);
			vetor[i].tipoConta = Integer
					.parseInt(JOptionPane.showInputDialog("1- fisica \n2- conjunta \n3- juridica \n4- especial"));
		}
		
		for (i = 0; i < vetor.length - 1; i++) {
			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[i].codigoConta > vetor[j].codigoConta) {
					aux = vetor[i].codigoConta;
					vetor[i].codigoConta = vetor[j].codigoConta;
					vetor[j].codigoConta = aux;
				}
			}
		}
		
		return vetor;
	}

	public ClasseMovimento[] fCadastraMovimento(ClasseMovimento[] vetor) {
		int i, j, aux = 0;
		for (i = 0; i < vetor.length; i++) {
			vetor[i].codigoContaMovimento = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o codigo de conta : "));
			vetor[i].tipoMovimento = Integer.parseInt(JOptionPane.showInputDialog(
					"[Digite o tipo de movimento de conta]" + "\n" + "[1]-Credito " + "\n" + "[2]- Débito "));
			vetor[i].valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("digite o valor : "));

		}
		
		for (i = 0; i < vetor.length - 1; i++) {
			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[i].codigoContaMovimento > vetor[j].codigoContaMovimento) {
					aux = vetor[i].codigoContaMovimento;
					vetor[i].codigoContaMovimento = vetor[j].codigoContaMovimento;
					vetor[j].codigoContaMovimento = aux;
				}
			}
		}
		return vetor;
	}

	public ClasseConta[] fBalanceLine(ClasseConta[] vetor, ClasseMovimento [] v, ClasseConta [] vet) {
		int i,j;
		for(i = 0; i < vetor.length; i ++) {
			vet[i].codigoConta = vetor[i].codigoConta;
			vet[i].limiteConta = vetor[i].limiteConta;
			vet[i].nomeClienteConta = vetor[i].nomeClienteConta;
			vet[i].saldoConta = vetor[i].saldoConta;
			vet[i].tipoConta = vetor[i].tipoConta;
		}
		
		for(i = 0; i < vet.length; i++) {
			for(j = 0; j < v.length; j++) {
				if(vet[i].codigoConta == v[j].codigoContaMovimento) {
					if(v[j].tipoMovimento == 1) {
						vet[i].saldoConta+= v[j].valorMovimento;
					}
					else {
						vet[i].saldoConta-= v[j].valorMovimento;
					}
				}
			}
		}
		return vet;
	}

	public ClasseConta [] menuSwitchCase2(ClasseConta[] vetor, ClasseMovimento[] v, ClasseConta[] vet) {
		int opc = 0;
		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"[CONSULTA CADASTROS] \n1-Contas Correntes \n2-Movimento \n3-Atualizado \n9- Sair"));

			switch (opc) {

			case 1:
				pMostraContaC(vetor);
				break;

			case 2:
				pMostraMovimento(v);
				break;

			case 3:
				pMostraContaA(vet);
				break;

			case 9:
				System.out.println("Sair do sistema");
				break;
			}
		}
		return vet;
	}

	public void pMostraContaC(ClasseConta[] vetor) {
		int i;
		String[] tConta = { " ", "Fisica", "Conjunta", "Juridica", "Especial" };
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Codigo de Conta N°: " + vetor[i].codigoConta + "\n" + "Nome do Cliente : "
					+ vetor[i].nomeClienteConta + "\n" + "Saldo da Conta : " + vetor[i].saldoConta + "\n"
					+ "Tipo da Conta : " + tConta[vetor[i].tipoConta]);
			System.out.println("\n");
		}
	}

	public void pMostraMovimento(ClasseMovimento[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[Movimento da Conta] \n" + "Codigo da Conta : " + vetor[i].codigoContaMovimento + "\n"
					+ "Tipo de movimento : " + vetor[i].tipoMovimento + "\n" + "Valor Movimentado : "
					+ vetor[i].valorMovimento);
			System.out.println("\n");
		}
	}

	public void pMostraContaA(ClasseConta[] vetor) {
		int i;
		String[] tConta = { " ", "Fisica", "Conjunta", "Juridica", "Especial" };
		for (i = 0; i < vetor.length; i++) {
			System.out.println("[CONTA ATUALIZADA] \n" + "Codigo de Conta N°: " + vetor[i].codigoConta + "\n" + "Nome do Cliente : "
					+ vetor[i].nomeClienteConta + "\n" + "Saldo da Conta : " + vetor[i].saldoConta + "\n"
					+ "Tipo da Conta : " + tConta[vetor[i].tipoConta]);
			System.out.println("\n");
		}
	}

}
