class Solution {
    public int fib(int n) {
        if (n == 0 || n==1) return n;
		int n_1 = 1,  sum = 0, n_2 = 0;
		for (int i = 1; i<n; i++) {
			sum = n_1+ n_2;
            n_2=n_1;
			n_1 = sum;
			
		}
		return n_1;     
    }
}