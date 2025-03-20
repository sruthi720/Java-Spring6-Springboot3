package org.jdbc;
import java.sql.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


/*
    import package
    load and register
    create connection
    create statement
    execute statement
    process the results
    close
*/

        int sid =10;
        String sname ="sona";
        int marks =78;

        String url ="jdbc:postgresql://localhost:5432/-----";
        String uName ="------";
        String password ="-------";
//        String sql ="select sname from public.\"Student\" where sid=1";
//        String sql ="select * from public.\"Student\" ";
//        String sql ="insert into public.\"Student\" values(7,'riya',49)";
//        String sql ="update public.\"Student\" set sname='manu' where sid=2";
//        String sql ="delete from  public.\"Student\" where sid=6";
        String sql ="insert into public.\"Student\" values(?,?,?)";//whatever the value is dynamic put it as question mark



        Class.forName("org.postgresql.Driver");
        Connection con =DriverManager.getConnection(url,uName,password); //create connection
        System.out.println("Connection Established");

//        Statement st = con.createStatement();//create statement 0R
        PreparedStatement st =con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);


//        ResultSet rs = st.executeQuery(sql);//execute statement
//        System.out.println(rs.next());//process the results

         /*to print*/
//        String name =rs.getString("sname");
//        System.out.println("Student name is "+ name); //for one column OR below
//          while(rs.next()){
//              System.out.print(rs.getInt(1)+"-");
//              System.out.print(rs.getString(2)+"-");
//              System.out.println(rs.getInt(3));
//          }

//         /*to insert*/
//        boolean bl =st.execute(sql);
//        System.out.println(bl);

           /*to update & delete*/
         st.execute();



        con.close();
        System.out.println("Connection Closed");

    }
}