package com.tlo.prospring5.helloworld.decoupled;

public class HelloWorldDecoupledFactory {
    public static void main(String... args) {
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        MessageRender mr = MessageSupportFactory.getInstance().getMessageRender();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
