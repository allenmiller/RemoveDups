import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
    

public class RemoveDups {


    private static class TrieNode {


	private List<TrieNode> siblings = null;
	private List<TrieNode> children = null;
	private String domain = null;
	private String username = null;

	private TrieNode() {

	}

	private TrieNode(TrieNode n, String addr) {

	    String fqdn;
	    String username;
	    Stack<String> domains = new Stack<>();

	    StringTokenizer tok = new StringTokenizer(addr, "@");
	    username = tok.nextToken();
	    this.username = username;
	    fqdn = tok.nextToken();
	    tok = new StringTokenizer(fqdn, ".");
	    while (tok.hasMoreTokens()) {

		domains.push(tok.nextToken());
	    }

	}

	private void addAddr(Stack domains, String username) {


	}

    }



    public static void main(String [] args) {

	String addr;
	
        if (args.length != 1) {

            System.err.println("Usage: RemoveDups <input_filename>");
            return;
        }


	TrieNode head = new TrieNode();
	
	try {
	    BufferedReader addrs = Files.newBufferedReader(Paths.get(args[0]));
	    while ((addr = addrs.readLine()) != null) {

		System.out.println(addr);
	    }
	} catch (IOException ioe) {

	    System.err.println(ioe);
	    return;
	}
	

    }


}
