func check(nums []int) bool {
    cnt := 0
    n := len(nums)
    for i:=0;i<n;i++ {
        if nums[i] > nums[(i+1) % n] {
            cnt++
        }
        if cnt>1 {
            return false
        }
    }
    return true
}