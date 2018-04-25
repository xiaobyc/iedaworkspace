package ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaobyc on 2018/4/23.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        ScheduledTaskService scheduledTaskService =  context.getBean(ScheduledTaskService.class);
        scheduledTaskService.fixTimeExecution();
        scheduledTaskService.reportCurrentTime();
        context.close();

    }
}
