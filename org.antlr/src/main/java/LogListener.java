import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.antlr.LogEntry;
import org.antlr.LogLevel;

public class LogListener extends gramatikaBaseListener{
	private List<LogEntry> entries = new ArrayList<LogEntry>();
    private LogEntry current;
    
    @Override
    public void enterEntry(gramatikaParser.EntryContext ctx) {
        this.current = new LogEntry();
    }
    
    @Override
    public void enterTimestamp(gramatikaParser.TimestampContext ctx) {
        //this.current.setTimestamp(
          //LocalDateTime.parse(ctx.getText()));
    }
     
    @Override
    public void enterMessage(gramatikaParser.MessageContext ctx) {
        this.current.setMessage(ctx.getText());
    }
     
    @Override
    public void enterLevel(gramatikaParser.LevelContext ctx) {
        //this.current.setLevel(LogLevel.valueOf(ctx.getText()));
    }
    
    public void exitLogEntry(gramatikaParser.EntryContext ctx) {
        this.entries.add(this.current);
    }

	public List<LogEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<LogEntry> entries) {
		this.entries = entries;
	}

	public LogEntry getCurrent() {
		return current;
	}

	public void setCurrent(LogEntry current) {
		this.current = current;
	}
}
