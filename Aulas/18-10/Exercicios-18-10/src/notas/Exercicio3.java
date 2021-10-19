/* Crie de  uma classe Aluno com os seguintes atributos e métodos: 
 - String nome, double[] notas; 
 - aprovado(), maiorNota() e media() (além dos getters e setters necessários).
 - Dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, 
   retorne as seguintes observações sobre o aluno: 
   a maior nota, média e caso média maior que 7 = aprovado.*/

package notas;

public class Exercicio3 {

	public static void main(String[] args) {
		
		double[] notas = {10.0, 5.0, 7.0, 9.0, 10.0};
		Alunos aluno = new Alunos("Fernanda", notas);
		

	}

}
