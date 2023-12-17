package io.zipcoder;

public class Cat extends Pet{
    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public int compareTo(Pet o) {
        if (petName.equals(o.getPetName())){
            if(o instanceof Cat){
                return 0;
            }else if (o instanceof Dog){
                return 1;
            }else {
                return 1;
            }
        }
        return petName.compareTo(o.getPetName());
    }
}