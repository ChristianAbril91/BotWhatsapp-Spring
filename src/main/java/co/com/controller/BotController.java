package co.com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.dto.MessageBodyDto;
import co.com.service.IBotService;

/**
 * Clase controlador que expone las operaciones Rest BotWhatsapp.
 * 
 * @author ChristianAbril91
 */
@RestController
@RequestMapping("/api/v1/whatsapp")
public class BotController {
	
	private final IBotService iBotService;
	
	public BotController(IBotService iBotService) {
		this.iBotService = iBotService;
	}
	
	@PostMapping("/enviar")
	public String enviar(@RequestBody MessageBodyDto message){
		return iBotService.sendMessage(message);
	}

}
