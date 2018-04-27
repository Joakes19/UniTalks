//Server file
//creates a new server with a main method
//The server can accept connections from new clients
//Needs embedded class that extends thread base class to handle multiple clients concurrently

import java.io.*;
import java.net.*;
import java.util.ArrayList;

class Server{
	
	public static void Main(String[] args){
		boolean continueRunning = true;
		int port = 1026, clientNumber = 5;
		String inputLine;
		long serverStartTime;
		ArrayList clientStartTimes;
		
		serverStartTime = System.currentTimeMillis();
	}
	
	private void broadcastMessage(String Message){//Broad cast a message to all clients connected to the server
		output.printl(Message);
		output.flush();
	}
	
	ArrayList<String> processMessage(String input){
		//How messages will be sent to the server:
		//client number: Message type: Message:
		String number = "", type = "", message = "";
		ArrayList<String> parts;
		int count, colonCount = 0;
		for (count = 0; count < input.length(); count = count + 1){
			if (input[count] != ":"){
				if (colonCount == 0){
					number = number + input[count];
				}
				else if(colonCount == 1){
					type = type + input[count];
				}
				else{
					message = message + input[count];
				}
			}
			else{
				colonCount = colonCount + 1;
			}
		}
		parts.add(number);
		parts.add(type);
		parts.add(message);
		return parts;
	}
	
	String getIPAddress(){
		return socket.getLocalAddress();
	}
	
	long getServerRunTime(){
		return (serverStartTime - System.currentTimeMillis());
	}
	
}

class HandleSession implements Runnable {
	private Socket socket;
	
	HandleSession(Socket socket){
		this.socket = socket;
	}
	
	public void run(){
		BufferedReader input = null;
		PrintWriter output = null;
		try{
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			output.println("Type message. Type \\quit to exit");
			out.flush();
			
			String line;
			while (true){
				line = input.readline();
				if ((line == null)||line.equals("\\quit"))break;
				System.out.println("Someone has said: " + line);
				out.println("You have said: " + line);
				out.flush();
			}
			
			try{
				socket.close();
				System.out.println("One connection is closed.");
			}
			
			catch (IOException e){
				System.err.println("Exception when closing the socket");
				System.err.println(e.getMessage());
			}
		}
		catch (IOException e){
				System.err.println("Exception is run(...)");
				System.err.println(e.getMessage());
		}
	}
}