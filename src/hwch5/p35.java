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
			
			System.out.println("��Ƥw�g�J�ӤH�ɮ�");
		}
		
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}
	}

}
