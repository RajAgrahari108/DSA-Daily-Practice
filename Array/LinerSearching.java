public class LinerSearching {
    public static int IsLinearSearch(int marks[], int key){
        for(int i=0; i<  marks.length; i++){
            if(marks[i]==key){
                return  i;
                // break;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[]={2,4,6,8,10,12,14,16};
        int key = 10;
        if(IsLinearSearch(marks, key)==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key is found at index : " + IsLinearSearch(marks, key));
        }
        
    }
}
