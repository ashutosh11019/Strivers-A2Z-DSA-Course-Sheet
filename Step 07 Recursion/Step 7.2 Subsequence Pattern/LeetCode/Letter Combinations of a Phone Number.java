class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> list = new ArrayList<String>();
        int n=digits.length();
        if(n==0){
           
        }
        else if(n==1){
            String str = map.get(digits.charAt(0)-'0');
            for(int i=0;i<str.length();i++){
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        else if(n==2){
            String str1 = map.get(digits.charAt(0)-'0');
            String str2 = map.get(digits.charAt(1)-'0');
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    String s = str1.charAt(i)+""+ str2.charAt(j);;
                    list.add(s);
                }
            }
        }
        else if(n==3){
            String str1 = map.get(digits.charAt(0)-'0');
            String str2 = map.get(digits.charAt(1)-'0');
            String str3 = map.get(digits.charAt(2)-'0');
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    for(int k=0;k<str3.length();k++){
                        String s = str1.charAt(i)+""+ str2.charAt(j)+""+str3.charAt(k);
                        list.add(s);
                    }
                }
            }
        }
        else if(n==4){
            String str1 = map.get(digits.charAt(0)-'0');
            String str2 = map.get(digits.charAt(1)-'0');
            String str3 = map.get(digits.charAt(2)-'0');
            String str4 = map.get(digits.charAt(3)-'0');
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    for(int k=0;k<str3.length();k++){
                        for(int l=0;l<str4.length();l++){
                             String s = str1.charAt(i) + "" +  str2.charAt(j) + "" + str3.charAt(k) + "" + str4.charAt(l);
                            list.add(s);
                        }
                    }
                }
            }
        }
        return list;
    }
}