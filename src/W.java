public class W extends Z{
    //more
    public W() {
        super();
        this.mode = "W";
    }

    @Override
    public int doSomething(){
        return super.doSomething() + 3;
    }
}
