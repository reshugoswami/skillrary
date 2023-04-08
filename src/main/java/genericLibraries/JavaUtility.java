package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int generateRandomNum(int limit)
	{
		Random random=new Random();
		int randomNum=random.nextInt(limit);
		return randomNum;
	}
	public String getCurrentTime()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_mm_yy_hh_sss");
		String currentTime=sdf.format(date);
		return currentTime;
	}

}

