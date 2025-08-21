package creational.singleton;

public class MockDatabase {

    public MockDatabase(){

    }
}

//Use this for testing in main
//public static void main(String[] args){
//    Database db1 = Database.getInstance();
//    Database db2 = Database.getInstance();
//
//    MockDatabase md1 = new MockDatabase();
//    MockDatabase md2 = new MockDatabase();
//
//    System.out.println("#Singleton Classes");
//    System.out.println("Does both Databases have the same instance: " + (db1 == db2));
//    System.out.println("DB1 code: " + db1.hashCode() + " | " + "DB2 code: " + db2.hashCode());
//    System.out.println("#Mockup Non-singleton classes");
//    System.out.println( "Does both mockups have the same instance: " + md1.equals(md2));
//    System.out.println("MD1 code: " + md1.hashCode() + " | " +  "MD2 code: " + md2.hashCode());
//}
