package pipol;
import pipol.Aluno;
import pipol.Professor;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Apuri{
public static void main(String args[]){
	Aluno aluninho = new Aluno();
	aluninho.setNome("Luis Ado");
	aluninho.setCpf("010890777-111");
	aluninho.anoentrada = 2018;
	aluninho.periodoentrada = 20182;
	aluninho.setRua("José Marquinhos");
	aluninho.setComplemento("Casa");
	aluninho.setNumero(58);
	aluninho.setCidade("Recife");
	Professor professorzinho = new Professor();
	professorzinho.setNome("Manoel Biruta");
	professorzinho.setCpf("016780887-121");
	professorzinho.setRua("Missionário Lelé");
	professorzinho.setComplemento("B");
	professorzinho.setNumero(580);
	professorzinho.setCidade("Recife");
	System.out.println("Aluno" + " " + aluninho.getNome() + "\n" + aluninho.getCpf() + "\n" + aluninho.getRua() + "\n" + aluninho.getNumero() + " " + aluninho.getComplemento() + " " +aluninho.getCidade() + "\n" + aluninho.anoentrada + "\n" + aluninho.periodoentrada + "\n");
	System.out.println("Professor" + " " + professorzinho.getNome() + "\n" + professorzinho.getCpf() + "\n" + professorzinho.getRua() + "\n" + professorzinho.getNumero() + " " + professorzinho.getComplemento() + " " + professorzinho.getCidade() + "\n" + "Admissao: " + professorzinho.Data);
}
}