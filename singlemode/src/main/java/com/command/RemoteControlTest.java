package com.command;

/**
 * Created by xiaobyc on 2017/12/18.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote =  new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        remote.setSlot(command);
        remote.buttonWasPressed();

    }
}
