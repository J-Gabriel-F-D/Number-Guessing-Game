import java.util.*;

public class NumberGuessingGame {

	public static int gerarNumero (){
		Random number = new Random();
		return number.nextInt(100)+1;
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resposta;
		int tentativas = 0;
		int randomNumber = gerarNumero();

		System.out.println("Bem-vindo ao Jogo de Adivinhacao de Numeros!");
		System.out.println("Por favor escolha o nivel de dificuldade:");
		System.out.println("1. Facil ( 7 Tentativas )");
		System.out.println("2. Medio ( 5 Tentativas )");
		System.out.println("3. Dificil ( 3 Tentativas )");
		System.out.print("Digite sua resposta: ");
		resposta = scanner.nextInt();

		tentativas = (resposta == 1) ? 7 : (resposta == 2) ? 5 : 3 ;

		while (tentativas > 0){
			System.out.println("Faca seu palpite: ");
			resposta = scanner.nextInt();

			if (resposta == randomNumber) {
				System.out.println("Voce acertou o numero. Parabens o numero e: " + randomNumber);
				tentativas = 0;
			}else {
				tentativas--;
				if( tentativas != 0){
					System.out.println("Voce errou, restam " + tentativas + " tentativas !?" );
				}else {
					System.out.println("Infelizmente voce nao acertou, a resposta correta era: " + randomNumber);	
				}
			}
		}
	}
}