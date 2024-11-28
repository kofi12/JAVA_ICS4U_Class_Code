public class ZooManagementSystem {
public static void main(String[] args) {
            // Sample data
            String[] names = new 
String[10];
            String[] species = new 
String[10];
            int[] ages = new int[10];
            int count = 0;

            // Adding animals 
            count = addAnimal(names, species, ages, count, "Lion", "Panther", 5);
            count = addAnimal(names, species, ages, count, "Elephant", "Tiger", 10);
            count = addAnimal(names, species, ages, count, "Leopard", "Monkey", 3);
            
            // Listing all animals
            listAllAnimals(names, species, ages, count);

            // Finding an animal by name 
            findAnimalByName(names, "Tiger");
}
public static int addAnimal(String[] names, String[] species, int[] ages, int count, String name, String specie, int age) {
    if (count < names.length) {
        names[count] = name;
        species[count] = specie;
        ages[count] = age;
        count++;
    } else {
        System.out.println("Zoo is at full capacity!");
    }
      return count;
}
public static void listAllAnimals(String[] names, String[] species, int[] ages, int count) {
    if (count == 0) {
        System.out.println("No animals in the zoo.");
        return;
    }
    for (int i = 0; i < count; i++) {
        System.out.println("Name: " + names[i] + ", Species: " + species[i] + ", Age: " + ages[i]);
}
}
public static void findAnimalByName(String[] names, String name) {
    boolean found = false;
    for (int i = 0; i < names.length; i++) {
        if (names[i] != null && names[i].equalsIgnoreCase(name)) {
            System.out.println("Animal found: " + names[i]);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Animal not found: " + name);
}
}
}

