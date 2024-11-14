package produto;

import java.util.InputMismatchException;
import java.util.Scanner;

import produto.controller.ProdutoController;
import produto.model.ProdutoConsole;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner scanner = new Scanner(System.in);

		int opcao, id;
		String nome = "", marca = "", versao = "";
		float valor = 0;

		while (true) {

			System.out.println("\n________________________________");
			System.out.println("            Tina Lab            ");
			System.out.println("________________________________");
			System.out.println("     1 - Compras                ");
			System.out.println("     2 - Venda                  ");
			System.out.println("     3 - Controle de estoque    ");
			System.out.println("     4 - Atualizar              ");
			System.out.println("     5 - sair                   ");
			System.out.println("________________________________");
			System.out.println(" Digite a opção desejada:       ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nOpção invalida!");
				scanner.nextLine();
				opcao = 0;
			}

			scanner.nextLine();

			if (opcao == 5) {
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

				System.out.println("Digite o fabricante do produto: ");
				marca = scanner.nextLine();

				System.out.println("Valor do produto: ");
				valor = scanner.nextFloat();

				System.out.println("Versão: ");
				versao = scanner.next();

				produtos.cadastrarProduto(new ProdutoConsole(nome, marca, produtos.gerarId(), valor, versao));

				break;
			case 2:
				System.out.println("Digite o ID do produto: ");
				id = scanner.nextInt();
				produtos.vandaProduto(id);
				System.out.println("Valor da venda: R$" + valor);

				break;
			case 3:
				System.out.println("____Produtos disponíveis____\n");
				produtos.listaEstoque();

				break;
			case 4:
				System.out.println("Digite o ID do produto: ");
				id = scanner.nextInt();

				var buscar = produtos.buscarEstoque(id);

				System.out.println(" ____Atualização de produto____\n ");
				System.out.println("Digite o nome do produto: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();

				System.out.println("Digite o fabricante do produto: ");
				marca = scanner.nextLine();

				System.out.println("Valor do produto: ");
				
				valor = scanner.nextFloat();

				System.out.println("Versão: ");
				versao = scanner.next();

				if (buscar != null) {
					produtos.atualizar(new ProdutoConsole(nome, marca, id, valor, versao));
				}

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
