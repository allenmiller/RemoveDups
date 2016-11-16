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


	private final boolean rootNode;
	private List<TrieNode> children = null;
	private String domain = null;
	private String username = null;

	private TrieNode() {

	    rootNode=true;
	    children = new LinkedList<>();
	}

	private TrieNode(TrieNode n, String addr) {

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
	
	String fqdn;
	String username;
	Stack<String> domains;
	StringTokenizer tok;
	try {
	    BufferedReader addrs = Files.newBufferedReader(Paths.get(args[0]));
	    while ((addr = addrs.readLine()) != null) {

		System.out.println(addr);

		domains = new Stack<>();
	    tok = new StringTokenizer(addr, "@");
	    username = tok.nextToken();
	    fqdn = tok.nextToken();
	    tok = new StringTokenizer(fqdn, ".");
	    while (tok.hasMoreTokens()) {

		domains.push(tok.nextToken());
	    }


	    }
	} catch (IOException ioe) {

	    System.err.println(ioe);
	    return;
	}
	

    }


}
