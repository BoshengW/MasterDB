import model.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] agrs) {
        City newCity = new City();
        newCity.setCity_name("tianjin");
        newCity.setDescription("My home");
        newCity.setId(6);
        newCity.setProvince_id(10);

        // save(newCity) -> save to database
        Configuration config = new Configuration();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession(); // get method of session
        session.save(newCity);
    }
}
