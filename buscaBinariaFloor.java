 //Floor(piso) é uma variação de Busca Binária, em que se tenta encontrar o menor inteiro mais próximo
public class floor {
    public static  int floorBusca(int[]array, int x){
        int left= 0;
        int right=array.length -1;
        int floor=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(array[mid]==x){
                return array[mid];
            }if(array[mid]>x){
                right=mid -1;
            }else{
                left=mid+1;
                floor=array[mid];
            }
        }return floor;
    }
