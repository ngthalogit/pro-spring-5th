package com.tlo.prospring5.helloworld.decoupled;

public interface MessageRender {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
