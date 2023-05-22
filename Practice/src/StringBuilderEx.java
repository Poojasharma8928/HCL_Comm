

	public class StringBuilderEx {

		public static void main(String[] args) 
		{ 
			long time = System.currentTimeMillis(); 
			StringBuilder builder= new StringBuilder("hello");
		

		StringBuffer buffer = new StringBuffer("hello");

		for (int i=0; i< 100; i++)
		{
			
			builder.append(" java");
		}

		System.out.println("Time takes by builder "
				+ System.currentTimeMillis());

		for (int j = 0; j < 100; j++) 
		{
			 buffer.append(" java");
		}
		
		System.out.println("Time takes by buffer  " + (System.currentTimeMillis()));
}
	}
	
