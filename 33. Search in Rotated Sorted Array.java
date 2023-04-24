//NÃO PASSOU EM TODOS OS CASOS DE TESTE: 174 / 195 testcases passed
//Caso em que deu erro:Input nums = [5,1,3] /target =5 /Output -1 / Expected 0

class Solution {
    public int search(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length -1;
        return buscaBinaria(nums,inicio,fim, target);
    }

    private int buscaBinaria(int[] nums, int inicio, int fim, int target){
        int meio = (inicio + fim)/2;

        if(target == nums[meio]) {
            return meio;
        }if(inicio > fim){
            return -1;
        }if(inicio <= fim) {
            if(nums[inicio] <= target && target <= nums[meio]){
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
       
