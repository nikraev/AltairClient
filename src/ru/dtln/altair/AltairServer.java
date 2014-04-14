package ru.dtln.altair;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class AltairServer {
	
	public InputStream inStream;
	public OutputStream outStream;
	private Socket sSocket;
	
	AltairServer()
	{
		byte[] addr = {127,0,0,1};
		int sPort = 36000;
		
		try{
			
			this.sSocket = new Socket(InetAddress.getByAddress(addr), sPort);
			this.inStream = sSocket.getInputStream();
			this.outStream = sSocket.getOutputStream();
			
			if(this.sSocket.isConnected())
			{
			System.out.println("Connection Complete!");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	AltairServer(InetAddress sIp, int sPort)
	{
		
	}
	
	//функция закрытия соединения
	public void CloseConnection()
	{
		try{
		this.sSocket.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//функция получения сообщения
	public boolean ResiveMessage()
	{
		return false;
	}
	
	//функция отправки сообщения
	public boolean SendMessage()
	{
		return false;
	}
}
