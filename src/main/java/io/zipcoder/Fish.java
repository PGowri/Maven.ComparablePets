package io.zipcoder;

public class Fish extends Pet{
    @Override
    public String speak() {
        return "Fish!";
    }

    public int compareTo(Pet o) {
        if (petName.equals(o.getPetName())){
            if(o instanceof Cat){
                return -1;
            }else if (o instanceof Dog){
                return -1;
            }else {
                return 0;
            }
        }
        return petName.compareTo(o.getPetName());
    }
}
