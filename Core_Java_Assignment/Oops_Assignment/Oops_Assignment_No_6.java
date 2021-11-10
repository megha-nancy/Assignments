public abstract class Persistence {
    public abstract void persist();
}


public class FilePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in FIle persistence");
    }
}


public class DatabasePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in data persistence");
    }
}


public class Client{
    public static void main(String[] args) {
        Persistence persistence = new Persistence() {
            @Override
            public void persist() {
                System.out.println("");
                System.out.println("1.The client created the object of Persistance which is abstract class");
                System.out.println("");
                System.out.println("2.And then clients is doing following invocation of abstract method");
                System.out.println("");
                System.out.println("3.The client is invoking the persist method without knowing that data is saved in file and database'");
            }
        };
        persistence.persist();
    }
}



