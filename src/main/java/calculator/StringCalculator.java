package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.equals(""))
    		return 0;
    	else if(!input.contains(","))
    		return Integer.parseInt(input);
    	else if(input.contains(",") && (input.indexOf(",")==input.lastIndexOf(",")))
    	{
    		String temp[]=input.split(",");
    		
    		int a=Integer.parseInt(temp[0]);
    		int b=Integer.parseInt(temp[1]);
    		//System.out.println(a+b);
    		return a+b;
    		
    	}
    	else if(input.contains(",") && !input.contains("; # @ ! \n * ^ ` : /"))
    	{
    		String temp[]=input.split(",");
    		int sum=0;
    		for(int i=0;i<temp.length;i++) {
    			
    			sum=sum+Integer.parseInt(temp[i]);
    		}
    		//.out.println(sum);
    		return sum;
    		
    	}
        return 0;
    }
    
    
   

}