class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
    Arrays.sort(arr);
    List<List<Integer>> result = new ArrayList<>();


for(int i = 0;i<n-2;i++)
{
int left = i+1;
int right = n-1;

if(i> 0 && arr[i] == arr[i-1])
{
continue; 
}
while(left<right)
{
	int sum = arr[i] + arr[left]+arr[right];
	
	if(sum == 0)
	{
		List<Integer> al = new ArrayList<>();
		al.add(arr[i]);
		al.add(arr[left]);
		al.add(arr[right]);
		result.add(al);
	
		while(left < right && arr[left] == arr[left+1])
		{
			left++;
		}
		while(left < right && arr[right] == arr[right-1])
		{
			right--;
		}
	
	
	left++;
	right--;
	}
	else if (sum < 0)
	{
		left++;
	}
	else{
		right--;
	
	}


}


}
return result;
    }
}