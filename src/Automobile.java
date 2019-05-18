//Automobile - derived class of Vehicle
public class Automobile extends Vehicle
{
    private int passengers;
    private double weight;

    public Automobile()
    {
        this("", 0, new Person("", "", 0, ""), 0, 0.0);
        System.out.println("Automobile - default constructor");
    }

    public Automobile(String mn, int ec, Person o, int p, double w)
    {
        super(mn, ec, o);
        passengers = p;
        weight = w;
        System.out.println("Automobile - overloaded constructor");
    }

    public Automobile(Automobile obj) throws NullPointerException
    {
        super(obj);
        passengers = obj.passengers;
        weight = obj.weight;
        System.out.println("Automobile - copy constructor");
    }

    public int getPassengers()
    {
        return passengers;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setPassengers(int p)
    {
        passengers = p;
    }

    public void setWeight(double w)
    {
        weight = w;
    }

    public String toString()
    {
        String s;
        s = super.toString() + " Passengers: " + passengers + " Weight: " + weight;
        return s;
    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;

        if ((obj != null) && (getClass() == obj.getClass()))
        {
            Automobile a = (Automobile) obj;
            if ((super.equals(obj)) && (passengers == a.passengers) && (weight == a.weight))
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

    public Automobile clone() // throw new CloneNotSupportedException();
    {
        // throw new CloneNotSupportedException();
        return new Automobile(this);
    }

    public void finalize()
    {
        System.out.println("Automobile - finalize method");
    }

}
