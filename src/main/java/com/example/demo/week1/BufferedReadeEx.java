package com.example.demo.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadeEx {
    public void readLine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());

    }
}
