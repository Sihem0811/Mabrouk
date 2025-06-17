package Helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

	public static String getproprety(String property) throws Exception {

		InputStream input = new FileInputStream ("src/test/resources/Properties/properties");
		Properties objet= new Properties();
		objet.load(input);


		return(objet.getProperty(property));




	}
}




