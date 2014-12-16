public class RasporedStudenata {
	
	//Zadatak za samostalan rad
	
	private Student[][] raspored;
	
	/**
	 * Konstruktor koji kreira matricu studenata
	 */
	
	public RasporedStudenata()
	{
		raspored = new Student[6][4];
	}
	
	/**
	 * Funkcija koja dodaje studente matrici, po rasporedu sjedenja
	 */
	
	public void dodavanjeStudenta()
	{
		raspored[0][0] = new Student("Jesenko", "Gavrić");
		raspored[0][1] = new Student("Sanela", "Grcić");
		raspored[0][2] = new Student("Amra","Popržanović");
		raspored[0][3] = new Student("Gorjan", "Kalauzović");
		raspored[1][0] = new Student("Davor", "Stanković");
 		raspored[1][1] = new Student("Emir", "Imamović");
		raspored[1][2] = new Student("Nedžad", "Hamzić");
		raspored[1][3] = new Student("Haris", "Arifović");
		raspored[2][0] = new Student("Selma", "Tabaković");
		raspored[2][1] = new Student("Adnan", "Spahić");
		raspored[2][2] = new Student("Neldin", "Džeković");
		raspored[2][3] = new Student("Nermin", "Graca");
		raspored[3][0] = new Student("Haris", "Krkalić");
		raspored[3][1] = new Student("Gordan", "Sajević");
		raspored[3][2] = new Student("Edib", "Imamović");
		raspored[3][3] = new Student("Mustafa", "Ademović");
		raspored[4][0] = new Student("Nermin", "Vučinić");
		raspored[4][1] = new Student("Mirza", "Bečić");
		raspored[4][2] = new Student("Hikmet", "Durgutović");
		raspored[4][3] = new Student("Nedim", "Omerović");
		raspored[5][0] = new Student("Vedad", "Zornić");
		raspored[5][1] = new Student("Prazno", "Prazno");
		raspored[5][2] = new Student("Emina", "Muratović");
		raspored[5][3] = new Student("Prazno", "Prazno");
		

	}
	
	/**
	 * Funkcija koja ispisuje matricu studenata
	 */
	
	public void ispis()
	{
		for (int i=0; i<raspored.length; i++)
		{
			for (int j=0; j<raspored[i].length; j++)
			{
				System.out.print(raspored[i][j].toString() + "  ");
			}
			System.out.println();
		}
	}
}
