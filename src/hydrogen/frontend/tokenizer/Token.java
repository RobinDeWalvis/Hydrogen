package hydrogen.frontend.tokenizer;

import hydrogen.vcode.VirtualCode;

public class Token
{
	public EToken token;
	public String sequence;
	
	public Token(EToken token, String sequence)
	{
		this.token = token;
		this.sequence = sequence;
	}
	
	public String name()
	{
		return token.name();
	}
	
	public void parse(VirtualCode vcode)
	{
		token.parser.parse(vcode);
	}
}
