package pro.sky.telegrambot.listener;

import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.response.SendResponse;

public interface CatsDogsInterface {
    SendResponse getMenu(Update update);
    SendResponse stepOne(Update update);
    SendResponse sendAddress (Update update);
    SendResponse autoPass (Update update);
    SendResponse beSafe (Update update);
    SendResponse giveMeYourName (Update update);
    void saveUser(Message message);
    SendResponse volunteer(Update update);
}
