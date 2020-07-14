import java.sql.*;

class record1
{
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

	// CREATE TABLE
	String sql = " create table emp1(empid int , empname varchar(10),empphn long,empsalary int)";
	st.executeUpdate(sql);

	// insert into table ------------------------------
	sql = "insert into emp1 value(1,'muskan',9893778543,900000)";
	//System.out.println("yooooo");
	st.executeUpdate(sql);
	//System.out.println("yaaaaaaaa");
	sql = "insert into emp1 value(2,'akhil',8707657898,600000)";
	st.executeUpdate(sql);

	//update table-------------------------------------
	sql = "update emp1 set empsalary = 7000000 where empid =2";
	st.executeUpdate(sql);


	//result

	ResultSet rs = st.executeQuery(" select * from emp1");
	System.out.println("\n***** EMPLOYEE DETAILS *****");
	System.out.println("empid \t name \t salary\n");
	while(rs.next())
	{
		int id = rs.getInt("empid");
		String emp_name = rs.getString("empname");
		int emp_salary = rs.getInt("empsalary");
		System.out.println(id+" \t"+emp_name+" \t"+emp_salary);

	}







	st.close();
	con.close();
	}
}