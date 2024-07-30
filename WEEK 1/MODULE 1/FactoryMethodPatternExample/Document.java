public interface Document{
    void create();
}

//Provides an interface for creating objects, but allows subclasses to decide which class to instantiate.
//Useful when you want to abstract the object creation process and create objects without specifying the exact class.