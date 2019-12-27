package objects;

public class TableComparison {
    public static void main(String[] args) {
        Table t1 = new Table(10,20,30);
        Table t2 = new Table(10,20,30);

        String str = "234";

        System.out.println("Table comp = "+ t1.equals(t2));
        System.out.println(t1);


        }
     }

