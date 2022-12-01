package src;

public class Consualtbae {

    public static void main(String []args) {
        // code here
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int ans = 0;
        int min =Integer.MAX_VALUE;
        int max =0;
        int minIndex = 0;
        int maxIndex = 0 ;
        for( int i=arr.length-1 ; i >=0; i--){
            if( arr[i] < min  ){
                min = arr[i];
                minIndex = i;
            }
            if( arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        ans = max-min ;
        System.out.println(ans);
    }

}
