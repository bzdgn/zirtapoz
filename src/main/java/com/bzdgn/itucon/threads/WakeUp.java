package com.bzdgn.itucon.threads;

import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

import com.bzdgn.itucon.comm.MessageSender;
import com.bzdgn.itucon.utilities.StaticMessages;

public class WakeUp {

	private static final String token = "xoxp-174817857810-175031220306-174364570112-e9bcd8d9ac5d697c99cdc2288ab061cc";
	private static final String user = "zirtapoz";
	private static final String channel = "C547B92TB"; // #general

	public static void main(String[] args) throws InterruptedException, IOException {

		final MessageSender ms = new MessageSender(token, channel, user);

		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("sending message");
				try {
					int randomNum = ThreadLocalRandom.current().nextInt(0, StaticMessages.MESSAGES.length);
					ms.sendMessage("MOTH: " + StaticMessages.MESSAGES[randomNum] + "\nDate: " + new Date());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		
		Timer timer = new Timer();
		timer.schedule(task, 01, 3600*1000l); //call the run() method at 1 second intervals
	}

}
