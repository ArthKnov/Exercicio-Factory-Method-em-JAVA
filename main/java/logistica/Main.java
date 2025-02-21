package logistica;

import javax.swing.JOptionPane;

import com.factory.*;

public class Main {

	public static void main(String[] args) {
		
		int op;
		String menu= " \n Bem vindo ao Sistema de logística. "+
		"\n 1.Transporte Terrestre" + "\n 2.Transporte Maritmo"+
		"\n 3.Transporte Aéreo"+ "\n 4.Transporte Não-motorizado"+
		"\n 0.Sair"+"\n escolha uma opção";
		
		//Criação das fábricas
		TransporteFactory factory1 = new CaminhaoFactory();
		TransporteFactory factory2 = new NavioFactory();
		TransporteFactory factory3 = new AéreoFactory();
		TransporteFactory factory4 = new BicicletaFactory();
		
		do {
			
		op= Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (op) {
		case 1: {
			//Caminhões
			Transporte transporte1 = factory1.criarTransporte();
			transporte1.entregar();
			 break;
		}
		case 2: {
			//navios
			Transporte transporte2 = factory2.criarTransporte();
			transporte2.entregar();
			 break;
		}
		case 3: {
			//aéreo
			Transporte transporte3 = factory3.criarTransporte();
			transporte3.entregar();
			 break;
		}
		case 4: {
			//bicicleta
			Transporte transporte4 = factory4.criarTransporte();
			transporte4.entregar();
			 break;
		}
		case 0: {
			 break;
		}
		default:
			System.out.println("Opção inválida");
		}
	}while(op!=0);
	}
}		
