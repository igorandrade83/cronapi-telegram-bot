package cronapi.telegram.bots.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InlineKeyboardMarkup implements ReplyMarkup {
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }
}
