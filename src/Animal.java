public class Animal {
    private String family, name; // Restriction d'accès en utilisant private
    private int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age >= 0) { // Vérification de l'âge positif
            this.age = age;
        } else {
            System.out.println("Error: Age must be a non-negative value.");
            this.age = 0; // Valeur par défaut en cas d'âge invalide
        }
        this.isMammal = isMammal;
    }

    // Getters et setters pour accéder aux attributs de manière contrôlée
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be a non-negative value.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
