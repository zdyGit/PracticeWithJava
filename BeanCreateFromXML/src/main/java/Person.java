import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private Car car;
    private List<Car> cars;
    private Map<String,String> des;

    public Person(){}

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public void setDes(Map<String, String> des) {
        this.des = des;
    }

    public String toString(){
        return String.format("Person [name = %s,age = %d,des = %s]",this.name,this.age,this.des);
    }
}
