public class Main {
    public static void main(String[] args) {
        CompteBancaire<String> compteLandrine =
                new CompteBancaire(1,750
                , "CFA",new Client("Landrine"));

        CompteBancaire<Character> compteAlbin =
                new CompteBancaire(2,1000
                ,'$',new Client("Albin"));

        CompteBancaire<String> compteLukusa =
                new CompteBancaire(3,1500
                ,"Dollar Americain",new Client("Lukusa"));

        System.out.println(compteLandrine.toString());
        System.out.println(compteAlbin.toString());

    }
}
