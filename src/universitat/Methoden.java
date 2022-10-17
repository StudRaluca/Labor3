package university;

public class Methods {
    public int[] roundUp(int[] grades) {
        int[] grades1 = grades.clone();
        for (int i = 0; i < grades1.length; i++) {
            if ((grades1[i]) + 1 % 5 == 0)
                grades1[i] = grades1[i] + 1;
            else if ((grades1[i] + 2) % 5 == 0)
                grades1[i] = grades1[i] + 2;
        }
        return grades1;
    }

    public int[] nichtAusreichend(int[] grades) {
        int[] nichtAusreichendeNoten = new int[grades.length];
        int j = 0;
        for(int notes : grades) {
            if (notes < 40) {
                nichtAusreichendeNoten[j] = notes;
                j++;
            }
        }
        int[] nichtAusreichendeNotenFiltered = new int[j];
        System.arraycopy(nichtAusreichendeNoten, 0, nichtAusreichendeNoten, 0, j);

        return nichtAusreichendeNotenFiltered;
    }

    public int durchschnitt(int[] grades) {
        int 
    }
}
