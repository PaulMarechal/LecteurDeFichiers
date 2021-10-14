import java.io.IOException;

public class LecteurTexteALenvers extends LecteurTexte {
	

	@Override
	public void lecture() {
		// TODO Auto-generated method stub
		System.out.println("--- Affichage à l'envers --- \n");
		
		String ligne = null;
		
		try {
			
			while((ligne = this.lecteur.readLine()) != null) {
				//System.out.println(ligne);
				this.lignes.add(ligne);
			
				for(int i = this.lignes.size()-1 ; i >= 0; i--) {
					//System.out.println(i);
					System.out.println(lignes.get(i));
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
