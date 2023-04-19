 public class ceil {
    public static int ceilBusca(int[]array,int x){
        int left=0;
        int right=array.length -1 ;
        int ceil=-1;

        while (left <=right) {
           int mid =( left + right)/2;

        if(array[mid] == x){
            return array[mid];
        }else if(array[mid]>x){
            right = mid -1;
            ceil=array[mid];
        }else{
            left = mid + 1;
        }
        }return ceil;
    }
