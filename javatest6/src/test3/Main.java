package test3;

import java.util.*;
public class Main {

	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			int tmp = arr[i];
			int j;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>tmp) {
					arr[j+1] = arr[j];
				}
				else break;
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
