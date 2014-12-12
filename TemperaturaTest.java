package lab23;

public class TemperaturaTest {

	public static void main(String[] args) {
		System.out.println("Unesite mjernu jedinicu za temperaturu(C, K ili F): ");
		char skala = TextIO.getChar();
		System.out.println("Unesite broj stepeni: \n");
		double stepen = TextIO.getDouble();
		Temperatura temp = new Temperatura(stepen, skala);
		System.out.println(temp.toString('C'));
		System.out.println(temp.toString('F'));
		System.out.println(temp.toString('K'));
		System.out.println("\nDruga temperatura sa default vrijednostima: ");
		Temperatura tempD = new Temperatura();
		System.out.println(tempD.toString('C'));
		System.out.println(tempD.toString('F'));
		System.out.println(tempD.toString('K'));
		System.out.println("\nSada je druga temperatura: ");
		tempD = new Temperatura(temp);
		System.out.println(tempD.toString('C'));
		System.out.println(tempD.toString('F'));
		System.out.println(tempD.toString('K'));
	}

}
