package gestion;


public class Classe {
	
		private String nom_Clas;
		private int level_clas;
		public Classe(String nom_Clas, int level_clas) {
			this.nom_Clas = nom_Clas;
			this.level_clas = level_clas;
		}
	
		public String getNom_Clas() {
			return nom_Clas;
		}
		public void setNom_Clas(String nom_Clas) {
			this.nom_Clas = nom_Clas;
		}
		public int getLevel_clas() {
			return level_clas;
		}
		public void setLevel_clas(int level_clas) {
			this.level_clas = level_clas;
		}
		
		
}
