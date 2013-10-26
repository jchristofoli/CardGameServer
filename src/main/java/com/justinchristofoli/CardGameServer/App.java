package com.justinchristofoli.CardGameServer;

import org.eclipse.jetty.server.Server;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Server server = new Server(8080);
        try {
			server.start();
			server.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
