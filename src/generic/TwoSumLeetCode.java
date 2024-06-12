package generic;

import java.util.HashMap;

public class TwoSumLeetCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Вывод: [0, 1]
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Создаем пустой хеш-таблицу для хранения значений и их индексов
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        // Проходимся по всем элементам массива
        for (int i = 0; i < nums.length; i++) {
            // Вычисляем значение, которое в сумме с текущим числом даст target
            int complement = target - nums[i];

            // Проверяем, есть ли это значение в хеш-таблице
            if (numToIndex.containsKey(complement)) {
                // Если есть, возвращаем текущий индекс и индекс найденного элемента
                return new int[] { numToIndex.get(complement), i };
            }

            // Если нет, добавляем текущее число в хеш-таблицу с его индексом
            numToIndex.put(nums[i], i);

        }

        // Если решение не найдено (хотя по условию задачи это невозможно)
        throw new IllegalArgumentException("No two sum solution");
    }
}

