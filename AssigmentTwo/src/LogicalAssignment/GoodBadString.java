package LogicalAssignment;

public class GoodBadString {

	public static int  isGoodOrBad(String S) {
		int vowelCount = 0;
		int consonentCount = 0;
		
		for (int i = 0;i<S.length();i++) {
			char c = S.charAt(i);
			
			if(c=='a' || c=='e'||c =='i'|| c=='o'|| c=='u'){
				vowelCount++;
				consonentCount = 0;
			} else if(c>'a' && c<'z') {
				consonentCount++;
				vowelCount=0;
			}
			if(vowelCount>5 || consonentCount>3) {
				return 1;
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
    String S="bcdaeiouae";
    isGoodOrBad(S);
	}

}
