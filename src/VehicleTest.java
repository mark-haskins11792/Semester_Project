//Mark Haskins
//COSC 1337.S70
//Semester Project
//May 10, 2019

public class VehicleTest
{

    public static void main(String[] args)
    {
        //Person Default Constructor
        Person mark = new Person();
        //Person Setters
        mark.setFirstName("Mark");
        mark.setLastName("Haskins");
        mark.setAge(26);
        mark.setSsn("595-27-0000");
        //Person Getters
        System.out.println("FirstName: " + mark.getFirstName() + " LastName: "
                + mark.getLastName() + " Age: " + mark.getAge() + " SSN: " + mark.getSsn());
        //Person Overloaded Constructor
        Person steve = new Person("Steve", "Johnson", 21, "454-90-9876");
        //Person toString Method
        System.out.println(steve);
        //Person copy  Constructor
        Person markCopy = new Person(mark);
        System.out.println(markCopy);
        System.out.println("Compare markCopy to mark:");
        if (markCopy == mark)
            System.out.println("Same reference address");
        else
            System.out.println("Distinct copies");
        //Person equals Method
        if (mark.equals(steve))
        {
            System.out.println("Mark equals Steve");
        } else
        {
            System.out.println("Mark is not equal to Steve");
        }
        //Person Clone Method
        Person markClone = mark.clone();
        //Person equals Method
        if (mark.equals(markClone))
        {
            System.out.println("Mark equals markClone");
        } else
        {
            System.out.println("Mark is not equal to markClone");
        }
        //Person Finalize Method
        mark.finalize();
        steve.finalize();
        markClone.finalize();
        markCopy.finalize();

        //Vehicle Default Constructor
        Vehicle camry = new Vehicle();
        //Vehicle Setters
        camry.setManufacturerName("Toyota");
        camry.setEngineCylinders(8);
        camry.setOwner(mark);
        //Vehicle Getters
        System.out.println("ManufacturerName: " + camry.getManufacturerName() + " EngineCylinders: "
                + camry.getEngineCylinders()  + camry.getOwner());
        //Vehicle Overloaded Constructor
        Vehicle taurus = new Vehicle("Ford", 4, new Person("Mark", "Haskins", 26, "595-27-0000"));
        //Vehicle toString Method
        System.out.println(taurus);
        //Vehicle copy  Constructor
        Vehicle camryCopy = new Vehicle(camry);
        System.out.println(camryCopy);
        System.out.println("Compare camryCopy to camry:");
        if (camryCopy == camry)
            System.out.println("Same reference address");
        else
            System.out.println("Distinct copies");
        //Vehicle equals Method
        if (camry.equals(taurus))
        {
            System.out.println("Camry equals Taurus");
        } else
        {
            System.out.println("Camry is not equal to Taurus");
        }
        //Vehicle Clone Method
        Vehicle camryClone = camry.clone();
        if (camry.equals(camryClone))
        {
            System.out.println("camry equals camryClone");
        } else
        {
            System.out.println("camry is not equal to camryClone");
        }
        //Vehicle Finalize Method
        camry.finalize();
        taurus.finalize();
        camryClone.finalize();
        camryCopy.finalize();


        //Automobile Default Constructor
        Automobile elantra = new Automobile();
        //Automobile Setters
        elantra.setManufacturerName("Hyundai");
        elantra.setEngineCylinders(4);
        elantra.setOwner(steve);
        elantra.setWeight(3015.00);
        elantra.setPassengers(5);
        //Automobile Getters
        System.out.println("ManufacturerName: " + elantra.getManufacturerName() + " EngineCylinders: " + elantra.getEngineCylinders()
                +  elantra.getOwner() + " Weight: " + elantra.getWeight() + " Passengers: " + elantra.getPassengers());
        //Automobile Overloaded Constructor
        Automobile impala = new Automobile("Chevy", 6, new Person("Bill", "Burr", 60, "565-98-1111"), 6, 60685.00);
        //Automobile toString Method
        System.out.println(impala);
        //Automobile copy  Constructor
        Automobile elantraCopy = new Automobile(elantra);
        System.out.println(elantraCopy);
        System.out.println("Compare elantraCopy to elantra:");
        if (elantraCopy == elantra)
            System.out.println("Same reference address");
        else
            System.out.println("Distinct copies");
        //Automobile Equals Method
        if (elantra.equals(impala))
        {
            System.out.println("Elantra equals Impala");
        } else
        {
            System.out.println("Elantra is not equal to Impala");
        }
        //Automobile clone method
        Automobile elantraClone = elantra.clone();
        if (elantra.equals(elantraClone))
        {
            System.out.println("elantra equals elantraClone");
        } else
        {
            System.out.println("elantra is not equal to elantraClone");
        }
        //Vehicle Finalize Method
        elantra.finalize();
        impala.finalize();
        elantraClone.finalize();
        elantraCopy.finalize();


        System.out.println("Truck Class Test Constructors and Methods:");
        //Truck Default Constructor
        Truck ranger = new Truck();
        //Truck Setters
        ranger.setManufacturerName("Ford");
        ranger.setEngineCylinders(8);
        ranger.setOwner(steve);
        ranger.setLoadCapacity(10000.99);
        ranger.setTowingCapacity(85470.00);
        //Truck Getters
        System.out.println("ManufacturerName: " + ranger.getManufacturerName() + " EngineCylinders: "
                + ranger.getEngineCylinders() + " " + ranger.getOwner() + " Load Capacity: " +
                ranger.getLoadCapacity() + " Tow Capacity: " + ranger.getTowingCapacity());
        //Truck Overloaded Constructor
        Truck ram = new Truck("Dodge", 8, new Person("George", "Bush", 72, "686-98-1231"), 3000.00, 1230.00);
        //Truck toString Method
        System.out.println(ram);
        //Truck copy  Constructor
        Truck rangerCopy = new Truck(ranger);
        System.out.println(rangerCopy);
        System.out.println("Compare rangerCopy to ranger:");
        if (rangerCopy == ranger)
            System.out.println("Same reference address");
        else
            System.out.println("Distinct copies");
        //Truck equals Method
        if (ram.equals(ranger))
        {
            System.out.println("Ram equals Ranger");
        } else
        {
            System.out.println("ram is not equal to ranger");
        }
        //Truck clone Method
        Truck ramClone = ram.clone();
        if (ram.equals(ramClone))
        {
            System.out.println("ram equals ramClone");
        } else
        {
            System.out.println("ram is not equal to ramClone");
        }
        ranger.finalize();
        ram.finalize();
        ramClone.finalize();
        rangerCopy.finalize();

        /*Demonstrate polymorphism by creating an array of
        various types of vehicles with varying property values*/

        Vehicle vehicleArray[] =
                {
                        new Vehicle("Ford", 4, new Person("Mark", "Haskins", 26, "595-27-0000")),
                        new Automobile("Chevy", 6, new Person("Bill", "Burr", 60, "565-98-1111"), 6, 60685.00),
                        new Truck("Dodge", 8, new Person("George", "Bush", 72, "686-98-1231"), 3000.00, 1230.00)
                };

        for (Vehicle e : vehicleArray)
        {
            System.out.println(e);
        }

    }
}

