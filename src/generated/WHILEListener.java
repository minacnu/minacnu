// Generated from WHILE.g4 by ANTLR 4.7.2
 
package generated;
import static main.InputNvalue.GetIdentValue;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WHILEParser}.
 */
public interface WHILEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(WHILEParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(WHILEParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(WHILEParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(WHILEParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterIdent(WHILEParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitIdent(WHILEParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(WHILEParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(WHILEParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterNum(WHILEParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitNum(WHILEParser.NumContext ctx);
}