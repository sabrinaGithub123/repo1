
package gestion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Administrateur {
	//ajout
	public static void ajoutEtudiant() 
	  {
	      try {
	          String url="jdbc:mysql:// localhost:3306/gestion_assiduite";
	          String user="root";
	          String password="";
	          Connection connexion = DriverManager.getConnection(url,user,password);
	          Scanner sc = new Scanner(System.in);
	          System.out.println("Entrez un nom");
	          String nom=sc.nextLine();
	          
	          System.out.println("Entrez un prenom");
	          String prenom=sc.nextLine();
	          
	          System.out.println("Entrez son matricule");
	          String matricule=sc.nextLine();
	          
	          System.out.println("Entrez le sexe");
	          String sexe=sc.nextLine();
	          
	          System.out.println("Entrez la classe");
	          String classe=sc.nextLine();
	          
	          System.out.println("Entrez l'age");
	          int age=sc.nextInt();
	          
	          
	          
	          String requete = "insert into etudiant "
						+"(MAT_ETU, NOM_CLAS, NOM_ETU, PREN_ETU, AGE_ETU, SEXE_ETU)"
						+ " values (?, ?, ?, ?, ?, ?)";          
	          PreparedStatement statement = connexion.prepareStatement(requete);
	          statement.setString(1, matricule);
	          statement.setString(2, classe);
	          statement.setString(3, nom);
	          statement.setString(4, prenom);
	          statement.setInt(5, age);
	          statement.setString(6, sexe);
	          statement.executeUpdate();
	          if(statement != null) {System.out.println("l'Etudiant "+nom +" "+prenom +" enregistré avec succès!");}
	          sc.close();
			  connexion.close();
		  }
	      catch (SQLException e) 
	      {
			e.printStackTrace();
	      }      
 }
	
	
	
	// mise à jour de l'etudiant
	public static void miseAjourEtudiant(int id) {
		 try {
			    String url="jdbc:mysql:// localhost:3306/test1";
		          String user="root";
		          String password="";
		          //connection à la base de donnée
		          Connection connexion = DriverManager.getConnection(url,user,password);
                  Scanner sc = new Scanner(System.in);
                  //récupération des valeurs
		          System.out.println("Entrez le nouveau nom");
		          String newNom=sc.nextLine();
		          System.out.println("Entrez le nouveau prenom");
		          String newPrenom=sc.nextLine();
		          System.out.println("Entrez son nouveau matricule");
		          String newMatricule=sc.nextLine();
		          System.out.println("Entrez le nouveau sexe");
		          String newSexe=sc.nextLine();
		          System.out.println("Entrez la nouvelle classe");
		          String newClasse=sc.nextLine();
		          System.out.println("Entrez l'age");
		          int newAge=sc.nextInt();
		          String sql = "UPDATE test1prim SET";
		          boolean hasSet = false;
		          if (newNom != null) {
		              sql += " nom = ?";
		              hasSet = true;
		          }
		          if (newPrenom != null) {
		              if (hasSet) {
		                  sql += ",";
		              }
		              sql += " prenom = ?";
		              hasSet = true;
		          }
		          if (newMatricule != null) {
		              if (hasSet) {
		                  sql += ",";
		              }
		              sql += " matricule = ?" ;
		              hasSet = true;
		          }
		          if (newSexe != null) {
		              if (hasSet) {
		                  sql += ",";
		              }
		              sql += " sexe = ?" ;
		              hasSet = true;
		          }
		          if (newAge > 0) {
		              if (hasSet) {
		                  sql += ",";
		              }
		              sql += " age = ?";
		              hasSet = true;
		          }
		          if (newClasse != null) {
		              if (hasSet) {
		                  sql += ",";
		              }
		              sql += " classe = ?";
		          }
		          sql += " WHERE id = ?";
		          PreparedStatement statement = connexion.prepareStatement(sql);       
		          int index = 1;
		            if (newNom != null) {
		            	statement.setString(index++, newNom);
		            }
		            if (newPrenom != null) {
		            	statement.setString(index++, newPrenom);
		            }
					if (newMatricule != null) {
		            	statement.setString(index++, newMatricule);
		            }
		            if (newSexe != null) {
		            	statement.setString(index++, newSexe);
		            }
		            if (newAge > 0) {
		            	statement.setInt(index++, newAge);
		            }
		            if (newClasse != null) {
		            	statement.setString(index++, newClasse);
		            }
		            statement.setInt(index, id);
		            statement.executeUpdate();
		            System.out.println("Etudiant mis à jour avec succès.");
			          sc.close();  
	     } 
	   catch (SQLException er) 
	     {
          System.err.println("Erreur lors de la mise à jour de l'étudiant: " + er.getMessage());}
	     } 
	 
	 

	
	// suppression
	public static void suppression () 
	{
		try 
		{
		  String url="jdbc:mysql:// localhost:3306/test1";
	      String user="root";
	      String password="";
	      Connection connexion = DriverManager.getConnection(url,user,password);
	      Scanner sc = new Scanner(System.in);
          System.out.println("Entrez l'id à supprimer");
          int deletedId=sc.nextInt();	      
	      String query = "DELETE FROM `test1prim` WHERE id = ?";
	      PreparedStatement statement = connexion.prepareStatement(query);
		  statement.setInt(1, deletedId);
          int rowsAffected=statement.executeUpdate();
          if(rowsAffected > 0)  { System.out.println("Cet etudiant a été supprimé");}
	      else {System.out.println("Aucun etudiant avec cet id.");}
		  sc.close();
	     } 
		catch (SQLException e) {System.err.println("Erreur lors de la suppression de l'étudiant"+ e.getMessage());}
	 }
		
	
//ajout matière
	
	  public static void ajouterMatiere() {
	 try {
		  String url="jdbc:mysql:// localhost:3306/gestion_assiduite";
          String user="root";
          String password="";
          //connection à la base de donnée
          Connection connexion = DriverManager.getConnection(url,user,password);
          Scanner sc = new Scanner(System.in);
          //récupération des valeurs
          System.out.println("Entrez le code de la matiere");
          String code=sc.nextLine();
          System.out.println("Entrez le nom de la classe ou elle est enseignée");
          String nomClass=sc.nextLine();
          System.out.println("Entrez le nom du prof qui la dispense");
          String nomProf=sc.nextLine();
          System.out.println("Entrez la plage horaire totale");
          int plage_hor=sc.nextInt();
          System.out.println("Entrez le semestre");
          int num_semestre=sc.nextInt();
          String query ="insert into matiere"
        		       +"(CODE_MAT, NOM_CLAS, NOM_PROF, PLAGE_HORAIRE, SEM_UE)"
        		       +" value(?, ?, ?, ?, ?)";
          PreparedStatement statement = connexion.prepareStatement(query);
		  statement.setString(1, code);
		  statement.setString(2, nomClass);
		  statement.setString(3, nomProf);
		  statement.setInt(4, plage_hor);
		  statement.setInt(5, num_semestre);
		  statement.executeUpdate();
          System.out.println("matière enregistrée!");
          sc.close();
	 }
		  catch (SQLException e) {System.err.println("Erreur lors de l'enregistrement de la matière "+  e.getMessage());}
		  
	 
	  //ajoutheureAbsence
	 
	  public static void ajouterHeureAbsence() {
	 try {
		  String url="jdbc:mysql:// localhost:3306/gestion_assiduite";
         String user="root";
         String password="";
         //connection à la base de donnée
         Connection connexion = DriverManager.getConnection(url,user,password);
         Scanner sc = new Scanner(System.in);
         //récupération des valeurs
         System.out.println("entrer le nom de l'etudiant ");
         String nom=sc.nextLine();
         System.out.println("entrez son matricule");
         String matricule=sc.nextLine();
         System.out.println("en quel cours a t-il été absent?");
         String cour=sc.nextLine();
         System.out.println("combien d'heure d'absence");
         int absence=sc.nextInt();
         Statement stmt=connexion.createStatement();
         ResultSet requete = stmt.executeQuery("SELECT MAT_ETU FROM etudiant");
         boolean bool=false;
          while(requete.next())
          {
        	  String matriRecup= requete.getString("MAT_ETU");
        	 if(matriRecup.equals(matricule))
        	 {	 
        		 String query ="insert into faire"
             		       +"(MAT_ETU, CODE_MAT, ABSENCE_ETU)"
             		       +" value(?, ?, ?)";
               PreparedStatement statement = connexion.prepareStatement(query);
      		  statement.setString(1, matricule);
      		  statement.setString(2, cour);
      		  statement.setInt(3, absence);
      		  statement.executeUpdate();
               System.out.println("l'élève "+nom+" a été absent "+absence+"h au cour de "+cour);
                
               bool=true;
        	 }
          }
         if(bool==false)
         { System.out.println("ce matricule n'existe pas dans la base de données");}
          
	     sc.close();
	 }
		  catch (SQLException e) {System.err.println("Erreur lors de l'enregistrement des heures d'absence "+  e.getMessage());}
	  }
	  
	  
	  
	  //___________________requetes de l'etudiant_____________________________//
	  
	  //voir historique
	  public static void voirHistorique() {
			 try {
				  String url="jdbc:mysql:// localhost:3306/gestion_assiduite";
		          String user="root";
		          String password="";
		          Connection connexion = DriverManager.getConnection(url,user,password);
		          Scanner sc = new Scanner(System.in);
		          System.out.println("Entrez votre matricule");
		          String matricule=sc.nextLine();
		          Statement statement =connexion.createStatement();
		          String query = "SELECT * FROM etudiant WHERE MAT_ETU =" + "matricule";
		          String query2=query.executeQuery();
	            // try( PreparedStatement stmt = connexion.prepareStatement(query))
	            // {stmt.setString(1, matricule);}
	      		  
		          ResultSet resultSet = statement.executeQuery(query);
		          if(resultSet.next()) {
		        	  String mat =resultSet.getString("MAT_ETU");
		        	  String nom =resultSet.getString("NOM_ETU");
		        	  String pren =resultSet.getString("PREN_ETU");
		        	  int age =resultSet.getInt("AGE_ETU");
		        	  String sex =resultSet.getString("SEXE_ETU");
		        	  
		        	  System.out.println("matricule: " + mat);
		        	  System.out.println("nom: " + nom);
		        	  System.out.println("prenom: " + pren);
		        	  System.out.println("age: " + age);
		        	  System.out.println("sexe: " + sex);
		          }else {
		        	  System.out.println("Aucune etudiant trouvé pour ce matricule");
		          }
                 resultSet.close();
                 statement.close();
                 connexion.close();
                 sc.close(); 
			 }
			  catch (SQLException e) {System.err.println("erreur "+  e.getMessage());}
	}
	  
	  
	  //requete etudiant
	  public static void ecrireRequete() {
			 try {
				  String url="jdbc:mysql:// localhost:3306/gestion_assiduite";
		          String user="root";
		          String password="";
		          //connection à la base de donnée
		          Connection connexion = DriverManager.getConnection(url,user,password);
		          Scanner sc = new Scanner(System.in);
		          //récupération des valeurs
		          System.out.println("Entrez votre matricule");
		          String matricule=sc.nextLine();
		          Statement stmt=connexion.createStatement();
		          ResultSet requete2 = stmt.executeQuery("SELECT MAT_ETU FROM etudiant");
		          boolean bool=false;
		           while(requete2.next())
		           {
		         	  String matriRecup= requete2.getString("MAT_ETU");
		         	 if(matriRecup.equals(matricule))
		         	 { 
		         		System.out.println("saisissez votre requete");
				         String requete=sc.nextLine();
		         		 String query ="insert into requete_etu"
			        		       +"(matricule_etu, requete)"
			        		       +" value(?, ?)";
			          PreparedStatement statement = connexion.prepareStatement(query);
					  statement.setString(1, matricule);
					  statement.setString(2, requete);
					  statement.executeUpdate();
			          System.out.println("requête envoyée!");
			          System.out.println("Si après deux jours maximums vous n'êtes pas interpellé, "
			          		+ "veillez renvoyez la requête jusqu'à aboutissement");

		         	  bool=true;
		        	 }
		          }
		         if(bool==false)
		         { System.out.println("ce matricule n'existe pas dans la base de données");}
		         
		          sc.close();
			 }
				  catch (SQLException e) {System.err.println("Erreur lors de l'enregistrement "
				  		+ "de la requête "+  e.getMessage());}	 
	  }

	public static void main(String[] args){
		//ajoutEtudiant();
		//miseAjourEtudiant(23);
		//suppression();
		// ajouterMatiere();
		//ajouterHeureAbsence();
        //voirHistorique();
          ecrireRequete();
	}
}












