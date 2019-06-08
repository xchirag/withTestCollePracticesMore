package collectionExercises;

public class StringMan {

	private int countChar(char c, String t) {
		// TODO Auto-generated method stub
		//return 0;
		int counter = 0;
		int len = t.length();
		for(int i=0; i<t.length() ;i++){
			if(c == t.charAt(i)){
				counter++;
			}
		}
			return counter;
	}
	
	public static void main(String[] args) {

		StringMan sm = new StringMan();
		

		String s = "hellothere";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String t = s.substring(i,s.length());
//			System.out.println(c);
//			System.out.println(t);
			int count = sm.countChar(c, t);
			System.out.println(c+ "    "+ count);
			t = sm.replace(t, c);
						
		}

		
	}

	private String replace(String t, char c) {
		for (int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == c)
				t.replace(c, ' ');
		}
		return t;
	}

	
}


//String s = "Hello There";
		// int count = 1;
		// for(int i=0; i<s.length(); i++){
		// char temp = s.charAt(i);
		// //String temp = s.substring(beginIndex)
		// String tempS = s.substring(i, s.length());
		// System.out.println(tempS.length() +" " + tempS );
		// //System.out.print(tempS.length());
		// for(int j=0; j<tempS.length(); j++){
		// //System.out.print(tempS.length());
		// //if(tempS.charAt(j) == temp)
		// //System.out.println(temp);
		// }
		// }
		// }