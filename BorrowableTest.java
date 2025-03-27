// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Proivdes implementation for Borrowable and its descendants. 
interface Borrowable{
    
    public boolean borrowItem(String Date);
    public boolean returnItem(String Date);
}

abstract class LibraryItem implements Borrowable{
    private String author;
    private String title;
    private String acquisitionDate;
    private String callCode;
    private double ReplacementCost;
    private boolean CheckedOut;
    
    public abstract boolean borrowItem(String Date);
    
    public abstract boolean returnItem(String Date);
        
}

class Book extends LibraryItem{
    private boolean Fiction;
    
    @Override
    public boolean borrowItem(String Date)
    {
        return true;
    }
    
    @Override
    public boolean returnItem(String Date)
    {
        return true;
    }
    
    public void ReadBook()
    {
        // stub method
    }
}

class DVD extends LibraryItem{
    private double length;
    
    @Override
    public boolean borrowItem(String Date)
    {
        return true;
    }
    
    @Override
    public boolean returnItem(String Date)
    {
        return true;
    }
    public void WatchDVD()
    {
        // Stub method
    }
}

class Notification{
    private String issueDate;
    private String itemName;
    private String dueDate;
    private double fine;

    public void ShowNotif()
    {
        // Stub method
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Book libre = new Book();
        System.out.println(libre.borrowItem("April 2, 2025"));
    }
}