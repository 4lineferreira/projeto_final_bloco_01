package produto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int opcao, id;
		String nome, marca;
		boolean sair;

		while (true) {

			System.out.println("\n________________________________");
			System.out.println("            Tina Lab              ");
			System.out.println("________________________________");
			System.out.println("     1 - Compra     ");
			System.out.println("     2 - Venda     ");
			System.out.println("     3 - Controle de estoque     ");
			System.out.println("     4 - Atualizar  ");
			System.out.println("     5 - sair ");
			System.out.println("________________________________");
			System.out.println(" Digite a opção desejada: ");

			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if(opcao == 5) {
				System.out.println("______Sistema encerrado!______");
				sobre();
				System.exit(0);
				break;
				
			}

			switch (opcao) {

			case 1:
				System.out.println(" ____Registro de produto____\n ");
				System.out.println("Digite o nome do novo produto: ");
				nome = scanner.nextLine();

				System.out.println(nome);

				System.out.println("Digite o fabricante do produto: ");
				marca = scanner.nextLine();
				scanner.skip("\\R?");

				break;
			case 2:
				System.out.println("Digite o ID do produto: ");
				id = scanner.nextInt();

				break;
			case 3:
				System.out.println("____Produtos disponíveis____\n");

				break;
			case 4:
				System.out.println("Digite o ID do produto: ");
				id = scanner.nextInt();
				break;
				
			}
		}
	}

	public static void sobre() {
		System.out.println("\n________________________________");
		System.out.println("                                  ");
		System.out.println("        Projeto E-commerce        ");
		System.out.println("Bem-Vindos à TINA LAB! Aqui somos ");
		System.out.println("apaixonados pelo universo dos games");
		System.out.println("Produtos de entretenimento digital");
		System.out.println("desde jogares casuais até os gamers");
		System.out.println("mais HardCore.");
		System.out.println("\n________________________________");

	}

}
