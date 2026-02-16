func canAliceWin(nums []int) bool {
    sumSingle := 0;
    sumDouble := 0;
    for i:=0;i<len(nums);i++ {
        if nums[i]>9{
            sumDouble += nums[i]
        }else{
            sumSingle += nums[i]
        }
    }
    if sumDouble == sumSingle {
        return false;
    }
    return true;
}