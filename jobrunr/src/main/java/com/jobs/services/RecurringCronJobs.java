package com.jobs.services;

import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.scheduling.BackgroundJob;
import org.jobrunr.spring.annotations.Recurring;
import org.springframework.stereotype.Service;

@Service
public class RecurringCronJobs {
	@Recurring(id = "Recuring-job-1", cron = "*/2 * * * *")//Every Two Minute
    @Job(name = "Recuring job 1")
    public void job1() {
        // Your background job logic here
        System.out.println("Recurring cron job first executed!");
    }	
	
	@Recurring(id = "Recuring-job-2", cron = "* * * * *") // Every minute
    @Job(name = "Recuring job 2")
    public void job2() {
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 1 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 2 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 3 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 4 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 5 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 6 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 7 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 8 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 9 executed!"));
		BackgroundJob.enqueue(() -> System.out.println("enqueue cron job 10 executed!"));
        // Your background job logic here
        System.out.println("Recurring cron job 2 executed!");
    }
	
	
	@Recurring(id = "Recuring-job-3", cron = "*/5 * * * *") // Every 5 minute
    @Job(name = "Recuring job 3")
    public void job3() {
        // Your background job logic here
        System.out.println("Recurring cron job 3 executed!");
    }
	
	@Recurring(id = "Recuring-job-4", cron = "*/30 * * * *") // Every 30 minute
    @Job(name = "Recuring job 4")
    public void job4() {
        // Your background job logic here
        System.out.println("Recurring cron job 4 executed!");
    }
	@Recurring(id = "Recuring-job-5", cron = "0 * * * *") // Every hour
    @Job(name = "Recuring job 5")
    public void job5() {
        // Your background job logic here
        System.out.println("Recurring cron job 5 executed!");
    }
	@Recurring(id = "Recuring-job-6", cron = "0 */2 * * *") // Every 2 hour
    @Job(name = "Recuring job 6")
    public void job6() {
        // Your background job logic here
        System.out.println("Recurring cron job 6 executed!");
    }
	
	@Recurring(id = "Recuring-job-7", cron = "0 0 * * 0") // Every Sunday (0 represents Sunday)
    @Job(name = "Recuring job 7")
    public void job7() {
        // Your background job logic here
        System.out.println("Recurring cron job 7 executed!");
    }
	
	@Recurring(id = "Recuring-job-8", cron = "0 0 * * 1") // Every Monday (0 represents Sunday)
    @Job(name = "Recuring job 8")
    public void job8() {
        // Your background job logic here
        System.out.println("Recurring cron job 8 executed!");
    }


}
