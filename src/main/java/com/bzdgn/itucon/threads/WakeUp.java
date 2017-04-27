package com.bzdgn.itucon.threads;

import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

import com.bzdgn.itucon.comm.MessageSender;
import com.bzdgn.itucon.utilities.Utils;

public class WakeUp {
	private static final String token = Utils.getPropertyFromConfigFile("access-token");
	private static final String user = Utils.getPropertyFromConfigFile("user");
	private static final String channel = Utils.getPropertyFromConfigFile("channel"); // #general

	public static void main(String[] args) throws InterruptedException, IOException {

		final MessageSender ms = new MessageSender(token, channel, user);

		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("sending message");
				try {
					int messageCount = Integer.parseInt(Utils.getPropertyFromConfigFile("MOTH_static_messages.properties", "message_count"));
					int randomNum = ThreadLocalRandom.current().nextInt(0, messageCount);
					
					String randomMessage = Utils.getPropertyFromConfigFile("MOTH_static_messages.properties", Integer.toString(randomNum));
					
					ms.sendMessage("MOTHD: " + randomMessage + "\nDate: " + new Date());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		
		Timer timer = new Timer();
//		timer.schedule(task, 01, 3600*1000l); //call the run() method at 1 hour intervals
		timer.schedule(task, 01, 1000l); //call the run() method at 1 second intervals
	}

}
