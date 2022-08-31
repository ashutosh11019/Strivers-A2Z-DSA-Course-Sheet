class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> brackets = new Stack<>();
        StringBuilder result = new StringBuilder();
        StringBuilder currentString = new StringBuilder();
        for(int i = 0; i < S.length(); i++)
        {           
            if(S.charAt(i) == '(')
            {
                brackets.push('(');
            }

            else if(S.charAt(i) == ')')
            {               
                brackets.pop();
            }            

            currentString.append(S.charAt(i));
            if(brackets.empty())
            {  
                result.append(currentString.substring(1, currentString.length() - 1));
                currentString = new StringBuilder();
            }
        }

        return result.toString();
    }
}


// class Solution {
//     public String removeOuterParentheses(String S) {
//         int top=-1;
//         String str="";
//         for(int i=0;i<S.length()-1;i++){
           
//             if(S.charAt(i)=='('&&++top!=0)
//            {
//                str+=S.charAt(i);
//            }
//             else if(S.charAt(i)==')'&&--top!=-1)
//             {
//                 str+=S.charAt(i);
//             }
          
//         }
//         return str;
//     }
// }