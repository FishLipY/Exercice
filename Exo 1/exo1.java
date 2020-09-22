import java.util.Arrays;

class app {

    public static void main(String[] args) {

        String[] Liste_1 = {"Abeille", "Baleine","Abeille", "Canard", "Dinde", "Canard", };
        String[] Liste_2 = new String[Liste_1.length];

        //On trie le tableau
        Arrays.sort(Liste_1);

        //On supprime les doublons
        for (int i = 0; i < Liste_1.length; i++) {
          int mDouble = -1;
          String Animal = Liste_1[i];

          for (int j = 0; j < Liste_2.length; j++) {
            if (Liste_2[j] == null || Liste_2[j].equals(Animal)) {
              mDouble = j;
            }
          }
          if (mDouble >= 0) {
            Liste_2[mDouble] = Animal;
          }
        }
        

        for (int k = 0; k < Liste_2.length / 2; k++) {
          String temp = Liste_2[k];
          Liste_2[k] = Liste_2[Liste_2.length - k - 1];
          Liste_2[Liste_2.length - k - 1] = temp;
        }
        System.out.println(Arrays.toString(Liste_2)); 

    }
  }
