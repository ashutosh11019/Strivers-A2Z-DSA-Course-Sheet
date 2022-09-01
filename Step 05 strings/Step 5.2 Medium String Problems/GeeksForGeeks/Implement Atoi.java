class Solution
{
    int atoi(String str) {
	// Your code here
	    int flag=0,i=0,n=0;
	    while(i<str.length()){
	        char ch = str.charAt(i);
	        if(ch >= '0' && ch <= '9' || ch=='-'){
	            if(ch=='-') flag++;
	            else n=n*10+(ch-48);
	            if(flag>1) return -1;
	        }else{
	            return -1;
	        }
	        i++;
	    }
	    if(flag==1) n=-n;
	    return n;
    }
}