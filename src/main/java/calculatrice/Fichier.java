package calculatrice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Fichier {


    File file = new File("./monFichier.txt");
    String lChaine = new String();

    /**
     * Ecrit dans le fichier d'historique
     * @param l_histoList L'array a envoyer
     */
    public void writer(ArrayList<String> l_histoList) throws IOException {
        try {
            FileWriter fichier = new FileWriter(file);
            if (l_histoList.size() > 0) {
                for (int i = 0; i < l_histoList.size(); i++) {
                	lChaine += l_histoList.get(i) + "\n";
                }

                Files.write(Paths.get("./monFichier.txt"),lChaine.getBytes(), StandardOpenOption.APPEND);

            } else {
                System.out.println("La liste est vide");
            }
            fichier.flush();
            fichier.close();
        } catch (IOException exp) {
            System.out.println(exp);
        }
    }

    void lecture() {
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader  lecture = new InputStreamReader(fis);
            BufferedReader buff = new BufferedReader(lecture);
            String ligne;
            while ((ligne = buff.readLine()) != null) {
                System.out.println(ligne);
            }
            buff.close();
            } catch (IOException exp) {
                exp.printStackTrace();
            }
    }

    void ecritureApplication(ArrayList<String> lHistoList) {
        Fichier fichier = new Fichier();
        try {
            fichier.writer(lHistoList);
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
}
