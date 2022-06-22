package ru.vcrop;

public class Find_Peak_Element_162 {

    private int solution(int[] nums, int left, int right) {
        if (left < right - 1) {
            int middle = (left + right) / 2;
            if (nums[left] < nums[middle] && nums[middle] > nums[right]) {

            } else {
                int l = solution(nums, left, middle);
                if (l != -1) return l;
                return solution(nums, middle, right);
            }
        }
        return -1;
    }

    public int findPeakElement(int[] nums) {
        return solution(nums, 0, nums.length - 1);
    }
}
