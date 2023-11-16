package LogicalAssignment;

public class AnagramOfString {

	public static int remAnagrm(String s1, String s2) {
		int[] count = new int[26];
		
		for(int i =0;i<s1.length();i++) {
			count[s1.charAt(i)-'a']++;
			
		}
		for(int i =0;i<s2.length();i++) {
			count[s2.charAt(i)-'a']--;
			
		}
		int result = 0;
		for(int i =0;i<26;i++) {
		result= result+Math.abs(count[i]);	
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String s1="bcadeh";
		String s2="hea";
		remAnagrm(s1,s2);
		
	}

}
