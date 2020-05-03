public static boolean canConstruct(String x, String y) {

		if((x==null && y==null) || (x.length()==0 && y.length()==0))
			return true;
		int[] arr=new int[26];
		for (int i = 0; i < y.length(); i++) {
			arr[y.charAt(i)-'a']++;
		}
		for (int i = 0; i < x.length(); i++) {
			arr[x.charAt(i)-'a']--;
		}
		for (int i = 0; i <26 ; i++) {
			if(arr[i]<0)
				return false;
		}
		return true;
	}
	/*
	 when you read ques carefully, its simple question of finding if one string is anagram of other.
	 so simply store count of characters in one string, and see if all character of ransomNote is contained 
	 in array or not.
	 */
