package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
	@Override
	public String getBotToken() {
		return "";
	}	
	@Override
	public String getBotUsername() {
		return "";
	}
	@Override
	public void onUpdateReceived(Update update) {
		
	}

	public class MessageHandler {

	}
}
