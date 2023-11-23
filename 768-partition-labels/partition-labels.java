class Solution {
    public static List<Integer> partitionLabels(String s) {
	List<Integer> partitions = new ArrayList<>();
	for(int i=0;i<s.length();) {
		int startIndex = i;
		int endIndex =  s.lastIndexOf(s.charAt(startIndex));
		
		for(int j=startIndex+1;j<=endIndex-1;j++) {
			int lastIndexOfNextChar = s.lastIndexOf(s.charAt(j));
			if(lastIndexOfNextChar > endIndex) {
				endIndex = lastIndexOfNextChar;
			}
		}
		partitions.add(endIndex - startIndex +1);
		i = endIndex+1;
	}
	
	return partitions;
    }
}