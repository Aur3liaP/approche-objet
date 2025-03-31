package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("C:/Users/picau/Downloads/OneDrive_2025-03-27/11. Java approche objet/TP autonomie J6/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

   /*
        for (String line : lines) {
            System.out.println(line);
        }
    */

        ArrayList<Ville> villes = new ArrayList<>();

        for(int i =1; i< lines.size(); i++){
            String line = lines.get(i);
            String[] tokens = line.split(";");
            String nom = tokens[6].trim();
            String codeDepartement = tokens[2].trim();
            String nomRegion = tokens[1].trim();
            int populationTotale = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

            Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
            villes.add(ville);
        }
/*
       for (Ville ville : villes){
            System.out.println(ville);
        }

 */
        ArrayList<Ville> villesFiltrees = new ArrayList<>();
        for(Ville ville : villes){
            if(ville.getPopulationTotale() > 25000){
                villesFiltrees.add(ville);
            }
        }

        Path outputPath = Paths.get("C:/Users/picau/Downloads/OneDrive_2025-03-27/11. Java approche objet/TP autonomie J6/villes plus 25000.csv");
        List<String> outputLines = new ArrayList<>();
        outputLines.add("Nom;Code département;Nom de la région;Population totale");

        for (Ville ville : villesFiltrees) {
            outputLines.add(ville.toString());
        }

        Files.write(outputPath, outputLines, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        List<String> outputContent = Files.readAllLines(outputPath, StandardCharsets.UTF_8);
        for (String outputLine : outputContent) {
            System.out.println(outputLine);
        }


    }
}
