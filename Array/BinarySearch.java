public class BinarySearch {
    public static int isBunarySeaech(int a[],int key){
        int start=0, end=a.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(a[mid]==key){
                return mid;
            }
            if(a[mid]<key){  //right ->
                return mid+1;
            }else{            // left <-
                return mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int key = 30;

        isBunarySeaech( a[])
        }
}
