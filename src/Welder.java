public class Welder extends Employee {
    public Welder(){
        this.authorityLevel = 2;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "all parts have been welded together");
    }
}
