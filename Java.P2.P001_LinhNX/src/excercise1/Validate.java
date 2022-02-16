package excercise1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Validate {

	public static String checkPhone(String phone) {
		boolean isPhone = false;
		do {
			isPhone = phone.matches("[0-9]+[\\.]?[0-9]*");
			if(isPhone) {
				isPhone = phone.matches("\\d{10}");
				if(isPhone) {
					return phone;
				}else {
					System.out.println("Phone number must be 10 digits");
					return null;
				}
			
			}else {
				System.out.println("Phone number must is number");
				return null;
			}
		}while(!isPhone);
		
	}
	
	public static String checkEmail(String email) {
		boolean isEmail = false;
		
		do {
			isEmail = email.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
			if(isEmail) {
				return email;
			
			}else {
				System.out.println("Email must is correct format");
				return null;
			}
		}while(!isEmail);
	}
	
	public static String checkDate(String date) {
		Date d = null;
		try {
			SimpleDateFormat check = new SimpleDateFormat("dd/MM/yyyy");
			d = check.parse(date);
			if(!date.equals(check.format(d))) {
				
				return null;
			}
		}catch (ParseException e) {
			System.out.println("Date must is correct format");
		}
		return date;
	}
	
}
