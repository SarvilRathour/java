//object is a bundle of related state and behaviours
//object stores it's state in field and method exposes the behaviours to the outside world
//Dog-state(name,color) behaviours(barking,fetching)

//interface is group of related methods
class Bicycle{
  int cadence=0;
  int speed=0;
  int gear=1;
  void changeCadence(int newValue){
    cadence=newValue;
  }
  void changeGear(int newValue){
    gear=newValue;
  }
  void speedup(int increment){
    speed=speed+increment;
  }
  void printStates() {
   IO.println("cadence:" +cadence + " speed:" + speed + " gear:" + gear);
    }
}
void main(){
  Bicycle bike1=new Bicycle();
  bike1.changeGear(8);
  bike1.speedup(88);
  bike1.speedup(9);
  bike1.printStates();
}
