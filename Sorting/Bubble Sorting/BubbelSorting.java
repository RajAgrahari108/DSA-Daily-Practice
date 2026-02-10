

public class BubbelSorting {
    public static void isBubbleSorting(int[] arr ){
        for(int i=0; i<=arr.length; i++){
            for(int j=0; j<=arr.length; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        isBubbleSorting(arr);
    }
}
