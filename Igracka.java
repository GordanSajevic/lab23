package lab23;

public class Igracka {
	
	private String naziv;
	private String tip;
	private double cijena;
	private int dobnoOgranicenje;
	private int godinaProizvodnje;
	
	/**
	 * Konstruktor koji prima tri parametra, a za preostala dva dodjeljuje default vrijednosti
	 * @param naziv1
	 * @param tip1
	 * @param cijena1
	 */
	
	public Igracka(String naziv1, String tip1, double cijena1)
	{
		naziv = naziv1;
		tip = tip1;
		cijena = cijena1;
		dobnoOgranicenje = 0;
		godinaProizvodnje = 2014;
	}
	
	/**
	 * Konstruktor koji prima sva tri parametra
	 * @param naziv1
	 * @param tip1
	 * @param cijena1
	 * @param dobnoOgranicenje1
	 * @param godinaProizvodnje1
	 */
	
	public Igracka(String naziv1, String tip1, double cijena1, int dobnoOgranicenje1, int godinaProizvodnje1)
	{
		naziv = naziv1;
		tip = tip1;
		cijena = cijena1;
		dobnoOgranicenje = dobnoOgranicenje1;
		godinaProizvodnje = godinaProizvodnje1;
	}
	
	/**
	 * Konstruktor koji prima četiri parametra, četvrti dodjeljuje u zavisnosti od njegove vrijednosti
	 * @param naziv1
	 * @param tip1
	 * @param cijena1
	 * @param nemamPojmaStaJeOvo
	 */
	
	public Igracka (String naziv1, String tip1, double cijena1, int nemamPojmaStaJeOvo)
	{
		naziv = naziv1;
		tip = tip1;
		cijena = cijena1;
		if (nemamPojmaStaJeOvo > 100)
		{
			godinaProizvodnje = nemamPojmaStaJeOvo;
		}
		else
		{
			dobnoOgranicenje = nemamPojmaStaJeOvo;
		}
	}
	
	/**
	 * Konstruktor bez parametara, dodjeljuje dvije default vrijednosti
	 */
	
	public Igracka()
	{
		dobnoOgranicenje = 0;
		godinaProizvodnje = 2014;
	}
	
	/**
	 * Getter za naziv
	 * @return
	 */
	
	public String getNaziv()
	{
		return naziv;
	}
	
	/**
	 * Getter za tip
	 * @return
	 */
	
	public String getTip()
	{
		return tip;
	}
	
	/**
	 * Getter za cijenu
	 * @return
	 */
	
	public double getCijena()
	{
		return cijena;
	}
	
	/**
	 * Getter za dobno ograničenje
	 * @return
	 */
	
	public double getDobroOgranicenje()
	{
		return dobnoOgranicenje;
	}
	
	/**
	 * Getter za godinu proizvodnje
	 * @return
	 */
	
	public double getGodinaProizvodnje()
	{
		return godinaProizvodnje;
	}
	
	/**
	 * Setter za naziv
	 */
	
	public void setNaziv()
	{
		this.naziv = naziv;
	}
	
	/**
	 * Setter za tip
	 */
	
	public void setTip()
	{
		if (tip != "auto" && tip != "lutka" && tip != "zivotinjica" && tip != "lopta" && tip != "puska")
		{
			throw new IllegalArgumentException("Niste pravilno unijeli tip!");
		}
		this.tip = tip;
	}
	
	/**
	 * Setter za cijenu
	 */
	
	public void setCijena()
	{
		if (cijena < 0)
		{
			throw new IllegalArgumentException("Cijena nije pravilno unešena!");
		}
		else
		{
			this.cijena = cijena;
		}
	}
	
	/**
	 * Setter za dobno ograničenje
	 */
	
	public void setDobnoOgranicenje()
	{
		if (dobnoOgranicenje < 0 || dobnoOgranicenje > 100)
		{
			throw new IllegalArgumentException("Niste dobro unijeli dobno ograničenje!");
		}
		else
		{
			this.dobnoOgranicenje = dobnoOgranicenje;
		}
	}
	
	/**
	 * Setter za godinu proizvodnje
	 */
	
	public void setGodinaProizvodnje()
	{
		if (godinaProizvodnje < 1900 || godinaProizvodnje > 2014)
		{
			throw new IllegalArgumentException("Niste dobro unijeli godinu proizvodnje!");
		}
		else
		{
			this.godinaProizvodnje = godinaProizvodnje;
		}
	}
	
	/**
	 * Funkcija koja varijable smješta u string i vraća taj string
	 */
	
	public String toString()
	{
		String strIgracka = "";
		strIgracka += "Naziv: " + naziv + "\nTip: " + tip + "\nCijena: " + cijena + "\nDobno ograničenje: " + dobnoOgranicenje + "\nGodina proizvodnje: " + godinaProizvodnje;
		return strIgracka;
	}
	
	/**
	 * Funkcija koja provjerava da li su dva objekta jednaka i vraća boolean vrijednost
	 * @param igracka
	 * @return boolean
	 */
	
	public boolean equals(Igracka igracka)
	{
		if (this.naziv.equals(igracka.naziv) && this.tip.equals(igracka.tip) && this.cijena == igracka.cijena && this.dobnoOgranicenje == igracka.dobnoOgranicenje && this.godinaProizvodnje == igracka.godinaProizvodnje)
		{
			return true;
		}
		return false;
	}
	
}
