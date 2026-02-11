public class LArgestNumber {
    public static void main(String args[]){
        int a[]={40,20,10,80,60,90};
        int max = a[0];
        int result = isMaximumNumber( a, max);
        System.out.println("largest number is : "+ result);
    }


        public static int isMaximumNumber(int a[], int max){
            for(int i=0; i<a.length; i++){
                if(a[i]>max){
                    max = a[i];
                   
                }
            }
             return max;
        }
}
