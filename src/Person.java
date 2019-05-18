//Person class
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private static int population;
    private boolean disposeCalled;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String fn)
    {
        firstName = fn;
    }

    public void setLastName(String ln)
    {
        lastName = ln;
    }

    public int getAge()
    {
        return age;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getSsn()
    {
        return ssn;
    }

    public void setSsn(String s)
    {
        ssn = s;
    }

    public static int getPopulation()
    {
        return population;
    }

    public Person()
    {
        this("", "", 0, "");
        System.out.println("Person - default constructor");
    }

    /**
     * The Person class overloaded constructor
     *
     * @param fn - first name of the person
     * @param ln - last name of the person
     * @param a  - age of the person
     * @param s  - person's social security number
     */
    public Person(String fn, String ln, int a, String s)
    {
        firstName = fn;
        lastName = ln;
        age = a;
        ssn = s;
        disposeCalled = false;
        population++;
        System.out.println("Person - overloaded constructor");
    }

    /**
     * The Person class copy constructor
     *
     * @param original - the object reference for the object to be copied
     * @throws NullPointerException the argument was not a valid reference or was null
     */
    public Person(Person original) throws NullPointerException
    {
        if (original == null)
        {
            throw new NullPointerException();
        }
        firstName = original.firstName;
        lastName = original.lastName;
        age = original.age;
        ssn = original.ssn;
        disposeCalled = false;
        population++;
        System.out.println("Person - copy constructor");
    }

    static
    {
        population = 0;
        System.out.println("Person - static initializer block");
    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;

        if ((obj != null) && (getClass() == obj.getClass()))
        {
            Person d = (Person) obj;

            if ((firstName.equals(d.firstName)) &&
                    (lastName.equals(d.lastName)) &&
                    (age == d.age))
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

    public Person clone()   //throws CloneNotSupportedException
    {
        // throw new CloneNotSupportedException();
        return new Person(this);
    }

    public String toString()
    {
        String s;
        s = "FirstName: " + firstName + " LastName: " + lastName + " Age: " + age + " SSN: " + ssn;
        return s;
    }

    public void finalize()
    {
        System.out.println("Person - finalize method");
    }
}

