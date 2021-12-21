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

    public static void main( String[] args ) throws Exception
    {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int N =3, M=4;
        StringTokenizer st;
        //st = new StringTokenizer(bfr.readLine());
        //N = Integer.parseInt((st.nextToken()));
        //M = Integer.parseInt((st.nextToken()));
        System.out.println("N:"+N+"M:"+M);
        
    }
}
