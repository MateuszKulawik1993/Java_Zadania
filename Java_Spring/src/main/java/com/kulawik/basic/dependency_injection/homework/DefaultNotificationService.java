package com.kulawik.basic.dependency_injection.homework;

public class DefaultNotificationService implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Package will be delivered on:"+address );
    }

    @Override
    public void fail(String address) {
        System.out.println("Package will not be delivered on:" +address );
    }
}
