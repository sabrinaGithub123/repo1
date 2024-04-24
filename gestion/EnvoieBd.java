package gestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;
public class EnvoieBd {
	private String nom_admin;
	private String scode_admin;
	public EnvoieBd(String nom_admin) {
		this.nom_admin = nom_admin;
		this.scode_admin ="banane" ;
	}
	public String getNom_admin() {
		return nom_admin;
	}
	public void setNom_admin(String nom_admin) {
		this.nom_admin = nom_admin;
	}
	public String getScode_admin() {
		return scode_admin;
	}
	public void setScode_admin(String scode_admin) {
		this.scode_admin = scode_admin;
	}
	//public void enregistrerEtudiant() {}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnvoieBd admin= new EnvoieBd("TOTO");
		//admin.enregistrerEtudiant();
		
		String code;
		int i,j;
		boolean t=false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("com.mysql.cj.jdbc.Driver 404Not Found!");
		}

		try{
			//String url= "jdbc: mysql://localhost:3306/test1";
			String user="root";
			String password="";
			
             Connection connexion = DriverManager.getConnection("jdbc: mysql://localhost:3306/test1",user,password);
             connexion.createStatement();
             
             
             
             
             Scanner sc= new Scanner(System.in);
			System.out.println("entrez votre code administrateur: ");
			code=sc.nextLine();
			
			
			System.out.println("entrer le matricule de l'etudiant: ");
			String mat=sc.nextLine();
			
			
			System.out.println("entrer le nom de l'etudiant: ");
			String nom=sc.nextLine();
			
			
			System.out.println("entrer le prenom de l'etudiant: ");
			String pren=sc.nextLine();
			
			
			System.out.println("entrer le sexe de l'etudiant: ");
			String f=sc.nextLine();
			
			
			System.out.println("entrer la classe de l'etudiant: ");
			String y=sc.nextLine();
			
			
			System.out.println("entrer l'age de l'etudiant: ");
			int age=sc.nextInt();
			
			
			String sql="insert into test1prim" +"nom, prenom"
					+"values(?, ?)";
			
			//String sql="insert into Etudiant" +"nom, prenom, matricule, sexe, age,	classe"
			//+"values(?, ?, ?, ?, ?, ?, ?)";
			
			
			PreparedStatement statement = connexion.prepareStatement(sql);
			statement.setString(1, nom);
			statement.setString(2, pren);
			statement.setString(3, mat);
			statement.setString(3,f );
			statement.setLong(4, age);
			statement.setString(6, y);
			statement.executeUpdate();
			
			System.out.println("insert complete.");
			sc.close();
			connexion.close();
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		


	}

}