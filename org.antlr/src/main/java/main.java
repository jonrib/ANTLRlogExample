

import org.antlr.LogEntry;
import org.antlr.LogLevel;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		whenLogContainsOneErrorLogEntry_thenOneErrorIsReturned();
	}
	
	public static void whenLogContainsOneErrorLogEntry_thenOneErrorIsReturned()
	  throws Exception {
		String logLine ="2018-May-05 14:20:24 ERROR Bad thing happened\n";
		ParseTreeWalker walker = new ParseTreeWalker();
		gramatikaLexer lexer = new gramatikaLexer(CharStreams.fromString(logLine));

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		gramatikaParser parser = new gramatikaParser(tokens);
	    
	 
	    // instantiate the lexer, the parser, and the walker
	    LogListener listener = new LogListener();
	    walker.walk(listener, parser.log());
	    LogEntry entry = listener.getCurrent();
	    
	    System.out.println( entry.getMessage());
	   	
	}

}
