package database;

public class Main {
    public static void main(String[] args){

        DBConnection connection = new DBConnection();
        System.out.println("user : " + connection.isUser("qqq","111"));

    }

}
