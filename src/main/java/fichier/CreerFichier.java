package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path inputFilePath = Paths.get("C:/Users/picau/Downloads/OneDrive_2025-03-27/11. Java approche objet/TP autonomie J6/recensement.csv");
        Path outputFilePath = Paths.get("C:/Users/picau/Downloads/OneDrive_2025-03-27/11. Java approche objet/TP autonomie J6/100 premieres lignes.csv");

        List<String> lines = Files.readAllLines(inputFilePath, StandardCharsets.UTF_8);
        List<String> first100Lines = lines.subList(0, Math.min(100, lines.size()));
        Files.write(outputFilePath, first100Lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
