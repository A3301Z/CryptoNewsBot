package org.example;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.PhoneNumberHandler.isItPhoneNumber;

public class MyBot extends TelegramLongPollingBot {
	@Override
	public String getBotToken() {
		return "6426005210:AAG_upUieQAklzg05YvF88RERZE6fkJpraw";
	}

	@Override
	public String getBotUsername() {
		return "GetGetNews_Bot";
	}

	@Override
	@SneakyThrows
	public void onUpdateReceived(Update update) {
		MessageHandler handler = new MessageHandler();
		Message message = update.getMessage();
		long chatID = update.getMessage().getChatId();

		SendMessage sendMessage = new SendMessage();

		sendMessage.setChatId(chatID);
		sendMessage.setText(handler.handleMessage(message));

		execute(sendMessage);
	}

	public static class MessageHandler {
		public String handleMessage(Message message) {
			String response = "";
			String textFromUser = message.getText();

			if (textFromUser.equalsIgnoreCase("/start")) {
				response = """
						Выбери, что тебя интересует.
						1) Новости криптовалют.
						2) Новости из мира IT.
						3) Актуальный курс криптовалют.""";
			} else if (textFromUser.contains("крипт") || textFromUser.contains("Крипт")) {
				response = "показываю новости криптовалют";
			} else if (textFromUser.contains("курс") && textFromUser.contains("Курс")) {
				response = "показываю курс криптовалюты";
			}
			return response;
		}
	}
}
