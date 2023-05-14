package ap;

public class TerminalNetwork {

    // creates an empty TerminalNetwork with a given name and maximum number of clients
    public TerminalNetwork(String name, int maxClients) { /* .... */ }

    // changes the maximum number of clients
    public void setMaxClients(int maxClients) { /* .... */ }

    // returns the maximum number of clients
    public int getMaxClients() { /* .... */ }

    // returns the name of this network
    public String getName() { /* .... */ }

    // changes the name of this netwotk
    public String setName(String n) { /* .... */ }

    // adds a client to this network
    public void addClient(Client cl) { /* .... */ }

    // removes a client to this network
    public void removeClient(Client cl) { /* .... */ }

    // returns the clients of this network
    public List<Client> getClients() { /* .... */ }

    // returns the terminals of this network
    public List<Terminal> getTerminal() { /* .... */ }

    // register a terminal to this network and associates it to client cl
    public void addTerminal(Terminal t, String clientId) { /* .... */ }

    // TODO: add other methods
}