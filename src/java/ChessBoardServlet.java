
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author umesh
 */
public class ChessBoardServlet implements Servlet {

     @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("sevelet-config");
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Wappgo Chess Board");
        out.println("</title>");
        out.println("<style>*{margin:0px;pading:0px;box-sizing:border-box}"
                + ".main{"
                + "margin:20px auto;"
                + "max-width:500px;"
                + "height:500px;"
                + "box-shadow:5px 5px 15px grey,3px 3px 12px orange;"
                + "}"
                + ".heading{"
                + "font-size:70px;"
                + "text-align:center;"
                + "box-shadow:5px 5px 25px grey;"
                + "text-shadow:1px -1px black, -1px 1px black;"
                + "color:yellow;"
                + "}"
                + "@media screen and (max-width:700px){"
                + ".heading{font-size:50px;}"
                + ".main{width:400px;height:400px}"
                + "}"
                + "@media screen and (max-width:500px){"
                + ".heading{font-size:30px;}"
                + ".main{width:300px;height:300px}"
                + "}"
                + "@media screen and (max-width:330px){"
                + ".heading{font-size:20px;}"
                + ".main{width:200px;height:200px}"
                + "}"
                + "@media screen and (max-width:250px){"
                + ".heading{font-size=1px;}"
                + ".main{width:150px;height:150px}"
                + "}"
                + "</style>");
        out.println("</head>");
        out.println("<body bgcolor=cyan>");
        out.println("<h1 class='heading'>Wappgo Chess Board</h1>");
        
        out.println("<div class=main>");
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8;j++){
                if((i%2==0 && j%2==0)||(i%2==1 && j%2==1)){
                    out.println("<div style='"
                            + "width:12.5%;"
                            + "height:12.5%;"
                            + "background-color:black;"
                            + "float:left;'></div>");
                }
                else{
                    out.println("<div style='"
                            + "width:12.5%;"
                            + "height:12.5%;"
                            + "background-color:white;"
                            + "float:left;'></div>");
                }
            }
            out.println("</br>");
        }
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        System.out.println("servlet-info");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
