class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {
        unordered_map<int, int> intFrequency;

        for (int i : nums)
        {
            intFrequency[i]++;
            if (intFrequency[i] >= 2)
            {
                return true;
            }
        }
        return false;
    }
};