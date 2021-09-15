package br.com.brunoti.mentoriamicroservicos.job;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.brunoti.mentoriamicroservicos.entity.Setting;
import br.com.brunoti.mentoriamicroservicos.repository.SettingRepository;

@Component
public class JobMentoria {
	@Autowired
	private SettingRepository repository;	
	
	@Scheduled(cron = "*/10 * * * * *")
	public void execute() {
		Setting setting = new Setting();
		setting.setCriatedIn(new Timestamp(System.currentTimeMillis()));
		setting.setStatus(Boolean.FALSE);
		
		repository.save(setting);		
	}
}
