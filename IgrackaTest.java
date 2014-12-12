package lab23;

public class IgrackaTest {

	public static void main(String[] args) {
		Igracka edib = new Igracka ("Edib", "lutka", 5, 1984);
		System.out.println(edib.toString());
		Igracka jesenko = new Igracka ("Jesenko", "zivotinjica", 7.8, 1988);
		System.out.println(jesenko.toString());
		Igracka necko = new Igracka ("Necko", "auto", 7.5);
		System.out.println(necko.toString());
		necko = new Igracka(jesenko); // kopiranje objekata
		System.out.println(necko.toString());
		
	}

}
