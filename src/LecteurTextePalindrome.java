import java.io.IOException;

public class LecteurTextePalindrome extends LecteurTexte {
	
	@Override
	public void lecture() {
		String ligne = null;
		System.out.println("--- Affichage palindrome --- \n");
		
        
        try {
			while((ligne = this.lecteur.readLine())!= null) {
				StringBuilder constructeur = new StringBuilder();
				this.lignes.add(ligne);
				
				constructeur.append(ligne);
				constructeur.reverse();
				
				System.out.println("* " + ligne + " : " + constructeur + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
