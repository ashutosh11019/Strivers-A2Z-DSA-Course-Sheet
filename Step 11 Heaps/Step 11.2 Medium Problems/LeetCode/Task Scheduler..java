class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] ans = new int[26];
        int max=0, c=0;
        for(char task: tasks){
            ans[task-'A']++;
            if(max==ans[task-'A']) c++;
            else if(max<ans[task-'A']){
                max = ans[task-'A'];
                c=1;
            }
        }
        
        int co = max-1, l = n-(c-1), emp = co*l;
        int t = tasks.length - max * c;
        int res = Math.max(0, emp-t);
        return tasks.length+res;
    }
}