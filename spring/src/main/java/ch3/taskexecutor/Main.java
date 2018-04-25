package ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaobyc on 2018/4/23.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
         for(int i=0;i<10;i++){
             asyncTaskService.executeAsyncTask(i);
             asyncTaskService.executeAsyncTaskPlus(i);
         }
    }
}
