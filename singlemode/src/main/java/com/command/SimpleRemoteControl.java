package com.command;

/**
 * Created by xiaobyc on 2017/12/18.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public Command getSlot() {
        return slot;
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
