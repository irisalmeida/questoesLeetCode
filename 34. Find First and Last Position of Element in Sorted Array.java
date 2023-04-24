class Solution {
    public int[] searchRange(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length - 1;
        int[] result = new int[2];
        result[0]=buscaBinariaPrimeiro(nums, target, inicio, fim);
        result[1]=buscaBinariaUltimo(nums, target, inicio, fim);
        return result;
    }

    private static int buscaBinariaPrimeiro(int[] nums, int target, int inicio, int fim) {
        int meio = (inicio + fim)/2;
        if(fim < inicio){//caso em que o valor não tá no array
            return -1;
        }
        if(nums[meio] < target){
            return buscaBinariaPrimeiro(nums, target, meio + 1, fim);
        }else if(nums[meio]> target){
            return buscaBinariaPrimeiro(nums, target, inicio, meio - 1);   
        }else{
            if(meio == 0 || nums[meio] != nums[meio -1]){
                return meio;
            }else{
                return buscaBinariaPrimeiro(nums,target,inicio,meio-1);
            }
        }
    }

    private static int buscaBinariaUltimo(int[] nums, int target, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        if(fim < inicio){//caso em que o valor não tá no array
            return -1;
        }
        if(nums[meio]< target){
            return buscaBinariaUltimo(nums, target, meio + 1, fim);
        }else if(nums[meio] > target){
            return buscaBinariaUltimo(nums, target, inicio, meio -1);   
        }else{//(nums[meio] == target)
            if(meio == nums.length -1 || nums[meio] != nums[meio +1]){
                return meio;
            }else{
                return buscaBinariaUltimo(nums,target, meio + 1, fim);
            }
        }   
    }

}
