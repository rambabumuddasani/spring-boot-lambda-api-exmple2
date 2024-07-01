package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamLambdaHandler run = new StreamLambdaHandler();
        run.handleRequest(null, null, null);
    }
}
