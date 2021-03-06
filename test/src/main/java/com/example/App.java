package com.example;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    /* 조건 3가지 
        1.1부터 N까지 자연수 중에서 M개를 고른 수열
        2.같은 수를 여러 번 골라도 된다.
        3.고른 수열은 비내림차순이어야 한다.
        4. 길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다. 
        5. 1 <= M <= N <= 8
    */  
    static int[] buf = {0,0,0,0,0,0,0,0,0,0};
    static int N = 0;
    static int M = 0;
    public static void output(int per_var, int count){
        if(M == count){ // M개의 항이 있는 경우만 출력
            for(int i=0;i<M;i++)
            {
                System.out.print(buf[i] + " ");
                
            }
            System.out.println();
            return;
        }
        
        buf[count] = per_var;
        for(int i=0;i<=N-per_var;i++){
            buf[count] += i;
            output(buf[count], count+1);
            buf[count] -= i;
        } 
    }


    public static void main( String[] args ) throws Exception
    {
        
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bfr.readLine());
        N = Integer.parseInt((st.nextToken()));
        M = Integer.parseInt((st.nextToken()));
        
        output(1,0);
        
        
    }
}

/*
 1st submit , fail  ->  51~53 줄 이전 코드 수정 안해서 오류 발생
 2nd submit , success
 memory : 21476KB, time : 664ms

 code analysis

 
 private static void go(char start_value, char max_value, int len, char[] buff, int index) {
		if(len == 0) sb.append(buff).append('\n'); -> StringBuilder에 buff의 내용과 줄바꿈 개행문자 추가 (시간 단축?)
		else {
			for (char i = start_value; i < max_value; i++) {  -> char로 메모리 단축?
				buff[index] = i;
				buff[index + 1] = ' ';
				go(i, max_value, len - 1, buff, index + 2);
			}
		}
	}
*/
