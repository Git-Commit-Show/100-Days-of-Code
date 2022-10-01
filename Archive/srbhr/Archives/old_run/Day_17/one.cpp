class Solution
{
public:
    vector<int> getConcatenation(vector<int> &nums)
    {

        int len = nums.size();
        int t = 0;
        vector<int> ans;
        while (t < 2)
        {
            for (int i : nums)
            {
                ans.push_back(i);
            }
            t++;
        }

        return ans;
    }
};