package bean;

/**
 * Created by ${Dotin} on ${4/25/2015}.
 */
public class Terminal {
    private String id;
    private String type;
    private Server server;
    private OutLog outLog;
    private Transactions transactions;

    public Terminal() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public OutLog getOutLog() {
        return outLog;
    }

    public void setOutLog(OutLog outLog) {
        this.outLog = outLog;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }
}
