package calculatrice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fichier {

	File f = new File("./monFichier.txt");
	String l_chaine = new String();

	public void writer(ArrayList<String> l_histoList) throws IOException {
		try {
			FileWriter fichier = new FileWriter(f);
			if (l_histoList.size() > 0) {
				for (int i = 0; i < l_histoList.size(); i++) {
					l_chaine+=l_histoList.get(i)+"\n";
				}
				Files.write(Paths.get("./monFichier.txt"),l_chaine.getBytes(), StandardOpenOption.APPEND);
			} else {
				System.out.println("La liste est vide");
			}
			fichier.flush();
			fichier.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	void lecture() {
		   try {
			      FileInputStream fis = new FileInputStream(f);
			      InputStreamReader  lecture = new InputStreamReader(fis);
			      BufferedReader buff=new BufferedReader(lecture);
			      String ligne;
			      while ((ligne=buff.readLine())!=null){
			      	System.out.println(ligne);
			      }
			      buff.close();
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
	}

	void ecritureApplication(ArrayList<String> l_histoList) {
		Fichier fichier = new Fichier();
		try {
			fichier.writer(l_histoList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
