public class Y extends X{
    // more
    public Y(){
        super();
        this.mode = "Y";
    }

    @Override
    public int doSomething(){
        return super.doSomething() + 1;
    }
}
