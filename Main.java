public class Main {
    public static void main(String[] args) {

        int [] tabInt = {1, 3, 8, 5, 34, 6, 4, 9, -56};
       // String [] tabStr = {"6", "9", "5", "2", "4", "3"};

        //Tableaux.trierCroissantSSS(tabInt);
        //Tableaux.trierCroissantSSS(tabStr);
        Tableaux.trierDecroissant(tabInt);

        //Tableaux.print(tabInt);

        System.out.println(Tableaux.maximum(tabInt));
        System.out.println(Tableaux.minimum(tabInt));
    }
}
