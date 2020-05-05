public static int firstUniqChar(String s) {
		Map<Character,Integer> m=new HashMap<>();
		for (int i = 0; i <s.length() ; i++) {
			char ch=s.charAt(i);
			if(m.containsKey(ch)){
				m.put(ch,m.get(ch)+1);
			}
			else{
				m.put(ch,1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if(m.get(s.charAt(i))==1){
				return i;
			}
		}
		return -1;
	}