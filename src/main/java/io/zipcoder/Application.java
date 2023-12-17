package io.zipcoder;

import java.lang.Comparable;
import java.util.*;


public class Application {

    public static void main(String[] args) {
        System.out.println("How many pets are there?");
        Scanner scanner = new Scanner(System.in);
        int noOfPets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("No of pets are: " + noOfPets);
      // Pet[] list = new Pet[];
       List<Pet> list = new ArrayList<Pet>();
        Collection<Pet> set = list;;
        for (int i = 0; i < noOfPets; i++) {
            System.out.println("What kind of pets each one is?");
            String pet = scanner.nextLine();
            if (pet.equals("cat")) {
                Pet pet1 = new Cat();
                list.add(pet1);
                System.out.println("Pet's Name: ");
                String petName = scanner.nextLine();
                pet1.setPetName(petName);
            } else if (pet.equals("dog")) {
                Pet pet1 = new Dog();
                list.add(pet1);
                System.out.println("Pet's Name: ");
                String petName = scanner.nextLine();
                pet1.setPetName(petName);
            } else {
                Pet pet1 = new Fish();
                list.add(pet1);
                System.out.println("Pet's Name: ");
                String petName = scanner.nextLine();
                pet1.setPetName(petName);
            }
        }
        for (int i =0; i < list.size(); i++){
            System.out.println(list.get(i).getPetName());
            System.out.println(list.get(i).speak());
           Collections.sort(list, new Sort());
        }


    }
}
class Sort implements Comparator<Pet>
{
    // Used for sorting in ascending order of
    // roll number
    public String compare(Pet Cat, Pet Dob, Pet Fish)
    {
        return "";
    }

    @Override
    public int compare(Pet Cat, Pet Dog) {
        return 0;
    }
}