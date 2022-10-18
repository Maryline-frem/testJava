package hello;

public class OC {
    public static void main(String[] args) {
        //** Création de la variable avec son type, son nom et sa valeur. */
        String exemple = "hello";

        //** La méthode toUpperCase permet de passer la valeur de ma variable en majuscule. */
        exemple = exemple.toUpperCase();

        //** La méthode replace permet de remplacer une partie du texte par une autre. */
        //** En premier argument le texte à remplacer et en second la texte avec lequel le remplacer. */
        exemple = exemple.replace("HELL", "YEAH");

        //** Affichage de la variable dans ma console */
        System.out.println(exemple);
    }
}
