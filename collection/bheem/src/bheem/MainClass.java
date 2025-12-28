package bheem;

public class MainClass {
	static double weight=70;
	static double height=6;
	public static void main(String[] args) {
		
		double bheemWeight=68;
		double bheemHeight=5.8;
		if(weight<bheemHeight)
		    {
            if(height<bheemHeight)
            {
                System.out.println("Eligible");
            }
            else
            {
                try{
                throw new heightException("Short Height");
                }
                catch(heightException e)
                {
                    System.out.println(e.getMessage());
                }
            }
       }
       else
       {
           try{
                 throw new weightException("Under Weight");
                }
                catch(weightException e)
                {
                     System.out.println(e.getMessage());
               }
       }
	}
}
