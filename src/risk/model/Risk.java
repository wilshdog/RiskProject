package risk.model;



public class Risk
{
	
	

	
	
	
	
	
	
	
	public String processConversation(String input)
	{
		String chatbotResponse = "";

		return chatbotResponse;
	}
	
	
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		
		if (input != null && input.length() > 2)
		{
			validLength = true;
		}
		
		return validLength;
	}
	
	public boolean quitChecker(String exitString)
	{
		if (exitString.equalsIgnoreCase("quit"))
		{
			return true;
		}
		return false;
	}
	
}
