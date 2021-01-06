package model;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjects {
    public static void readTestWorkers(){
        try {
            FileInputStream fis=new FileInputStream("src/main/resources/workersDb.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);
            int workerCount=ois.readInt();
            Worker[] workers=new Worker[workerCount];
            for(int i=0;i<workerCount;i++){
             workers[i]=(Worker) ois.readObject();
            }
            System.out.println(Arrays.toString(workers));
            ois.close();
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace();}
    }
    public static void readTestClients(){
        try {
            FileInputStream fis=new FileInputStream("src/main/resources/clientsDb.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);
            int clientCount=ois.readInt();
            Client[] clients=new Client[clientCount];
            for(int i=0;i<clientCount;i++){
                clients[i]=(Client) ois.readObject();
            }
            System.out.println(Arrays.toString(clients));
            ois.close();
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace();}
    }
}
