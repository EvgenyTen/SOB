package model;

import java.io.*;

public class WriteObjects  {
    public static void writeTestWorkers() {
        Worker[] worker={new Worker("Worker", "work"),
                new Worker("Worker2", "work2")};
        FileOutputStream fos;
        ObjectOutputStream oos;
        {
            try {
                fos = new FileOutputStream("src/main/resources/workersDb.bin");
                oos = new ObjectOutputStream(fos);
                oos.writeInt(worker.length);
                for (Worker workers:worker){
                    oos.writeObject(workers);
                }
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeTestClients() {
         Client[] clients={new Client(123456, 1111,46464646),
                 new Client(444433, 2222,65456454)};
        FileOutputStream fos;
        ObjectOutputStream oos;
        {
            try {
                fos = new FileOutputStream("src/main/resources/clientsDb.bin");
                oos = new ObjectOutputStream(fos);
                oos.writeInt(clients.length);
                for(Client client:clients){oos.writeObject(client);}
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
