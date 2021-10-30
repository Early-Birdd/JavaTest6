package test1;

import java.util.*;
public class Main {

	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[idx]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
			a.add(arr[i]);
		}
		return a;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner (System.in);
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
