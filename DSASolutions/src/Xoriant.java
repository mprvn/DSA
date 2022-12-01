package src;

public class Xoriant {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };

        int mid = arr.length/2;
        int targetEle = 90;
         int index = 0;
         if(arr[mid] < targetEle){
                index = find(arr, 0, mid, targetEle);
             System.out.println(index);
                 if(index >= 0) {
                     System.out.println("index of the arr :: " + index + "  value " + arr[index]);
                 }
         }

         if(targetEle > arr[mid]){
            // mid = mid+1;
             index = find(arr, mid, arr.length, targetEle);
             System.out.println("index of the arr :: "+ index +"  value " + arr[index]) ;
         }
    }

    private static int find(int[] arr, int start , int end , int targetElem){
        for(int i = start; i<= end; i++  ){
               if(targetElem == arr[i] ){
                   return i;
               }
        }

        return -1;

    }
}
