import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class texttest {
	private static final String datews1="MM/dd/yyyy";
	private static final String datews2="dd/MM/yyyy";
	private static final String datews3="yyyy/MM/dd";
	private static final String datews4="yyyy/dd/MM";
	private static final String datews5="MM/yyyy/dd";
	private static final String datews6="dd/yyyy/MM";
	private static final String datewd1="dd-MMM-yyyy";
	private static final String datewd2="dd-MMMM-yyyy";
	private static final String datewd3="MM-dd-yyyy";
	private static final String datewd4="dd-MM-yyyy";
	private static final String datewd5="yyyy-MM-dd";
	private static final String datewd6="yyyy-dd-MM";
	private static final String datewd7="MM-yyyy-dd";
	private static final String datewd8="dd-yyyy-MM";
	private static final String datewd9="yyyy-MMM-dd";
	private static final String datewd10="yyyy-MMMM-dd";
	private static final String datewc1="MMM dd, yyyy";
	private static final String datewc2="MMMM dd, yyyy";
	private static final String datewc3="MMM yyyy, dd";
	private static final String datewc4="MMMM yyyy, dd";
	private static final String dateweol1="MMMM yyyy,";
	private static final String dateweol2="MMM yyyy,";
	private static final String dateweol3="MMMM dd,";
	private static final String dateweol4="MMM dd,";
	private static final String dateweol5="MMMM";
	private static final String dateweol6="MMM";
	private static final String datebegl1="dd";
	private static final String datebegl2="yyyy";
	private static final String datebegl3="dd, yyyy";
	private static final String datebegl4="yyyy, dd";
    private static final SimpleDateFormat sdfws1=new SimpleDateFormat(datews1);
    private static final SimpleDateFormat sdfws2=new SimpleDateFormat(datews2);
    private static final SimpleDateFormat sdfws3=new SimpleDateFormat(datews3);
    private static final SimpleDateFormat sdfws4=new SimpleDateFormat(datews4);
    private static final SimpleDateFormat sdfws5=new SimpleDateFormat(datews5);
    private static final SimpleDateFormat sdfws6=new SimpleDateFormat(datews6);
    private static final SimpleDateFormat sdfwd1=new SimpleDateFormat(datewd1);
    private static final SimpleDateFormat sdfwd2=new SimpleDateFormat(datewd2);
    private static final SimpleDateFormat sdfwd3=new SimpleDateFormat(datewd3);
    private static final SimpleDateFormat sdfwd4=new SimpleDateFormat(datewd4);
    private static final SimpleDateFormat sdfwd5=new SimpleDateFormat(datewd5);
    private static final SimpleDateFormat sdfwd6=new SimpleDateFormat(datewd6);
    private static final SimpleDateFormat sdfwd7=new SimpleDateFormat(datewd7);
    private static final SimpleDateFormat sdfwd8=new SimpleDateFormat(datewd8);
    private static final SimpleDateFormat sdfwd9=new SimpleDateFormat(datewd9);
    private static final SimpleDateFormat sdfwd10=new SimpleDateFormat(datewd10);
    private static final SimpleDateFormat sdfwc1=new SimpleDateFormat(datewc1);
    private static final SimpleDateFormat sdfwc2=new SimpleDateFormat(datewc2);
    private static final SimpleDateFormat sdfwc3=new SimpleDateFormat(datewc3);
    private static final SimpleDateFormat sdfwc4=new SimpleDateFormat(datewc4);
    private static final SimpleDateFormat sdfweol1=new SimpleDateFormat(dateweol1);
    private static final SimpleDateFormat sdfweol2=new SimpleDateFormat(dateweol2);
    private static final SimpleDateFormat sdfweol3=new SimpleDateFormat(dateweol3);
    private static final SimpleDateFormat sdfweol4=new SimpleDateFormat(dateweol4);
    private static final SimpleDateFormat sdfweol5=new SimpleDateFormat(dateweol5);
    private static final SimpleDateFormat sdfweol6=new SimpleDateFormat(dateweol6);
    private static final SimpleDateFormat sdfbegl1=new SimpleDateFormat(datebegl1);
    private static final SimpleDateFormat sdfbegl2=new SimpleDateFormat(datebegl2);
    private static final SimpleDateFormat sdfbegl3=new SimpleDateFormat(datebegl3);
    private static final SimpleDateFormat sdfbegl4=new SimpleDateFormat(datebegl4);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int j=0,k=0;
			File file=new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));
		    String line = br.readLine();
		    int i=0,flag=0;
		    String[] vd=new String[2];		    
		    while (line != null) {
		    	String[] s=line.split(" ");
		    	while(i<s.length){
		    		if(flag==1){
		    			s=line.split(" ");
		    			if(vdbegl1(s[i]))
		    			{
		    				vd[0]=vd[0]+" "+s[i];
		    				if(vdc4(vd[0]))
		    				{
		    					vd[1]="20";
		    					System.out.println(getdate(vd));
		    				}
		    				else if(vdc3(vd[0]))
		    				{
		    					vd[1]="19";
			    				System.out.println(getdate(vd));
		    				}
		    			}
		    			if(vdbegl2(s[i]))
		    			{
		    				vd[0]=vd[0]+" "+s[i];
		    				if(vdc2(vd[0]))
		    				{
		    					vd[1]="18";
		    					System.out.println(getdate(vd));
		    				}
		    				else if(vdc1(vd[0]))
		    				{
		    					vd[1]="17";
			    				System.out.println(getdate(vd));
		    				}
		    			}
		    		}
		    		if(flag==2){
		    			s=line.split(" ");
		    			if(s.length>=2)
		    			{
		    				String temp=s[i]+" "+s[i+1];
		    				if(vdbegl3(temp))
		    				{
		    					vd[0]=vd[0]+" "+temp;
		    					if(vdc2(vd[0]))
		    					{
		    						vd[1]="18";
		    						System.out.println(getdate(vd));
		    					}
		    					else if(vdc1(vd[0]))
		    					{
		    						vd[1]="17";
		    						System.out.println(getdate(vd));
		    					}
		    				}
		    				if(vdbegl4(temp))
		    				{
		    					vd[0]=vd[0]+" "+temp;
		    					if(vdc4(vd[0]))
		    					{
		    						vd[1]="20";
		    						System.out.println(getdate(vd));
		    					}
		    					else if(vdc3(vd[0]))
		    					{
		    						vd[1]="19";
		    						System.out.println(getdate(vd));
		    					}
		    				}
		    			}
		    		}
		    		flag=0;
		    		vd[0]=s[i];
   		    		if(s[i].length()<=11 && vds1(s[i]))
		    		{
		    			vd[1]="1";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vds2(s[i]))
		    		{
		    			vd[1]="2";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vds3(s[i]))
		    		{
		    			vd[1]="3";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vds4(s[i]))
		    		{
		    			vd[1]="4";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vds5(s[i]))
		    		{
		    			vd[1]="5";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vds6(s[i]))
		    		{
		    			vd[1]="6";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=12 && vdd1(s[i]))
		    		{
		    			vd[1]="7";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=20 && vdd2(s[i]))
		    		{
		    			vd[1]="8";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=12 && vdd3(s[i]))
		    		{
		    			vd[1]="9";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=12 && vdd4(s[i]))
		    		{
		    			vd[1]="10";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vdd5(s[i]))
		    		{
		    			vd[1]="11";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vdd6(s[i]))
		    		{
		    			vd[1]="12";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vdd7(s[i]))
		    		{
		    			vd[1]="13";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=11 && vdd8(s[i]))
		    		{
		    			vd[1]="14";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=12 && vdd9(s[i]))
		    		{
		    			vd[1]="15";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(s[i].length()<=20 && vdd10(s[i]))
		    		{
		    			vd[1]="16";
		    			System.out.println(getdate(vd));
		    		}
		    		else if(i<=s.length-3){
		    			j=i+1;k=i+2;
		    			String tst=s[i]+" "+s[j]+" "+s[k];
		    			if(vdc1(tst))
		    			{
		    				vd[0]=tst;
		    				vd[1]="17";
		    				System.out.println(getdate(vd));
		    			}
		    			else if(vdc2(tst))
		    			{
		    				vd[0]=tst;
		    				vd[1]="18";
		    				System.out.println(getdate(vd));
		    			}
		    			else if(vdc3(tst))
		    			{
		    				vd[0]=tst;
		    				vd[1]="19";
		    				System.out.println(getdate(vd));
		    			}
		    			else if(vdc4(tst))
		    			{
		    				vd[0]=tst;
		    				vd[1]="20";
		    				System.out.println(getdate(vd));
		    			}
		    		}
		    		else if(i==s.length-2){
		    			String dteol1=s[i]+" "+s[i+1];
		    			if(vdeol1(dteol1)){
		    				vd[0]=dteol1;
		    				flag=1;
		    			}
		    			if(vdeol2(dteol1))
		    			{
		    				vd[0]=dteol1;
		    				flag=1;
		    			}
		    			if(vdeol3(dteol1))
		    			{
		    				vd[0]=dteol1;
		    				flag=1;
		    			}
		    			if(vdeol4(dteol1))
		    			{
		    				vd[0]=dteol1;
		    				flag=1;
		    			}
		    		}
		    		else if(i==s.length-1)
		    		{
		    			String dteol1=s[i];
		    			if(vdeol5(dteol1))
		    			{
		    				vd[0]=dteol1;
		    				flag=2;
		    			}
		    			else if(vdeol6(dteol1))
		    			{
		    				vd[0]=dteol1;
		    				flag=2;
		    			}
		    		}
   		    		if(flag==1 || flag==2)
		    		{
   		    			i=0;
   		    			line=br.readLine();
		    		}
   		    		else
   		    		{
   		    			i++;
   		    		}
		    	}
		    	line = br.readLine();
		        i=0;
		    }
		}
		catch(Exception e){
		}
	}
	public static boolean vds1(String dt)
	{
		sdfws1.setLenient(false);
		try{
			sdfws1.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vds2(String dt)
	{
		sdfws2.setLenient(false);
		try{
			sdfws2.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}					
	}
	public static boolean vds3(String dt)
	{
		sdfws3.setLenient(false);
		try{
			sdfws3.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}					
	}
	public static boolean vds4(String dt)
	{
		sdfws4.setLenient(false);
		try{
			sdfws4.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vds5(String dt)
	{
		sdfws5.setLenient(false);
		try{
			sdfws5.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vds6(String dt)
	{
		sdfws6.setLenient(false);
		try{
			sdfws6.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd1(String dt)
	{
		sdfwd1.setLenient(false);
		try{
			sdfwd1.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd2(String dt)
	{
		sdfwd2.setLenient(false);
		try{
			sdfwd2.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd3(String dt)
	{
		sdfwd3.setLenient(false);
		try{
			sdfwd3.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd4(String dt)
	{
		sdfwd4.setLenient(false);
		try{
			sdfwd4.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd5(String dt)
	{
		sdfwd5.setLenient(false);
		try{
			sdfwd5.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd6(String dt)
	{
		sdfwd6.setLenient(false);
		try{
			sdfwd6.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd7(String dt)
	{
		sdfwd7.setLenient(false);
		try{
			sdfwd7.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd8(String dt)
	{
		sdfwd8.setLenient(false);
		try{
			sdfwd8.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd9(String dt)
	{
		sdfwd9.setLenient(false);
		try{
			sdfwd9.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdd10(String dt)
	{
		sdfwd10.setLenient(false);
		try{
			sdfwd10.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdc1(String dt)
	{
		sdfwc1.setLenient(false);
		try{
			sdfwc1.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdc2(String dt)
	{
		sdfwc2.setLenient(false);
		try{
			sdfwc2.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdc3(String dt)
	{
		sdfwc3.setLenient(false);
		try{
			sdfwc3.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdc4(String dt)
	{
		sdfwc4.setLenient(false);
		try{
			sdfwc4.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdeol1(String dt)
	{
		sdfweol1.setLenient(false);
		try{
			sdfweol1.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdeol2(String dt)
	{
		sdfweol2.setLenient(false);
		try{
			sdfweol2.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdeol3(String dt)
	{
		sdfweol3.setLenient(false);
		try{
			sdfweol3.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdeol4(String dt)
	{
		sdfweol4.setLenient(false);
		try{
			sdfweol4.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdeol5(String dt)
	{
		sdfweol5.setLenient(false);
		try{
			sdfweol5.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdeol6(String dt)
	{
		sdfweol6.setLenient(false);
		try{
			sdfweol6.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}	
	public static boolean vdbegl1(String dt)
	{
		sdfbegl1.setLenient(false);
		try{
			sdfbegl1.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdbegl2(String dt)
	{
		sdfbegl2.setLenient(false);
		try{
			sdfbegl2.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdbegl3(String dt)
	{
		sdfbegl3.setLenient(false);
		try{
			sdfbegl3.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static boolean vdbegl4(String dt)
	{
		sdfbegl4.setLenient(false);
		try{
			sdfbegl4.parse(dt);
			return true;
		}
		catch(ParseException e){
			return false;
		}			
	}
	public static String getdate(String[] inp) {
		try {
			Date d=null;
			Date rl=null;
		if(inp[1].equalsIgnoreCase("1")){
		sdfws1.setLenient(false);	
		d=sdfws1.parse(inp[0]);
		rl=sdfws1.parse("01/01/1800");
		}
		else if(inp[1].equalsIgnoreCase("2")){	
			sdfws2.setLenient(false);
			d=sdfws2.parse(inp[0]);
			rl=sdfws2.parse("01/01/1800");
		}
		else if(inp[1].equalsIgnoreCase("3")){	
			sdfws3.setLenient(false);
			d=sdfws3.parse(inp[0]);
			rl=sdfws3.parse("1800/01/01");
		}
		else if(inp[1].equalsIgnoreCase("4")){	
			sdfws4.setLenient(false);
			d=sdfws4.parse(inp[0]);
			rl=sdfws4.parse("1800/01/01");
		}
		else if(inp[1].equalsIgnoreCase("5")){	
			sdfws5.setLenient(false);
			d=sdfws5.parse(inp[0]);
			rl=sdfws5.parse("01/1800/01");
		}
		else if(inp[1].equalsIgnoreCase("6")){	
			sdfws6.setLenient(false);
			d=sdfws6.parse(inp[0]);
			rl=sdfws6.parse("01/1800/01");
		}
		else if(inp[1].equalsIgnoreCase("7")){	
			sdfwd1.setLenient(false);
			d=sdfwd1.parse(inp[0]);
			rl=sdfwd1.parse("01-Jan-1800");
		}
		else if(inp[1].equalsIgnoreCase("8")){	
			sdfwd2.setLenient(false);
			d=sdfwd2.parse(inp[0]);
			rl=sdfwd2.parse("01-January-1800");
		}
		else if(inp[1].equalsIgnoreCase("9")){	
			sdfwd3.setLenient(false);
			d=sdfwd3.parse(inp[0]);
			rl=sdfwd3.parse("01-01-1800");
		}
		else if(inp[1].equalsIgnoreCase("10")){	
			sdfwd4.setLenient(false);
			d=sdfwd4.parse(inp[0]);
			rl=sdfwd4.parse("01-01-1800");
		}
		else if(inp[1].equalsIgnoreCase("11")){	
			sdfwd5.setLenient(false);
			d=sdfwd5.parse(inp[0]);
			rl=sdfwd5.parse("1800-01-01");
		}
		else if(inp[1].equalsIgnoreCase("12")){	
			sdfwd6.setLenient(false);
			d=sdfwd6.parse(inp[0]);
			rl=sdfwd6.parse("1800-01-01");
		}
		else if(inp[1].equalsIgnoreCase("13")){	
			sdfwd7.setLenient(false);
			d=sdfwd7.parse(inp[0]);
			rl=sdfwd7.parse("01-1800-01");
		}
		else if(inp[1].equalsIgnoreCase("14")){	
			sdfwd8.setLenient(false);
			d=sdfwd8.parse(inp[0]);
			rl=sdfwd8.parse("01-1800-01");
		}
		else if(inp[1].equalsIgnoreCase("15")){	
			sdfwd9.setLenient(false);
			d=sdfwd9.parse(inp[0]);
			rl=sdfwd9.parse("1800-Jan-01");
		}
		else if(inp[1].equalsIgnoreCase("16")){	
			sdfwd10.setLenient(false);
			d=sdfwd10.parse(inp[0]);
			rl=sdfwd10.parse("1800-January-01");
		}
		else if(inp[1].equalsIgnoreCase("17")){	
			sdfwc1.setLenient(false);
			d=sdfwc1.parse(inp[0]);
			rl=sdfwc1.parse("Jan 01, 1800");
		}
		else if(inp[1].equalsIgnoreCase("18")){	
			sdfwc2.setLenient(false);
			d=sdfwc2.parse(inp[0]);
			rl=sdfwc2.parse("January 01, 1800");
		}
		else if(inp[1].equalsIgnoreCase("19")){	
			sdfwc3.setLenient(false);
			d=sdfwc3.parse(inp[0]);
			rl=sdfwc3.parse("Jan 1800, 01");
		}
		else if(inp[1].equalsIgnoreCase("20")){	
			sdfwc4.setLenient(false);
			d=sdfwc4.parse(inp[0]);
			rl=sdfwc4.parse("January 1800, 01");
		}
		long diff=d.getTime()-rl.getTime();
		long days=diff/(24*60*60*1000);
		return inp[0]+" "+(int)days;
		}
		catch(Exception e){
			return null;
		}		
	}
}