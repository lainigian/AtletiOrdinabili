/**
 * Classe che consente l'ordinamento crescente 
 * e decrescente di stringhe di array di interi e di array di stringhe
 * @author Laini Gian Marco
 *
 */
public class Ordinatore 
{
	/**
	 * Metodo privato che scambia fra loro due interi di un'array di oggetti che implementano
	 * l'interfaccia Ordinabile
	 * @param array	Array su cui effettuare lo scambio
	 * @param pos1	posizione del primo elemento da scambiare
	 * @param pos2	posizione del secondo elemento da scambiare
	 */
	private static void scambia (Ordinabile[] array, int pos1, int pos2)
	{
		Ordinabile s=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=s;
	}
	
	
	/**
	 * Metodo statico che ordina una array di oggetti che implementano
	 * l'interfaccia ordinabile in ordine crescente utilizzando l'algoritmo 
	 * Selection Sort.
	 * @param array Array di interi da ordinare
	 * @return Altro array di interi con i valori ordinati 
	 */
	
	public static Ordinabile[] insertionSortCrescente(Ordinabile[] array)
	{
		//creo una copia dell'array da ordinare
		Ordinabile[] risultato=array.clone();	
		for (int i = 0; i < risultato.length-1; i++) 
		{
			for (int j = i+1; j < risultato.length; j++) 
			{
				if (risultato[j].minoreDi(risultato[i]))
					scambia(risultato,i,j);
			}
		}
		return risultato;
	}
	
	/**
	 * Metodo statico che ordina una array di oggetti che implementano l'interfaccia Ordinabile
	 * in ordine decrescente utilizzando l'algoritmo 
	 * Selection Sort.
	 * @param array Array di interi da ordinare
	 * @return Altro array di interi con i valori ordinati in ordine decrescente
	 */
	public static Ordinabile[] insertionSortDecrescente(Ordinabile[] array)
	{
		//creo una copia dell'array da ordinare
		Ordinabile[] risultato=array.clone();
		for (int i = 0; i < risultato.length-1; i++) 
		{
			for (int j = i+1; j < risultato.length; j++) 
			{
				if (risultato[j].MaggioreDi(risultato[i]))
					scambia(risultato,i,j);
			}
		}
		return risultato;
	}
	
	
}
