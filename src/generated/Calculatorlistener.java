package generated;
import java.util.Stack;

public class Calculatorlistener extends WHILEBaseListener {
	
	private Stack<Integer> stack = new Stack<Integer>();
	
	@Override public void exitProgram(WHILEParser.ProgramContext ctx) 
	{
		System.out.println( ctx.getText() + " = " + this.stack.pop() );
	}
		
	@Override public void exitAddition(WHILEParser.AdditionContext ctx) 
	{ 
		System.out.println("Add : " + ctx.sv );
		this.stack.push(ctx.sv);
	}
	@Override public void exitSubtraction(WHILEParser.SubtractionContext ctx) 
	{
		System.out.println("Sub : " + ctx.sv );
		this.stack.push(ctx.sv);
	}
	@Override public void exitMultiplication(WHILEParser.MultiplicationContext ctx) 
	{
		System.out.println("Mul : " + ctx.sv );
		this.stack.push(ctx.sv);
	}


}
