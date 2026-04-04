func twoSum(nums []int, target int) []int {
    hash := make(map[int]int)
    n := len(nums);
    result := make([]int,2);
    for i := 0;i<n;i++ {
        rem := target - nums[i]
        if ind,ok := hash[rem]; ok {
            result[0] = ind
            result[1] = i
            break;
        }
        hash[nums[i]] = i
    }
    return result
}