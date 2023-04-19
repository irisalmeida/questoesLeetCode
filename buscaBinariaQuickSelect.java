public class quickSelect<T extends Comparable<T>> {
    public T quickselect(T[]array, int inicio, int fim, int k){
        int i = inicio;
        T pivot = array[inicio];
        for(int j=inicio+1;j <= fim;j++){
            if(array[j].compareTo(pivot)<0){
                i++;
                swap(array,i,j);
            }
        }
            swap(array,i,inicio);
            if(k==i+1){
                return pivot;
            }else if(k < i + 1){
                return quickselect(array, inicio, i-1, k);
            }else{
                return quickselect(array, i+1,fim,k);
            }
        }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
