package com.fucct.springbatchpractice.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class NewTasklet implements Tasklet {
    private int count = 0;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        if (count > 10) {
            System.out.println("Tasklet Finished");
            return RepeatStatus.FINISHED;
        }
        count++;
        System.out.println("Tasklet continuable");
        return RepeatStatus.CONTINUABLE;
    }
}
