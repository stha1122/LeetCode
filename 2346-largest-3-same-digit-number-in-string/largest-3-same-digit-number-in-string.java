class Solution {
    public String largestGoodInteger(String num) {
        CharSequence[] digits = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
		for (int i = 0; i < digits.length; i++) {
			if (num.contains(digits[i])) {

				return (String) digits[i];
			}
			;

		}
		return "";

    }
}