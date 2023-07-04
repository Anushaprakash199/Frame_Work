package Runner_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Properties1 
{
	@Test
	public void test() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		String u=p.getProperty("base");
		System.out.println(u);	
		String u1=p.getProperty("baseURL");
		System.out.println(u1);
	}

}
