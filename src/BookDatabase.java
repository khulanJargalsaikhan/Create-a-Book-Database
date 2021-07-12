public class BookDatabase {
    // simulating a database

    public void displayBook(String SKU){
        switch (SKU){
            case ("Java1001"):
                System.out.println("Title: Head First Java\n" +
                        "Author: Kathy Sierra and Bert Bates\n" +
                        "Description: Easy to read Java workbook\n" +
                        "Price: 47.50");
                break;
            case ("Java1002"):
                System.out.println("Title: Thinking in Java\n" +
                        "Author: Bruce Eckel\n" +
                        "Description: Details about Java under the hood\n" +
                        "Price: 20.00");
                break;
            case ("Orcl1003"):
                System.out.println("Title: OCP: Oracle Certified Professional Java SE\n" +
                        "Author: Jeanne Boyarsky\n" +
                        "Description: Everything you need to know in one place\n" +
                        "Price: 45.00");
                break;
            case ("Python1004"):
                System.out.println("Title: Automate the Boring Stuff with Python\n" +
                        "Author: Al Sweigart\n" +
                        "Description: Fun with Python\n" +
                        "Price: 10.50");
                break;
            case ("Zombie1005"):
                System.out.println("Title: The Maker's Guide to the Zombie Apocalypse\n" +
                        "Author: Simon Monk\n" +
                        "Description: Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\n" +
                        "Price: 16.50");
                break;
            case ("Rasp1006"):
                System.out.println("Title: Raspberry Pi Projects for the Evil Genius\n" +
                        "Author: Donald Norris\n" +
                        "Description: A dozen fiendishly fun projects for the Raspberry Pi!\n" +
                        "Price: 14.75");
                break;
            default:
                System.out.println("Invalid SKU. Try again!");
        }
    }


}
