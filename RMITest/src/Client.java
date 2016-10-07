import java.rmi.Naming;


public class Client {
	public static void main(String args[]) {
		try {
			// basic argument count check
			if (args.length < 3) {
				System.err.println(
				"usage: java SampleClient rmihost rmiport string... \n");
				System.exit(1);
			}
			
			// args[0] contains the hostname, args[1] contains the port
			int port = Integer.parseInt(args[1]);
			String url = "//" + args[0] + ":" + port + "/Sample";
			System.out.println("looking up " + url);
			// look up the remote object named “Sample”
			PServerInterface sample = (PServerInterface)Naming.lookup(url);
			
			// args[2] onward are the strings we want to reverse
			for (int i=2; i < args.length; ++i)
				// call the remote method and print the return
System.out.println(/*sample.invert(args[i])*/); //This is where we use the remote function
		} catch(Exception e) {
			System.out.println("SampleClient exception: " + e);
		}
	}
}
