package com.tlo.prospring5.helloworld.decoupled;

public class HelloWorldDecoupled {
    public static void main(String... args) {
        MessageProvider mp = new HelloWorldMessageProvider();
        MessageRender mr = new StandardOutMessageRender();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
