class Solution {
    public int searchInsert(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length - 1;

        return buscaBinaria(nums, target, inicio, fim);
    }

    private static int buscaBinaria(int[] nums, int target, int inicio, int fim) {
        if (inicio <= fim) { //Mudei do  "<" para "<=", assim consigo incluir o caso em que o inicio == fim
            int meio = (inicio + fim) / 2;

            if (nums[meio] == target) {
                return meio;//caso base 1
            }
            if (target < nums[meio]) {
                return buscaBinaria(nums, target, inicio, meio - 1);
            } else {
                return buscaBinaria(nums, target, meio + 1, fim);
            }
        } else {//caso base 2: O valor não existe no array e precisa pensar no indice que ele estaria se esse número existisse
                return inicio;// suposto meio +1 da penúltima chamada recursiva

                }

            }
        }
