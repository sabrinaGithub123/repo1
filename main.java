
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class main {
	private String mat_Etu;
	private String nom_Etu;
	private String prenom_Etu;
	private int age_Etu;
	private String sexe_Etu;
	private String clas;
	public main(String mat_Etu, String nom_Etu, String prenom_Etu, int age_Etu, String sexe_Etu, Classe classe_Etu,String clas) {
		this.mat_Etu = mat_Etu;
		this.nom_Etu = nom_Etu;
		this.prenom_Etu = prenom_Etu;
		this.age_Etu = age_Etu;
		this.sexe_Etu = sexe_Etu;
		this.clas=clas;
	}
	public String getMat_Etu() {
		return mat_Etu;
	}
	public void setMat_Etu(String mat_Etu) {
		this.mat_Etu = mat_Etu;
	}
	public String getNom_Etu() {
		return nom_Etu;
	}
	public void setNom_Etu(String nom_Etu) {
		this.nom_Etu = nom_Etu;
	}
	public String getPrenom_Etu() {
		return prenom_Etu;
	}
	public void setPrenom_Etu(String prenom_Etu) {
		this.prenom_Etu = prenom_Etu;
	}
	public int getAge_Etu() {
		return age_Etu;
	}
	public void setAge_Etu(int age_Etu) {
		this.age_Etu = age_Etu;
	}
	public String getSexe_Etu() {
		return sexe_Etu;
	}
	public void setSexe_Etu( String sexe_Etu) {
		this.sexe_Etu = sexe_Etu;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	
    public void setessai(String clas) {
		this.clas = clas;
	}
	
	
}
