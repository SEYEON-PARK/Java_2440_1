/*
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해서

class Main{ // Main 클래스
    public static void main(String [] args){ // main 메소드
        Scanner a=new Scanner(System.in);
        int N=a.nextInt();
        
        for (int i=N;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
