package test4;

import java.util.*;
public class Main {
	
	public int[] solution(int n, int m, int[] arr) {
		int[] cache = new int[n];
		for(int x : arr) {
			int pos = -1;
			for(int i=0; i<n; i++) {
				if(x==cache[i]) {
					pos = i;
				}
			}
			if(pos==-1) {
				for(int i=n-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
			else {
				for(int j=pos; j>=1; j--) {
					cache[j] = cache[j-1];
				}
				cache[0] = x;
			}
		}
		return cache;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = in.nextInt();
		}
		for(int x : T.solution(n, m, arr)) {
			System.out.print(x + " ");
		}
	}

}
