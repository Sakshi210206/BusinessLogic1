public class UtilNew {
    public static void sort(Comparable [] comparables){
        int passes = comparables.length - 1;
        int comps = comparables.length -1;

        for( int i =0; i< passes;i++){
            for(int j=0;j<(comps - i);j++){
                if(comparables[j].compareTo(comparables[j+1] )== 1){
                    Comparable temp = comparables[j];
                    comparables[j]= comparables[j+1];
                    comparables[j+1]=temp;
                }
            }
        }
    }

}
