
class Solution {
    public int search(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length - 1;

        return buscaBinaria(nums, target, inicio, fim);
    }

    private static int buscaBinaria(int[] nums, int target, int inicio, int fim) {
        if (inicio <= fim) { //Mudei do  "<" para "<=", assim consigo incluir o caso em que o inicio == fim
            int meio = (inicio + fim) / 2;

            if (nums[meio] == target) {
                return meio;
            }
            if (target < nums[meio]) {
                return buscaBinaria(nums, target, inicio, meio - 1);
            } else {
                return buscaBinaria(nums, target, meio + 1, fim);
            }
        } else {
            return -1;
        }
    }
}
