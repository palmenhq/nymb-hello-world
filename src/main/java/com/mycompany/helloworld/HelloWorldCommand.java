package com.mycompany.helloworld;

import org.nymbframework.core.commandline.NymbCommand;
import picocli.CommandLine;

@CommandLine.Command(name = "hello-world")
public class HelloWorldCommand implements NymbCommand {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello, world!");
        return 0;
    }
}
