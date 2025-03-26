package equals;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays pays1 = new Pays("France", 67_051_840);
        Pays pays2 = new Pays("Chine", 1_067_000_000);
        Pays pays3 = new Pays("France", 67_051_840);

        System.out.println("pays1.equals(pays2) :" + pays1.equals(pays2));
        System.out.println("pays1.equals(pays3) :" + pays1.equals(pays3));

        System.out.println("pays1==pays2 :" + (pays1 == pays2));
        System.out.println("pays1==pays3 :" + (pays1 == pays3));

    }


}
