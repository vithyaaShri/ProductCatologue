import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DataInsert extends HttpServlet {
    //Dopost method to insert into database
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String connectionURL = "jdbc:mysql://localhost:3306/product";// customer is the database
        Connection connection;
        try{
            //request.getParameter will get the input from html page from the "name" attributes
            String Username = request.getParameter("username");
            String BookName= request.getParameter("book");
            String FeedBack=request.getParameter("feed");

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, "root", "123456");
            PreparedStatement pst = connection.prepareStatement("insert into Book values(?,?,?)");
            pst.setString(1,Username);
            pst.setString(2,BookName);
            pst.setString(3,FeedBack);
            //to insert into database executeUpdate() method is used
            int i = pst.executeUpdate();
            if(i!=0){
                pw.println("<br>Record has been inserted");


            }
            else{
                pw.println("failed to insert the data");
            }
        }
        catch (Exception e){
            pw.println(e);
        }
    }

}