package co.com.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase con los campos del response para Bot Whatsapp.
 * 
 * @author ChristianAbril91
 *
 */
@Getter
@Setter
@JsonPropertyOrder({
	"messaging_product",
	"contacts",
	"messages"
})
public class BotResponse {
	
	@JsonProperty("messaging_product")
	private String messagingProduct;
	
	@JsonProperty("contacts")
	private ContactsResponse contacts;
	
	@JsonProperty("messages")
	private MessageResponse messages;

}
