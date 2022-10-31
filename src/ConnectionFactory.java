import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class ConnectionFactory {

    private static ObjectContainer connection;

    public static ObjectContainer objectContainergetConnection(){
        if (connection == null){
            connection = Db4oEmbedded.openFile(System.getProperty("user.dir")+"/soae.db4o");
        }
        return connection;
    }

    public static void close() {
        if (connection != null) {
            connection.close();
        }
    }

    public static void setConnection(ObjectContainer connection) {
        ConnectionFactory.connection = connection;
    }
}