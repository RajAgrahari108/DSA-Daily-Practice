public class SmollestNumber {
    public static void main(String[] args) {
        int a[]={2,7,1,5,3,9};
        
       int result= isSmollestNumber(a);
       System.out.println("smallesg number is present in a : " + result);
    }

    public static int isSmollestNumber(int a[]){
        // int small= a[0];
        int small= Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]<small){
                small=a[i];
            }
        }
        return small;
    }
}
