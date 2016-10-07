import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PServer {
	public static void main (String args[]){
		
		//Only needed if port number is not predefined
		if (args.length != 1) {
			System.err.println("usage: java SampleServer rmi_port");
			System.exit(1);
		}
		try {
			// first command-line arg: the port of the rmiregistry
			int port = Integer.parseInt(args[0]);
			// create the URL to contact the rmiregistry
			String url = "//localhost:" + port + "/Sample";
			System.out.println("binding " + url);
			// register it with rmiregistry
//Naming.rebind(url, new Sample());
			// Naming.rebind("Sample", new Sample());
			System.out.println("server " + url + " is running...");
		}
		catch (Exception e) {
			System.out.println("Sample server failed:" +
			e.getMessage());
		}
	}
}
