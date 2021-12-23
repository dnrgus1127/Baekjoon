package com.example;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;
/**
 * 오큰수 
 * A의 오큰수는 A보다 오른쪽에 있으면서 A보다 큰 수 중 가장 왼쪽에 있는 수 
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Stack<Integer> stack_I = new Stack<>();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        stack_I.push(0);
        for(int i=1;i<n;i++){
    
            while(input[stack_I.peek()] < input[i]){
                input[stack_I.pop()] = input[i];
                if(stack_I.empty() == true){
                    break;
                }
            }
            stack_I.push(i);
        }
        while(stack_I.empty() == false){
            input[stack_I.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n-1;i++){
            sb.append(input[i]).append(' ');
        }
        sb.append("-1");

        System.out.println(sb);
    }
}
