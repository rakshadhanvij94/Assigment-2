package LogicalAssignment;

public class SubsequenceOfString {

	public static boolean isSubSequence(String A,String B) {
		
		int i = 0 , j=0;
		while(i<A.length() && j<B.length()) {
			if(A.charAt(i)==B.charAt(j)) {
			i++;	
			}
			j++;
		}
		return i==A.length();
	}
	public static void main(String[] args) {
		String s1="gksrek";
		String s2="geeksforgeeks";
		isSubSequence(s1,s2);
	}

}
