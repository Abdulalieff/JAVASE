public class ArrayHomeWorks {
    public static void GetLargest(int[] Numbers) {

        int max= Numbers[0];
        int cnt_max = 0;
        for(int number : Numbers){
            if(max < number) {
                max = number;
                cnt_max = 1;
            }else if(max == number){
                cnt_max++;
            }
        }
        System.out.printf("Largest value in Array is %d: and Repeated %d times \n", max , cnt_max);
    }

    public static void GetReversArray(int[] myarray){

        for(int i=myarray.length-1; i>=0; i--){
            System.out.println(myarray[i]);
        }


    }

    public static int[] SortArray(int[] Numbers){
        int temp;
        //{8,4,7}
        for(int i=1; i<Numbers.length;i++){

            if(Numbers[i-1] > Numbers[i]){
                temp = Numbers[i-1] + Numbers[i];
                Numbers[i-1] = temp - Numbers[i-1];
                Numbers[i] = temp - Numbers[i-1];
            }

        }
        return Numbers;
    }

    static boolean IsEqual(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
