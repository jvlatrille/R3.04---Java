public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Martin", "01.01.02.03.04");
        Table table1 = new Table ("T01");
        System.out.println("Table 1 pas liée : ");
        System.out.println(client1.toString());

        client1.lierMaTable(table1);
        System.out.println("Table 1 liée : ");
        System.out.println(client1.toString());

        Client client2 = new Client("Durand", "02.01.02.03.04");
        Table table2 = new Table ("T02");
        System.out.println("Table 2 pas liée : ");
        System.out.println(client2.toString());

        client2.lierMaTable(table2);
        System.out.println("Table 2 liée : ");
        System.out.println(client2.toString());

        client1.delierMaTable();
        System.out.println("Table 1 déliée : ");
        System.out.println(client1.toString());

        client2.delierMaTable();
        System.out.println("Table 2 déliée : ");
        System.out.println(client2.toString());

        client1.lierMaTable(table2);
        System.out.println("Client 1 avec table 2 : ");
        System.out.println(client1.toString());
    }
}