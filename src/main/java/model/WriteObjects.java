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
                for (Worker test:worker){
                    oos.writeObject(test);
                }
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeTestClients() {
        Client test1 = new Client(123456, 1111,46464646);
        Client test2 = new Client(444433, 2222,65456454);
        FileOutputStream fos;
        ObjectOutputStream oos;
        {
            try {
                fos = new FileOutputStream("src/main/resources/clientsDb.bin");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(test1);
                oos.writeObject(test2);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
