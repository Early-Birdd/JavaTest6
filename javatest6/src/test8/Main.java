package test8;

import java.util.*;
public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = 0;
		int rt = n-1;
		Arrays.sort(arr);
		while(lt<=rt) {
			int mid = (lt + rt) / 2;
			if(arr[mid]==m) {
				return mid+1;
			}
			else {
				if(arr[mid]>m) {
					rt = mid - 1;
				}
				else {
					lt = mid + 1;
				}
			}
		}
		return answer;
	}	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
