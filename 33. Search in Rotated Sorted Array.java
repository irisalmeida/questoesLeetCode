class Solution {
    public int search(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length -1;
        return buscaBinaria(nums,inicio,fim, target);
    }

    private int buscaBinaria(int[] nums, int inicio, int fim, int target){

        if(inicio > fim){
            return -1;
        }
       int meio = (inicio + fim)/2;

        if(target == nums[meio]) {
            return meio;
        }if(nums[inicio] <= nums[meio]) {
            if(target <= nums[meio] && nums[inicio] <= target ){
                return buscaBinaria(nums, inicio, meio -1,target);
            }else{
                return buscaBinaria(nums, meio +1, fim, target);
            }
        }else{
            if(nums[meio] <= target && target <= nums[fim]){
                return buscaBinaria(nums,meio +1,fim, target);
            }else{
                return buscaBinaria(nums,inicio, meio -1,target);
            }
        }
    }

}   
