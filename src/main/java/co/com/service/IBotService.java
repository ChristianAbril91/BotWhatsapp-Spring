package co.com.service;

import co.com.dto.MessageBodyDto;

/**
 * Interfaz de servicio para BotWhatsapp.
 * 
 * @author ChristianAbril91
 *
 */
public interface IBotService {
	
	public String sendMessage(MessageBodyDto message);

}
