package test01;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException 
	{
		 write("E:\\1.txt"); //����������
	}
	public static void write(String path)
			throws IOException 
	{
		//��д��ת��Ϊ������ʽ
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		//һ��дһ��
		String ss = "��������";
		bw.write(ss);
		bw.newLine();  //������
		bw.close();
		System.out.println("д��ɹ�");
	}
}
