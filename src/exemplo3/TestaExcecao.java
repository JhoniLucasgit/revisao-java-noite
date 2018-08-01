package exemplo3;

public class TestaExcecao {

	public static void main(String[] args) {
		int[] numeros = new int[4];// o [4] diz qual o tamanho do array, e não a posição
		
		try {
			int n = 7 / 0;
			numeros[7] = 10;// coloca o 10 na posição 7, vai gerar uma exceção
			System.out.println("Teste de execução");// quando da uma exceção não executa o resto do programa e vai direto pro catch
		}catch(ArithmeticException ex) {
			System.out.println("Falha na operação aritmética");
		}catch(ArrayIndexOutOfBoundsException ex) {// exceção de estouro de array, qnd coloca um index maior que o do array criado
			System.out.println("Estouro de Array");
		}finally { // o bloco finally sempre será executado independente de ter uma exceção ou não no código
			System.out.println("Sempre executa este trecho");
		}
		
	}

}
