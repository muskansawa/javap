import java.sql.*;
class Test123{
public static void main(String[] args) throws Exception
{
String driverClassName = "com.mysql.jdbc.Driver";

String url="jdbc:mysql://localhost/jdbc";
String user="root";
String pwd= "password";//root

Class.forName(driverClassName).newInstance();

//3. Open a Connection
Connection con = DriverManager.getConnection(url,user,pwd);
System.out.println("con---->"+con);

//4. Create Statement and execute sql
Statement st = con.createStatement();
String sql= "INSERT INTO emp(name,salary) VALUE('muskan',256856.05)" ;
st.executeUpdate(sql);

//5. close st and con : use finally block
st.close();
con.close();
System.out.println("---SQL executed successfully---");
}
}
