import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

@WebServlet(name = "CricketServlet")
public class CricketServlet extends HttpServlet {
    ArrayList<Cricket> matchList = new ArrayList<>();

    public void init() throws ServletException {

        Cricket matchOne = new Cricket("India","Pakistan","Mumbai",234);
        Cricket matchTwo = new Cricket("India","England","London",400);
        Cricket matchThree = new Cricket("South Africa","Pakistan","Pune",344);
        Cricket matchFour = new Cricket("India","Australia","Kolkata",130);

        matchList.add(matchOne);
        matchList.add(matchTwo);
        matchList.add(matchThree);
        matchList.add(matchFour);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String countryOne = request.getParameter("CountryOne");
        String countryTwo = request.getParameter("CountryTwo");
        PrintWriter pw = response.getWriter();
        pw.write(countryOne);
        Iterator<Cricket> itr = matchList.iterator();
        while (itr.hasNext()) {
            Cricket cricket = (Cricket) itr.next();
            if(cricket.getCountryOne().equalsIgnoreCase(countryOne) && cricket.getCountryTwo().equalsIgnoreCase(countryTwo)) {
                pw.write(cricket.toString());
            }

        }
    }
}
