public class Car {


    private String cname;
    private int price;
    private double max;

    public Car(){
        super();
    }
    public Car(String cname,double max){
        super();
        this.cname = cname;
        this.max = max;
    }
    public Car(String cname,int price){
        super();
        this.cname = cname;
        this.price = price;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Car [cname = %s,price = %d,max = %f]",this.cname,this.price,this.max);
    }

}
