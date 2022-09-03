class Solution {
    public int myAtoi(String s) {
        if (s.equals("")) {
			return 0;
		}
		int res = 0, i = 0, sign = 1;
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			if (s.charAt(i++) == '-') {
				sign = -1;
			}
		}
		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
				if (sign == -1) {
					return Integer.MIN_VALUE;
				}
				return Integer.MAX_VALUE;
			}
			res = res * 10 + (s.charAt(i++) - '0');
		}
		return sign * res;
    
    }
}