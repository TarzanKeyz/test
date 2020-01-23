/**
 * @author France Beaudoin
 */

public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissant(int[] tab){
        int imax;
        for (int i=0;i<tab.length-1;i++){
            imax = i;
            for (int j=0; j<tab.length; j++){
                if (tab[j] > tab[imax])
                    imax = j;
            }
            if (imax != i){
                permute(tab, i, imax);
            }
        }
    }

    public static void print (int [] tab){
        for (int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }

    public static int maximum (int [] tab){
        int max = tab[0];
        for(int i=0; i<tab.length-1; i++){
            if(tab[i] > max)
            max = tab[i];
        }
        return max;
    }

    public static int minimum (int [] tab){
        int min = tab [0];
        for (int i=0; i<tab.length;i++){
            if (tab[i] < min)
                min = tab[i];
        }
        return min;
    }
}
