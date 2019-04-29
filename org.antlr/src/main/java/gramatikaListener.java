// Generated from gramatika.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatikaParser}.
 */
public interface gramatikaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatikaParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(gramatikaParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatikaParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(gramatikaParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatikaParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(gramatikaParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatikaParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(gramatikaParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatikaParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(gramatikaParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatikaParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(gramatikaParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatikaParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(gramatikaParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatikaParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(gramatikaParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatikaParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(gramatikaParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatikaParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(gramatikaParser.MessageContext ctx);
}