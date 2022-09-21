class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> ans;
    
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        Collections.sort(A);
        ans = new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();
        solve(A, 0, B, sub);
        return ans;
    }
    
    static void solve(ArrayList<Integer> arr, int ind, int sum, ArrayList<Integer> sub){
        if(sum==0){
            if(!ans.contains(sub)) ans.add(new ArrayList<>(sub));
            return;
        }
        if(sum<0 || ind>=arr.size()) return;
        for(int i=ind;i<arr.size();i++){
            if(i>ind && arr.get(i)==arr.get(i-1)) continue;
            sub.add(arr.get(i));
            solve(arr, i, sum-arr.get(i), sub);
            sub.remove(sub.size()-1);
        }
    }
}