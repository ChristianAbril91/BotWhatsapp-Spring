package co.com.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import co.com.dto.MessageBodyDto;
import co.com.util.Constants;

/**
 * Clase servicio con la logica de negocio para el bot de envío de mensaje desde 
 * Whatsapp.
 * 
 * @author ChristianAbril91
 *
 */
@Service
public class BotServiceImpl implements IBotService{
	
	private static final Logger logger = LogManager.getLogger(BotServiceImpl.class);
	
	
	public String sendMessage(MessageBodyDto message) {
		
		logger.info("Iniciando el envío del mensaje...");
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(Constants.ACCESS_TOKEN);
        
        Map<String, Object> body = new HashMap<>();
        body.put("messaging_product", "whatsapp");
        body.put("recipient_type", "individual");
        
        Map<String, String> toField = new HashMap<>();
        toField.put("to", message.getNumber());
        body.put("to", message.getNumber());

        Map<String, String> text = new HashMap<>();
        text.put("body", message.getMessage());
        body.put("type", "text");
        body.put("text", text);
        
        
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(body, headers);
		
        logger.info("Mensaje enviado: " + requestEntity.toString() );
        
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.exchange(Constants.URL_DESTINO, HttpMethod.POST, requestEntity, String.class);

	        return response.getBody();
		} catch (RestClientResponseException e) {
			logger.error("Error al enviar el mensaje: {} - {}", e.getRawStatusCode(), e.getResponseBodyAsString());
		    throw new RuntimeException("Error al enviar el mensaje: " + e.getResponseBodyAsString(), e);
		}
	} 
	
}
