package gestion;


public class Matière {

	private String nom_UE;
	private String nomProf_UE;
	private int plag_horair_UE;
	private int Semestre_UE; 
	private String nom_class;
	public Matière(String nom_UE, String nomProf_UE, int plag_horair_UE, int s,int a ) {
		this.nom_UE = nom_UE;
		this.nomProf_UE = nomProf_UE;
		this.plag_horair_UE = plag_horair_UE;
		this.Semestre_UE=s;
	}
	public String getnom_UE() {
		return nom_UE;
	}
	public void setNom_UE(String nom_UE) {
		nom_UE = nom_UE;
	}
	public String getNomProf_UE() {
		return nomProf_UE;
	}
	public void setNomProf_UE(String nomProf_UE) {
		this.nomProf_UE = nomProf_UE;
	}
	
	public int getPlag_horair_UE() {
		return plag_horair_UE;
	}
	public void setPlag_horair_UE(int plag_horair_UE) {
		this.plag_horair_UE = plag_horair_UE;
	}
    public String  getnom_class() {
    return nom_class;
    }
    public void setnom_class(String nom_class)
    {
    this.nom_class = nom_class;
    }
    
  
    

}


