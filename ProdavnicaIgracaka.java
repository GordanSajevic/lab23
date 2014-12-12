package lab23;

public class ProdavnicaIgracaka {
	
	private	Igracka[] inventarIgracaka;
	private int brojIgracaka;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public ProdavnicaIgracaka()
	{
		inventarIgracaka = new Igracka[10];
		brojIgracaka = 0;
	}
	
	/**
	 * Funkcija koja dodaje objekte sa tri parametra u niz
	 * @param naziv
	 * @param tip
	 * @param cijena
	 */
	
	public void dodajIgracku(String naziv, String tip, double cijena)
	{
		inventarIgracaka[brojIgracaka] = new Igracka(naziv, tip, cijena);
		brojIgracaka++;
		if (brojIgracaka == inventarIgracaka.length)
		{
			resize();
		}
	}
	
	/**
	 * Funkcija koja dodaje objekte sa četiri parametra u niz
	 * @param naziv
	 * @param tip
	 * @param cijena
	 * @param nemamPojmaStaJeOvo
	 */
	
	public void dodajIgracku(String naziv, String tip, double cijena, int nemamPojmaStaJeOvo)
	{
		if (nemamPojmaStaJeOvo > 100)
		{
			inventarIgracaka[brojIgracaka] = new Igracka(naziv, tip, cijena, 0, nemamPojmaStaJeOvo);
		}
		else
		{
			inventarIgracaka[brojIgracaka] = new Igracka(naziv, tip, cijena, nemamPojmaStaJeOvo, 2014);
		}
		if (brojIgracaka == inventarIgracaka.length)
		{
			resize();
		}
		brojIgracaka++;
	}
	
	/**
	 * Funkcija koja dodaje objekte sa pet parametara u niz
	 * @param naziv
	 * @param tip
	 * @param cijena
	 * @param dobnoOgranicenje
	 * @param godinaProizvodnje
	 */
	
	public void dodajIgracku(String naziv, String tip, double cijena, int dobnoOgranicenje, int godinaProizvodnje)
	{
		inventarIgracaka[brojIgracaka] = new Igracka(naziv, tip, cijena, dobnoOgranicenje, godinaProizvodnje);
		brojIgracaka++;
		if (brojIgracaka == inventarIgracaka.length)
		{
			resize();
		}
	}
	
	/**
	 * Funkcija koja povećeva dužinu niza dvostruko
	 */
	
	private void resize()
	{
		Igracka[] niz = new Igracka[inventarIgracaka.length * 2];
		for (int i=0; i<inventarIgracaka.length * 2; i++)
		{
			niz[i] = inventarIgracaka[i];
		}
		inventarIgracaka = niz;
	}
	
	/**
	 * Funkcija koja sve elemente niza smješta u string
	 */
	
	public String toString()
	{
		String strNiz = "";
		for (int i=0; i<inventarIgracaka.length; i++)
		{
			strNiz += inventarIgracaka[i] + "\n"; 
		}
		return strNiz;
	}
}
