func sortColors(nums []int)  {
    n := len(nums)
    low := 0
    mid := 0
    high := n-1

    for mid<=high {
        num := nums[mid]
        if num == 0 {
            nums[low],nums[mid] = nums[mid],nums[low]
            low++
            mid++
        } else if num == 1 {
            mid++
        } else {
            nums[mid],nums[high] = nums[high],nums[mid]
            high--
        }
    }

}