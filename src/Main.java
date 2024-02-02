public class Main {
    public static void main(String[] args) {

        //You can add more numbers----------->
        int limit = 5;

        int[] A = new int[limit];

        // Change numbers from here ---------->
        A[0] = 75;
        A[1] = 35;
        A[2] = 20;
        A[3] = 2;
        A[4] = 1;
        //<-------------------------------------

        for (int j = 1; j < A.length ; j++){
            int key = A[j];
            int i = j - 1;

            while( i >= 0 && A[i]>key){
                A[i+1] = A[i];
                i = i - 1;
            }
            A[i+1] = key;
        }

        // Check ordered Array------------------>
        for(int m = 0 ; m < A.length; m++){
            System.out.println(A[m]);
        }

    }
}