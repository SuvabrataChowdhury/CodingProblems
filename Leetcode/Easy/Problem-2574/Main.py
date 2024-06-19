import math

class Solution:
	def leftRightDifference(self, nums: list[int]) -> list[int]:
		sumNums=0
		length=len(nums)

		leftSum=list()
		rightSum=list()

		for i in range(length):
			leftSum.append(sumNums)
			sumNums+=nums[i]

		sumNums=0

		for i in range(length-1,-1,-1):
			rightSum.append(sumNums)
			sumNums+=nums[i]

		for i in range(length):
			nums[i]=abs(leftSum[i]-rightSum[length-1-i])

		return nums

ob=Solution()

nums=[int(i) for i in input().split(',')]

print(ob.leftRightDifference(nums))
