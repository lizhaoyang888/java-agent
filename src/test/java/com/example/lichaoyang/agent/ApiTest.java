package com.example.lichaoyang.agent;

/**
 * VM options：
 * -javaagent:C:\GitProjects\java-agent\target\java-agent-1.0.0-SNAPSHOT.jar=testargs
 */

public class ApiTest {

    public static void main(String[] args) throws Exception {
        ApiTest apiTest = new ApiTest();
        apiTest.echoHi();

    }

    private void echoHi() throws InterruptedException {
        System.out.println("hi agent");
        Thread.sleep((long) (Math.random() * 500));
    }
}
