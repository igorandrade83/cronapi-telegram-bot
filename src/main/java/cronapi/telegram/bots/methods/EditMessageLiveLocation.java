package cronapi.telegram.bots.methods;

import com.fasterxml.jackson.core.type.TypeReference;
import cronapi.telegram.bots.models.InlineKeyboardMarkup;
import cronapi.telegram.bots.models.Message;
import java.io.IOException;
import java.io.Serializable;

public class EditMessageLiveLocation extends JsonMethod<Serializable> {

    private String chatId;
    private Integer messageId;
    private String inlineMessageId;
    private Float latitude;
    private Float longitud;
    private InlineKeyboardMarkup replyMarkup;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    protected Response<Serializable> readResponse(String content) throws IOException {
        try {
            return OBJECT_MAPPER.readValue(content, new TypeReference<Response<Message>>() {
            });
        } catch (IOException e) {
            return OBJECT_MAPPER.readValue(content, new TypeReference<Response<Boolean>>() {
            });
        }
    }
}