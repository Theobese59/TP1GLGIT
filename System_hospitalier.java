package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		String str = requête.getPatient().getName()+" "+requête.getPatient().getAge()+"Ans < ";
		for(object s:requête.getSymptomes())
		{	
			str = str+s+" ";
		}
		str = str+">";
		return str;
	}	
	private String comparerDonnes() {
		// Comparaison des données
		// On compare patient1 et patient2 leurs localisations pour vérifier s'il y a des clusters ou nons pour vérifier s'il y a des clusters ou nons pour vérifier s'il y a des clusters ou non... 
		return "Cluster trouvé";
	}

}
