package Two_hundred_programs1;

public class EncapsulationExample { private int value; void setValue(int v){value=v;} int getValue(){return value;} public static void main(String[] args){EncapsulationExample o=new EncapsulationExample();o.setValue(50);System.out.println(o.getValue());} }
