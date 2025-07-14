package co.com.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase con los campos del response de messages para Bot Whatsapp.
 * 
 * @author ChristianAbril91
 *
 */
@Getter
@Setter
public class MessageResponse {
	
	@JsonProperty("id")
	private String id;

}
