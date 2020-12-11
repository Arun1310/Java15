class Amoungus
{
	public static void main(String[] args)
	{
		Amoungus p = new Amoungus();
		char start = 'Y';
		String server = "ASIA";
		while(start == 'Y')
		{
			switch(server)
			{
				case "ASIA":
					p.Amoungus();
					break;
				case "EUROPE":
					System.out.println("Match cannot be starts in this server ");
					break;
				default:
					System.out.println("Match cannot be starts in other Sever Except Asia");
					break;
				
			}
			System.out.println("Do you want to start again (Y/N): ");
			start = 'N';
		}
		
	}
	public void Amoungus()
	{
		int players= 3;
		boolean red = true;
		boolean black = true;
                boolean white = true;
                if(players >= 3)
		{	
			if((red == true) && (black == true) && (white == true))
			{
				System.out.println("Match will be Started");
			}
			  else
			{
				System.out.println("Need more players");
			}
		}
		else
		{
			System.out.println("Need minimum 3 players");
		}
	}	
}