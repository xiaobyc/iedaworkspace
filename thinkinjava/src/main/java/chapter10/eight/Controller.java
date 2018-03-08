package chapter10.eight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaobyc on 2017/3/5.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event event){
        eventList.add(event);
    }
    public  void run(){
        while (eventList.size()>0){
            for (Event event:eventList){
                if(event.ready()){
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
