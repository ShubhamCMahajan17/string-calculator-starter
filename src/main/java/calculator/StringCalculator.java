package calculator;

import java.util.ArrayList;
import java.util.Collections;

class StringCalculator {

	public int add(String input) throws negativeNumberException {
		if (input.equals(""))
			return 0;
		else if (!input.contains(","))
			return Integer.parseInt(input);
		else if (input.startsWith("//")) {
			int index = input.indexOf("n") + 1;
			String subString = input.substring(index);
			String temp[] = subString.split(",|;|:");
			int sum = 0;
			for (int i = 0; i < temp.length; i++) {

				sum = sum + Integer.parseInt(temp[i]);
			}

			return sum;
		}

		else {
			String temp[] = input.split(",|\\R|;");
			ArrayList<Integer> list = new ArrayList<Integer>();
			int sum = 0;
			int num;
			for (int i = 0; i < temp.length; i++) {

				num = Integer.parseInt(temp[i]);
				if (num < 0) {
					list.add(num);
				}

				if ((num > 0)&&num<=1000)
					sum = sum + num;
			}
			try {
				if (list.size() > 0)
					throw new negativeNumberException("Negative Number are: " + list.toString());
			} finally {
				System.out.println(sum);
				return sum;
			}

		}

	}

}