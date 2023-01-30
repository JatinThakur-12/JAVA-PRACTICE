public class majorityelements {
    public static int majority_Element(int[] nums) {
        int count = 0;
        Integer candidate = null;
    
        for (int num : nums) {
           if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        //int nums[]={2,2,1,1,1,2,2};
        int nums[]={2,3,3,3,2,3,4,4,3};
        int k=majority_Element(nums);
        System.out.println(k);
        

    }
    
}
