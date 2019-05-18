//Vehicle class -base class
public class Vehicle
{
    private String manufacturerName;
    private int engineCylinders;
    private Person owner;

    public Vehicle()
    {
        this("", 0, new Person("", "", 0, ""));
        System.out.println("Vehicle - default constructor");
    }

    public Vehicle(String mn, int ec, Person o)
    {
        manufacturerName = mn;
        engineCylinders = ec;
        owner = new Person(o);
        System.out.println("Vehicle - overloaded constructor");
    }

    public Vehicle(Vehicle obj) throws NullPointerException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        manufacturerName = obj.manufacturerName;
        engineCylinders = obj.engineCylinders;
        owner = new Person(obj.owner);
        System.out.println("Vehicle - copy constructor");
    }

    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public int getEngineCylinders()
    {
        return engineCylinders;
    }

    public Person getOwner()
    {
        return new Person(owner);
    }

    public void setManufacturerName(String mn)
    {
        manufacturerName = mn;
    }

    public void setEngineCylinders(int ec)
    {
        engineCylinders = ec;
    }

    public void setOwner(Person newOwner)
    {
        owner = new Person(newOwner);
    }

    public String toString()
    {
        String s;
        s = "Manufacturer Name: " + manufacturerName + " Engine Cylinders: "
                + engineCylinders + " " + getOwner().toString();
        return s;
    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;

        if ((obj != null) && (getClass() == obj.getClass()))
        {
            Vehicle v = (Vehicle) obj;
            if ((manufacturerName.equals(v.manufacturerName)) && (engineCylinders == v.engineCylinders)
                    && (getOwner().equals(v.getOwner())))
            {
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    public Vehicle clone()
    {
        return new Vehicle(this);
    }

    public void finalize()
    {
        System.out.println("Vehicle - finalize method");
    }

}
