package com.kulawik.basic.dependency_injection;

public class TextMessageService implements MessageService{
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending text [" + message + "] to: " + receiver);
    }
}
