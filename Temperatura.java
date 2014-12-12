package lab23;

public class Temperatura {
	
	private double tempC;
	private double tempK;
	private double tempF;
	private char skala;
	
	/**
	 * Konstruktor bez parametara koji dodjeljuje default vrijednosti
	 */
	
	public Temperatura()
	{
		tempC = 0;
		tempK = 273.15;
		tempF = 32;
	}
	
	/**
	 * Konstruktor koji prima dva parametra koji dodjeljuje vrijednosti u skladu sa unesenim parametrima
	 * @param temp
	 * @param skala
	 */
	
	public Temperatura(double temp, char skala)
	{
		
		if (skala == 'C' || skala == 'c')
		{
			tempC = temp;
			tempK = tempC + 273.15;
			tempF = tempC * 1.8 + 32; 
		}
		else if (skala =='K' || skala == 'k')
		{
			tempK = temp;
			tempC = tempK - 273.15;
			tempF = tempC * 1.8 + 32; 
		}
		else if (skala =='F' || skala == 'f')
		{
			tempF = temp;
			tempC = (tempF - 32) * 0.5555;
			tempK = tempC + 273.15;
		}
		else
		{
			throw new IllegalArgumentException("Niste dobro unijeli oznaku za skalu!");
		}
	}
	
	/**
	 * Konstruktor koji služi za kopiranje
	 * @param t
	 */
	
	public Temperatura(Temperatura t)
	{
		this.tempC = t.tempC;
		this.tempK = t.tempK;
		this.tempF = t.tempF;
	}
	
	/**
	 * Funkcija koja kreira jedan string od broja stepeni i oznake za skalu, i vraća taj string
	 * @param skala
	 * @return strTemp
	 */
	
	public String toString(char skala)
	{
		String strTemp = "";
		if (skala == 'c' || skala == 'C')
		{
			strTemp += tempC + " " + skala;
		}
		else if (skala == 'k' || skala == 'K')
		{
			strTemp += tempK + " " + skala; 
		}
		else
		{
			strTemp = tempF + " " + skala;
		}
		return strTemp;
	}
	
	/**
	 * Getter za tempC
	 * @return tempC
	 */
	
	public double getCelsius()
	{
		return tempC;
	}
	
	/**
	 * Getter za tempK
	 * @return tempK
	 */
	
	public double getKelvin()
	{
		return tempK;
	}
	
	/**
	 * Getter za tempF
	 * @return
	 */
	
	public double getFarenheit()
	{
		return tempF;
	}
	
	/**
	 * Setter za tempC
	 */
	
	public void setCelsius()
	{
		if (tempC >= -273.15)
		{
			this.tempC = tempC;
		}
		else
		{
			throw new IllegalArgumentException("Temperature ne može biti ispod -273.15 C");
		}
	}
	
	/**
	 * Setter za tempK
	 */
	
	public void setKelvin()
	{
		if (tempK >= 0)
		{
			this.tempK = tempK;
		}
		else
		{
			throw new IllegalArgumentException("Temperature ne može biti ispod 0 K");
		}
	}
	
	/**
	 * Setter za tempF
	 */
	
	public void setFarenheit()
	{
		if (tempF >= -459.67)
		{
			this.tempC = tempC;
		}
		else
		{
			throw new IllegalArgumentException("Temperature ne može biti ispod -459.67 F");
		}
	}
	
	/**
	 * Setter za skalu
	 */
	
	public void setSkala()
	{
		if (skala != 'C' && skala != 'c' && skala != 'K' && skala != 'k' && skala != 'F' && skala != 'f')
		{
			throw new IllegalArgumentException("Niste dobro unijeli oznaku za sskalu!");
		}
		else
		{
			this.skala = skala;
		}
	}
}
