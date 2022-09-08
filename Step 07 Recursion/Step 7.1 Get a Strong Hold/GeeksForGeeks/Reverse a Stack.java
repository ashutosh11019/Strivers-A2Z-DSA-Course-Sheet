class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        for(int i=0;i<s.size();i++) helper(s, s.pop(), i);
    }
    
    static void helper(Stack<Integer> s, int num, int n){
        if(n==s.size()) s.push(num);
        else{
            int val=s.pop();
            helper(s, num, n);
            s.push(val);
        }
    }
}