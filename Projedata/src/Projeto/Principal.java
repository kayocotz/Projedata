package Projeto;


public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria","18/10/2000");
		Funcionario p1sal = new Funcionario(2009.44,"Operador");
		Pessoa p3 = new Pessoa("Caio","02/05/1961");
		Funcionario p3sal = new Funcionario(9836.14,"Coordenador");
		Pessoa p4 = new Pessoa("Miguel","14/10/1988");
		Funcionario p4sal = new Funcionario(19119.88,"Diretor");
		Pessoa p5 = new Pessoa("Alice","05/01/1995");
		Funcionario p5sal = new Funcionario(2234.68,"Recepcionista");
		Pessoa p6 = new Pessoa("Heitor","19/11/1999");
		Funcionario p6sal = new Funcionario(1582.72,"Operador");
		Pessoa p7 = new Pessoa("Arthur","31/03/1993");
		Funcionario p7sal = new Funcionario(4071.84,"Contador");
		Pessoa p8 = new Pessoa("Laura","08/07/1994");
		Funcionario p8sal = new Funcionario(3017.45,"Gerente");
		Pessoa p9 = new Pessoa("Heloísa","24/05/2003");
		Funcionario p9sal = new Funcionario(1606.85,"Eletricista");
		Pessoa p10 = new Pessoa("Helena","02/09/1996");
		Funcionario p10sal = new Funcionario(2799.93,"Gerente");
		System.out.println("Nome: " + p1.nome + " DN: " + p1.datanasc + " R$: " + p1sal.salario + " Função: " + p1sal.funcao);
		System.out.println("Nome: " + p3.nome + " DN: " + p3.datanasc + " R$: " + p3sal.salario + " Função: " + p3sal.funcao);
		System.out.println("Nome: " + p4.nome + " DN: " + p4.datanasc + " R$: " + p4sal.salario + " Função: " + p4sal.funcao);
		System.out.println("Nome: " + p5.nome + " DN: " + p5.datanasc + " R$: " + p5sal.salario + " Função: " + p5sal.funcao);
		System.out.println("Nome: " + p6.nome + " DN: " + p6.datanasc + " R$: " + p6sal.salario + " Função: " + p6sal.funcao);
		System.out.println("Nome: " + p7.nome + " DN: " + p7.datanasc + " R$: " + p7sal.salario + " Função: " + p7sal.funcao);
		System.out.println("Nome: " + p8.nome + " DN: " + p8.datanasc + " R$: " + p8sal.salario + " Função: " + p8sal.funcao);
		System.out.println("Nome: " + p9.nome + " DN: " + p9.datanasc + " R$: " + p9sal.salario + " Função: " + p9sal.funcao);
		System.out.println("Nome: " + p10.nome + " DN: " + p10.datanasc + " R$: " + p10sal.salario + " Função: " + p10sal.funcao);
		
	}
}
