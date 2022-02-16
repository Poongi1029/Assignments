abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "File is persisted";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Data is persisted";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
        DatabasePersistence i = new DatabasePersistence();
        FilePersistence j = new FilePersistence();
        System.out.println(i.persist());
        System.out.println(j.persist());

    }
}
