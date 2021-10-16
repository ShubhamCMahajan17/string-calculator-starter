package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.equals(""))
    		return 0;
    	else if(!input.contains(","))
    		return Integer.parseInt(input);
    	else if(input.contains(","))
    	{
    		String temp[]=input.split(",");
    		
    		int a=Integer.parseInt(temp[0]);
    		int b=Integer.parseInt(temp[1]);
    		return a+b;
    	}
        return 0;
    }

}