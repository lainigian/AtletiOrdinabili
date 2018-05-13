
public class MainClass 
{

	public static void main(String[] args) 
	{
		Atleta a1=new Atleta("Pierone",1,30,200);
		Atleta a2=new Atleta("Luigi",2,20,190);
		Atleta a3=new Atleta("Zico",3,39,210);
		Atleta a4=new Atleta("Nino",4,39,197);
		
		Atleta[] elencoAtleti= {a1,a2,a3,a4};
		
		Atleta[] elencoAtletiOrdinati;
		elencoAtletiOrdinati=(Atleta[]) Ordinatore.insertionSortCrescente(elencoAtleti);
		
		for (int i = 0; i < elencoAtletiOrdinati.length; i++) 
		{
			System.out.println(elencoAtletiOrdinati[i].toString());
		}

	}

}
