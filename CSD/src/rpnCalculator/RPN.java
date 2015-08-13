package rpnCalculator;

import java.util.Stack;


public class RPN {

	public void calculate(String input)
	{
		Stack st = new Stack();
		int result;
		
		for(String val : input.split("\\s"))
		{
			if(this.isNumber(val))
			{
				st.push(val);
			}
			else if(val.equals("+"))
			{
				int val2 = Integer.parseInt(st.pop().toString());
				int val1 = Integer.parseInt(st.pop().toString());
				result = val1 + val2;
				
				
				st.push(result);
			}
			else if(val.equals("-"))
			{
				int val2 = Integer.parseInt(st.pop().toString());
				int val1 = Integer.parseInt(st.pop().toString());
				result = val1 - val2;
				
				st.push(result);
			}
			
		}
		
		
	}
	
	public boolean isNumber(String value)
	{
		try
		{
			int val = Integer.parseInt(value);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
