package exemplo3;

public class TestaExcecao {

	public static void main(String[] args) {
		int[] numeros = new int[4];// o [4] diz qual o tamanho do array, e n�o a posi��o
		
		try {
			int n = 7 / 0;
			numeros[7] = 10;// coloca o 10 na posi��o 7, vai gerar uma exce��o
			System.out.println("Teste de execu��o");// quando da uma exce��o n�o executa o resto do programa e vai direto pro catch
		}catch(ArithmeticException ex) {
			System.out.println("Falha na opera��o aritm�tica");
		}catch(ArrayIndexOutOfBoundsException ex) {// exce��o de estouro de array, qnd coloca um index maior que o do array criado
			System.out.println("Estouro de Array");
		}finally { // o bloco finally sempre ser� executado independente de ter uma exce��o ou n�o no c�digo
			System.out.println("Sempre executa este trecho");
		}
		
	}

}
