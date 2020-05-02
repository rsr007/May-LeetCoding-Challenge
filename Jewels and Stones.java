public static int numJewelsInStones(String J, String S) {

		int[] cnt = new int[123];
		for (char c : S.toCharArray())
			cnt[c]++;
		int ans = 0;
		for (char c : J.toCharArray())
			ans += cnt[c];
		return ans;
	}

	/*
	  Explanation:
	  ------------
		Simply take an array of length 123 (since max ascii value of alphabets is of 'z'=122).
		Make count of stones of different type and then check jewel array and add count of stones
		of type jewel to answer.
		finally return the answer
	*/
