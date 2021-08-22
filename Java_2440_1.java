/*
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/

import java.util.*; // 스캐너를 사용하기 위해서

class Main{ // Main 클래스
    public static void main(String [] args){ // main 메소드
        Scanner a=new Scanner(System.in); // 새로운 스캐너 a 생성하기
        int N=a.nextInt(); // 사용자로부터 정수 입력받기
        
        for (int i=N;i>0;i--){ // i가 N부터 0보다 클 때까지 1씩 감소하며 반복
            for (int j=i;j>0;j--){ // j가 i부터 0보다 클 때까지 1씩 감소하며 반복
                System.out.print("*"); // 별 출력하기
            }
            System.out.println(); // 한 줄 띄기
        }
    }
}
