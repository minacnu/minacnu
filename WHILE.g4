grammar WHILE;
@header { 
package generated;
import static main.InputNvalue.GetIdentValue;
}

program	: aexpr;
aexpr returns [int sv]
	: N=Number {
		String n = $N.getText(); 
		$sv = Integer.parseInt(n);
	} #Num
	| IDENT {
		String id = $IDENT.getText();
		$sv = (GetIdentValue(id));
	} #Ident
	| a1=aexpr '*' a2=aexpr	
	{
		$sv = ($a1.sv * $a2.sv);
	} #Multiplication
	| a1=aexpr '+' a2=aexpr
	{
		$sv = ($a1.sv + $a2.sv);
	} #Addition

	| a1=aexpr '-' a2=aexpr	
	{
		$sv = ($a1.sv - $a2.sv);
	} #Subtraction
	;

Number : ('0'..'9')
	;
	
IDENT : [x]	
	;

