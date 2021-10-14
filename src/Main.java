import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/**
		
		// Lecteur de texte normal
		LecteurTexteNormal lecteur = new LecteurTexteNormal();
		lecteur.ouverture("/Users/paulmarechal/Desktop/CSS3_cours 2.txt");
		
		// Lecteur de texte à l'envers 
		LecteurTexteALenvers lecteur = new LecteurTexteALenvers();
		lecteur.ouverture("/Users/paulmarechal/Desktop/CSS3_cours 2.txt");
		
		// Lecteur de texte palindrome
		LecteurTextePalindrome lecteur = new LecteurTextePalindrome();
		lecteur.ouverture("/Users/paulmarechal/Desktop/CSS3_cours 2.txt");
		*/
		
		
		// Test comparateur de fichiers 
		
		try
		 (
		  BufferedReader reader1 = Files.newBufferedReader(Paths.get("/Users/paulmarechal/Desktop/CSS3_cours 2.txt") );
		  BufferedReader reader2 = Files.newBufferedReader(Paths.get( "/Users/paulmarechal/Desktop/CSS3_cours 3.txt") );
		 ) {
			 int tot=0;
			 
			 String line1;
			 String line2;
			 
			 while((line1 = reader1.readLine())!=null && (line2 = reader2.readLine())!=null) {
				 
				 // comparer line1 et line2
				 String[] nombres1 = line1.split("\\s");
				 String[] nombres2 = line2.split("\\s");


				 for(int i=0; (i<nombres1.length && i<nombres2.length); i++ ) {
					 

					 System.out.println("--- test ---");
				        	
				     // Compare le premier mots de chaque fichier
			         System.out.println(nombres1[i]);
			         System.out.println(nombres2[i]);

				     if ( nombres1[i].equals(nombres2[i]) ) {
				    	 

				         System.out.println("Les mots sont les mêmes");
				         try {
				              Thread.sleep(1000);
				         } catch (InterruptedException e) {
				              e.printStackTrace();
				         }
				         
				         System.out.println("--- fin ---\n");
				         
				         if (i>0) {
				        	 tot++;
				         }
				         
				     } else {
				        	System.out.println("Les mots sont différents");
				    }
				}
			}
		}
		
		

	}

}
