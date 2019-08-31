package com.akvone.core;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CoreService {

  @Scheduled(cron = "0 * * * * ?")
  public void cronTask() {
    System.out.println("Some work here");
  }
}
