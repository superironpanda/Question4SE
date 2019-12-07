public class Painter extends Employee{
    public Painter(){
        this.authorityLevel = 1;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "car complete");
    }
}
