package co.com.request;
/**
 * Clase con los campos del request para la apliacación.
 * 
 * @author ChristianAbril91
 *
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TextRequest {
	
	@JsonProperty("body")
	private String body;

}
