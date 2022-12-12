package hwch5;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.*;

class p35 
{

	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw=new FileWriter("test1.txt");
			PrintWriter pw=new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("Goodbye!");
			
			pw.close();
			
			System.out.println("資料已寫入個人檔案");
		}
		
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}

}
