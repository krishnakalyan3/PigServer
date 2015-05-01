import org.apache.pig.ExecType;
import org.apache.pig.PigServer;
import org.apache.pig.backend.executionengine.ExecException;

import java.io.IOException;

/**
 * Created by krishna on 02/05/15.
 */

public class PigTest {

    public static void main(String[] args) throws IOException {

        PigServer pigServer = new PigServer(ExecType.LOCAL);
        runMyQuery(pigServer, "src/resource/");
    }


    public static void runMyQuery(PigServer pigServer, String inputFile) throws IOException {

        pigServer.registerQuery("A = load '" + inputFile + "' using PigStorage();");
        pigServer.store("A", "myoutput");
    }


}
