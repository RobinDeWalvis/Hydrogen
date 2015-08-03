package hydrogen.frontend.parser.expression;

import hydrogen.Strings;
import hydrogen.frontend.error.ParseError;
import hydrogen.frontend.token.EDataType;
import hydrogen.frontend.token.Token;
import hydrogen.vcode.VirtualCode;
import hydrogen.vcode.instruction.PushConstant;
import hydrogen.vcode.variable.Constant;

public class ConstantParser implements IExpressionParser
{
	EDataType dataType;
	
	public ConstantParser(EDataType dataType)
	{
		this.dataType = dataType;
	}
	
	@Override
	public void parse(VirtualCode vcode)
	{
		vcode.add(new PushConstant(new Constant(dataType, dataType.parse(vcode.currentToken()))));
	}

	@Override
	public void closeExpression(Token token, VirtualCode vcode)
	{
		throw new ParseError(Strings.TOKEN_ERROR.f(token.name()));
	}
}
