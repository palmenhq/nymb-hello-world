package com.mycompany.helloworld;

import io.javalin.Javalin;
import org.nymbframework.core.NymbApplication;

public class HelloWorldApplication {
    public static void main(String[] args) {
        final NymbApplication nymbApplication = NymbApplication.create("/config.properties");
        nymbApplication.getEnvironment().get(Javalin.class)
            .get("/hello-world", ctx ->{
                ctx.result("Hello, world!");
            });
        nymbApplication.getEnvironment()
            .registerCommand(new HelloWorldCommand());
        nymbApplication.run(args);
    }
}
