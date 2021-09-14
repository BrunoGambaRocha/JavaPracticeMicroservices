package br.com.brunoti.mentoriamicroservicos.job;

import java.sql.Timestamp;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobMentoria {
	
	@Scheduled(cron = "*/10 * * * * *")
	public void execute() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		System.out.println("JobMentoria - Início: " + timestamp);
	}
}
