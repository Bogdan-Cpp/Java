public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = ts.twoSum(nums, target);

        if(result != null){
            System.out.println(result[0] + " " + result[1]);
        }
        else{
            System.out.println("Nu exista");
        }
    }
}
