public class Solution{
	public boolean validWordAbbreviation(String word, String abbr) {

		int i=0, j=0;
		cha[] s = word.toCharArray();
		cha[] t = abbr.toCharArray();

		while ( i < s.length && j < t.length) {
			if (Character.isDigit(t[j])){
				if ( t[j] == '0'){
					return false;
				}
				int val = 0;
				while ( j < t.length && Character.isDigit(t[j])){
					val = val * 10 + t[j] - '0';
					if (val < 0) {
						return false;
					}
					j++;
				}
				i += val;
			} else{
				if (s[i++] != t[j++]){
					return false;
				}
			}
		}
		return i == s.length && j == t.length;
	 }
}
