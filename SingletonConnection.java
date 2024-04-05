import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SingletonConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
            Class.forName("org.postgresql.Driver");

            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestion_des_produits","postgres","ADMIN");

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("SELECT * FROM class.les_medicament;"); 

            while(rs.next())
             System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getFloat(4));

            con.close();

            }catch(Exception e){
             System.out.println(e);
            } 
 }
}


