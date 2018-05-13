public class Atleta  implements Ordinabile
{

	private String nome;
	private int pettorale;
	private int eta;
	private int tempoImpiegato;
	private static double coefficienteEta=0.4;
	
	
	public Atleta (String nome, int pettorale, int eta, int tempoImpiegato)
	{
		setNome(nome);
		setPettorale(pettorale);
		setEta(eta);
		setTempoImpiegato(tempoImpiegato);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPettorale() {
		return pettorale;
	}

	public void setPettorale(int pettorale) {
		this.pettorale = pettorale;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getTempoImpiegato() {
		return tempoImpiegato;
	}

	public void setTempoImpiegato(int tempoImpiegato) {
		this.tempoImpiegato = tempoImpiegato;
	}

	@Override
	public boolean MaggioreDi(Object o) 
	{
		Atleta altroAtleta=(Atleta)o;
		
		int prestazioneQuestoAtleta=(int) (getTempoImpiegato()-eta*coefficienteEta);
		int prestazioneAltroAtleta=(int) (altroAtleta.getTempoImpiegato()-altroAtleta.eta*coefficienteEta);
		if (prestazioneQuestoAtleta>prestazioneAltroAtleta)
			return true;
		else
			return false;
	}

	@Override
	public boolean minoreDi(Object o) 
	{
		Atleta altroAtleta=(Atleta)o;
		
		int prestazioneQuestoAtleta=(int) (getTempoImpiegato()-eta*coefficienteEta);
		int prestazioneAltroAtleta=(int) (altroAtleta.getTempoImpiegato()-altroAtleta.eta*coefficienteEta);
		if (prestazioneQuestoAtleta<prestazioneAltroAtleta)
			return true;
		else
			return false;
	}

	public static double getCoefficienteEta() {
		return coefficienteEta;
	}

	public static void setCoefficienteEta(double coefficienteEta) {
		Atleta.coefficienteEta = coefficienteEta;
	}

	public String toString()
	{
		return(getPettorale()+" "+getNome()+ " Eta: "+ getEta()+" Prestazione: "+ (int) (getTempoImpiegato()-eta*coefficienteEta) );
	}
	
}
