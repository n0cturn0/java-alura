
public class TestaLacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int naturais=1; naturais <= 10; naturais++) {
				System.out.print(naturais*multiplicador);
				System.out.print(" ");
			}
			System.out.println();
		}

		
		
		
		
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int naturais=1; naturais <= 10; naturais++) {
				if(naturais > multiplicador) {
					break;
				}
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
