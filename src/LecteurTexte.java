import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class LecteurTexte implements LecteurFichier {
	protected BufferedReader lecteur;
	protected ArrayList<String> lignes;
	
	public LecteurTexte() {
		this.lecteur= null; 
		this.lignes = new ArrayList<String>();
	}
	
	public void ouverture(String cheminFichier) {
		if (cheminFichier.endsWith(".txt")) {
			try {
				this.lecteur = Files.newBufferedReader(Paths.get(cheminFichier));
				this.lecture();
				this.fermeture();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Ce n'est pas un fichier texte");
		}
	}
	
	public void fermeture() {
		try {
			lecteur.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
