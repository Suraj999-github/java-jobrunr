package com.job;

//import org.jobrunr.configuration.JobRunr;
//import org.jobrunr.scheduling.BackgroundJob;
//import org.jobrunr.configuration.JobRunr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//import com.jobs.services.FireAndForgetJobs;


@SpringBootApplication(scanBasePackages = { "com.job.controllers"})
@ComponentScan(basePackages = "com.jobs.*")
//@EntityScan(basePackages = "com.job.controllers")
public class JobrunrApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobrunrApplication.class, args);
		 //  BackgroundJob.enqueue(() -> new FireAndForgetJobs());
		   //JobRunr.configure();
		   
		// JobRunr.configure();
	}

}
