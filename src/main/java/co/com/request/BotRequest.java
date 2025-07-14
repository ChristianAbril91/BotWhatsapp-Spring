package co.com.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase con los campos del request para el envío de mensajes.
 * 
 * @author ChristianAbril91
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BotRequest {
	
	@JsonProperty("messaging_product")
	private String messagingProduct;
	
	@JsonProperty("to")
	private String number;
	
	@JsonProperty("text")
	private TextRequest text;

}
