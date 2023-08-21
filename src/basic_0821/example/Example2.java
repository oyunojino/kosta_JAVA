package basic_0821.example;

public class Example2 {

}
interface Edible {
    void eat();
}
interface Sweetable {
    void sweet();
}
interface Delicious extends Edible, Sweetable{

}