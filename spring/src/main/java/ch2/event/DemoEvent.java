package ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by xiaobyc on 2018/4/23.
 */
public class DemoEvent extends ApplicationEvent {
    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg =msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
