class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int>v;int f=0;
        auto l=nums.size();
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(nums[i]+nums[j]==target&&i!=j)
                {
                    v.push_back(i);
                v.push_back(j);
                    f=1;
                    break;}
                
                
            
            }
            if(f==1)
                break;
        }
        return v;
    
    }
};