import java.io.IOException;

public class LecteurTexteNormal extends LecteurTexte {

	@Override
	public void lecture() {
		// TODO Auto-generated method stub
		String ligne = null;
		System.out.println("--- Affichage normal --- \n");
		
		try {
			ligne = this.lecteur.readLine();
			while(ligne != null) {
				System.out.println(ligne);
				ligne = this.lecteur.readLine();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
