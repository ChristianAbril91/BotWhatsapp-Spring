package co.com.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase con los campos del response de contacts para Bot Whatsapp.
 * 
 * @author ChristianAbril91
 *
 */
@Getter
@Setter
@JsonPropertyOrder({
	"input",
	"wa_id"
})
public class ContactsResponse {
	
	@JsonProperty("input")
	private String input;
	
	@JsonProperty("wa_id")
	private String waId;

}
