package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.equals(""))
    		return 0;
    	else if(!input.contains(","))
    		return Integer.parseInt(input);

    	else 
    	{
    		String temp[]=input.split(",|\\R");
    		int sum=0;
    		for(int i=0;i<temp.length;i++) {
    			
    			sum=sum+Integer.parseInt(temp[i]);
    		}
    		System.out.println(3);
    		return sum;
    		
    	}
    	
    	
    }
    
    
   

}