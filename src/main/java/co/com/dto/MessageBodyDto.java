package co.com.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase DTO que gestiona data para la entrada de datos de la aplicación.
 * 
 * @author ChristianAbril91
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class MessageBodyDto {
	
	private String number;
	private String message;

}
