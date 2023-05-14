

public class Terminal {

    Terminal(String id) { ... }

    public void turnOff() { ... }

    public void turnOn() { ... }

    public void setSilence() { ... }

    // if size of msg is invalid, then it throws IllegalArgumentException
    public boolean sendSMS(String msg, Terminal to) { ... }

    void receiveSMS(String msg, Terminal from) { ... }

    public void makeCall(Terminal t) { ... }

    void acceptCall(Terminal t) { ... }

    public void endCall() { ... }

}