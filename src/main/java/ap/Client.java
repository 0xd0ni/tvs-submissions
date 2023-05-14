package ap;

public enum ClientLevel { NORMAL, GOLD, PLATINUM }

public class Client {

    // creates a client with the given name and level
    public Client(String name, ClientLevel level)  { /* .... */ }

    // changes the level of this client
    void setLevel(ClientLevel level) { /* .... */ }

    // gets the level of this client
    public ClientLevel getLevel() { /* .... */ }

    // returns the name of this client
    public String getName() { /* .... */ }

    // adds a terminal to this client
    void addTerminal(Teminal t) { /* .... */ }

    // returns the terminals of this client
    List<Terminal> getTerminals() { /* .... */ }

    // returns the unpaid communications made by terminals of this client
    List<Communication> getUnpaidCommunications() { /* .... */ }

    // computes the unit call of voice communications made by these client
    public int computeCallUnitCost() { /* .... */ }

    // TODO: add other methods

}