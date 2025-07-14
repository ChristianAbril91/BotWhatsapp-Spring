### 📘 Descripción del Proyecto
BotWhatsapp es una API REST desarrollada en Java con Spring Boot, diseñada para permitir el envío de mensajes a través de un bot de WhatsApp de manera sencilla y escalable. Este proyecto fue creado como una práctica de desarrollo backend aplicando principios de arquitectura limpia, SOLID, e integración de capas desacopladas.

### 🛠️ Tecnologías utilizadas
Java 17

Spring Boot | Spring Web (REST) | Maven | Lombok | Docker (opcional) | Postman (para pruebas)

### 🧱 Arquitectura
El proyecto sigue una arquitectura por capas y desacoplada:

Controller → DTO → Service (Interface) → ServiceImpl → Util
Controladores gestionan las solicitudes HTTP.
DTOs estructuran los datos recibidos/enviados.
Servicios encapsulan la lógica de negocio.
Utilidades complementan funciones comunes o constantes.

Esto permite mantener el código organizado, reutilizable y fácilmente testeable.

### 🎯 Objetivos del Proyecto
Crear un API REST básica para enviar mensajes por WhatsApp.

Implementar arquitectura limpia y principios SOLID.

Aplicar buenas prácticas en organización de código y separación de responsabilidades.

Ser base para futuros desarrollos más complejos (como bots integrados con otras plataformas).

#### Body esperado:
```json
{
  "message": "Hola desde Spring Boot!",
  "recipient": "3001234567"
}
```

#### Respuesta:
```json
{
  "status": "success",
  "message": "Mensaje enviado correctamente"
}
```

---

## ▶️ Cómo ejecutar

1. Clona el repositorio:
```bash
git clone https://github.com/tuusuario/BotWhatsapp-Spring.git
```

2. Navega al proyecto:
```bash
cd BotWhatsapp-Spring
```

3. Ejecuta desde tu IDE (Spring Tool Suite / IntelliJ / VS Code) o por consola:
```bash
./mvnw spring-boot:run
```
4. Se debe generar la configuración en facebook developer para poder obtener el access token necesario para enviar los mensajes

---

## ✍️ Autor
Christian Stiven Abril Nieto  
[LinkedIn](https://www.linkedin.com/in/christian-stiven-abril-nieto) | chstab@hotmail.com
