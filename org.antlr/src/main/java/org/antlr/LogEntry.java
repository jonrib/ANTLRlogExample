package org.antlr;

import java.time.LocalDateTime;

public class LogEntry {
	private LogLevel level;
    private String message;
    private LocalDateTime timestamp;
	public LogLevel getLevel() {
		return level;
	}
	public void setLevel(LogLevel level) {
		this.level = level;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
    
    // getters and setters
}
