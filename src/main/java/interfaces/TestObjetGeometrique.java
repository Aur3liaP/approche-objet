package interfaces;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        objets[0] = new Cercle(10);
        objets[1] = new Rectangle(5,3);

        for (ObjetGeometrique obj : objets){
            System.out.println("périmètre: " + obj.perimetre());
            System.out.println("surface: " + obj.surface());
        }
    }
}
