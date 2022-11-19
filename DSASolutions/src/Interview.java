public class Interview {

    public static void main(String[] args) {
        int[] arr = {1,2,3,10,5,11,6};

        int max =0;

         for(int i=0 ; i<arr.length; i++){
             if(arr[i] > max){
                 max = arr[i];
             }
         }

        System.out.println(max);
    }
}
