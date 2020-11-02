package animals;

abstract class AbstractAnimals
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int yearOfDiscovery;

    public Animal(String name, int yearOfDiscovery)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearOfDiscovery = yearOfDiscovery;
    }
}