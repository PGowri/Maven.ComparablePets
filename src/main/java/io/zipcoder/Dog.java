package io.zipcoder;

public class Dog extends Pet{
    @Override
    public String speak() {
        return "Bark!";
    }

    @Override
    public int compareTo(Pet o) {
        if (petName.equals(o.getPetName())){
            if(o instanceof Dog) {
                return 0;
            }else if (o instanceof Cat){
                return -1;
            } else {
                return 1;
            }
        }
        return petName.compareTo(o.getPetName());
    }
}
