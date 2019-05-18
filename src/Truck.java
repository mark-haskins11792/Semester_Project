//Truck derived class of vehicle
public class Truck extends Vehicle
{
    private double towingCapacity;
    private double loadCapacity;

    public Truck()
    {
        this("", 0, new Person("", "", 0, ""), 0.0, 0.0);
        System.out.println("Truck - default constructor");
    }

    public Truck(String mn, int ec, Person o, double tc, double lc)
    {
        super(mn, ec, o);
        towingCapacity = tc;
        loadCapacity = lc;
        System.out.println("Truck - overloaded constructor");
    }

    public Truck(Truck obj) throws NullPointerException
    {
        super(obj);
        towingCapacity = obj.towingCapacity;
        loadCapacity = obj.loadCapacity;
        System.out.println("Truck - copy constructor");
    }

    public double getLoadCapacity()
    {
        return loadCapacity;
    }

    public double getTowingCapacity()
    {
        return towingCapacity;
    }

    public void setTowingCapacity(double tc)
    {
        towingCapacity = tc;
    }

    public void setLoadCapacity(double lc)
    {
        loadCapacity = lc;
    }

    public String toString()
    {
        String s;
        s = super.toString() + " Towing Capacity: " + towingCapacity
                + " Load Capacity: " + loadCapacity;
        return s;
    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;

        if ((obj != null) && (getClass() == obj.getClass()))
        {
            Truck t = (Truck) obj;
            if ((super.equals(obj)) && (towingCapacity == t.towingCapacity)
                    && (loadCapacity == t.loadCapacity))
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

    public Truck clone() //throws CloneNotSupportedException
    {
        //throws new CloneNotSupportedException
        return new Truck(this);
    }

    public void finalize()
    {
        System.out.println("Truck - finalize method");
    }
}
