package accessibilty;

public interface Shape {
int x=10;//We just implement we cannot do other than that
String color="blue";//in interface from 1.9 private can also be added..in 1.8 default can aslo be used
void draw();
void getArea();
//void setArea();
//void fillcolor();
default void applycolor() {
	System.out.println();
}
}
