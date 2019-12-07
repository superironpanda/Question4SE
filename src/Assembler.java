public class Assembler extends Employee {
    public Assembler(){
        this.authorityLevel = 3;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "all parts have been put together");
    }
}
