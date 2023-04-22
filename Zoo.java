
class Animal{
protected String name;
public Animal(String name){
this.name=name;
}
public void eat(){
System.out.println(name+"  is eating...");
}
public void move(){
System.out.println(name+" is moving...");
}
}

class Bird extends Animal{
private int wingspan;
public Bird(String name, int wingspan){
super(name);
this.wingspan=wingspan;
}
public void fly(){
System.out.println(name+" is flying with speed of "+wingspan+" km/hr");
}
}

class Mammal extends Animal{
private int numLegs;
public Mammal(String name, int numLegs){
super(name);
this.numLegs=numLegs;
}
public void run(){
System.out.println(name+" is Running with "+numLegs+ " legs");
}
}

class Reptile extends Animal{
private String sound;
public Reptile(String name, String sound){
super(name);
this.sound=sound;
}
public void makingNoise(){
System.out.println(name+" is making sound like "+sound);
}
}

class ZooKeeper{
private String name;
public ZooKeeper(String name){
this.name=name;
}
public void feedAnimal(Animal animal){
System.out.println(name+ " is feeding the "+animal.name);
}
}


public class Zoo{
public static void main(String args[]){
Animal animal=new Animal("Tiger");
animal.eat();
animal.move();
Bird bird=new Bird("Eagle", 100);    
bird.fly();
Mammal mammal=new Mammal("Ape", 4);
mammal.run();
Reptile reptile=new Reptile("Snake", "hissing"); 
reptile.makingNoise();
ZooKeeper zookeeper=new ZooKeeper("David");
zookeeper.feedAnimal(animal);   
}
}
