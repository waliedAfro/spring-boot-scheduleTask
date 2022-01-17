package com.afro.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger  log = LoggerFactory.getLogger(ScheduledTasks.class);
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	
	@Scheduled(fixedRateString = "${app.schedule.fixed.rate}")
	public void reportCurrentTime()
	{
		log.info("The time is now {}"+sdf.format(new Date()));
		
	}
	
}
