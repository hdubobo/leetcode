package algorithm;

public class E01Leetcode283 {
    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        // 第一个循环：j 指针记录非零的个数，
        // 将非零值赋给 nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        // 统计非零元素完成后，剩余的都是零。
        // 第二个循环将零赋给数组的末尾。
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);

        }

    }
    public static void moveZeroes1(int[] nums){
        if(nums==null){
            return;
        }
        int j=0;
        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]!=0){
              int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }


        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);

        }
    }
    public static void main(String[] args) {
        int[] nums={2,3,0,9,8,0};
        moveZeroes1(nums);

    }
}




