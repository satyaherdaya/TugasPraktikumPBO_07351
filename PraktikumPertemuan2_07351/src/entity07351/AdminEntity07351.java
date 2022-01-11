package entity07351;

public class AdminEntity07351 extends AbstractClass07351{
    private String username07351;
    private String password07351;

    public AdminEntity07351(String username07351, String password07351, int id07351, String nama07351) {
        super(id07351, nama07351);
        this.username07351 = username07351;
        this.password07351 = password07351;
    }

    public String getUsername07351() {
        return username07351;
    }

    public void setUsername07351(String username07351) {
        this.username07351 = username07351;
    }

    public String getPassword07351() {
        return password07351;
    }

    public void setPassword07351(String password07351) {
        this.password07351 = password07351;
    }
}
