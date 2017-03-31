import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        Database database=applicationContext.getBean("database",Database.class);
        System.out.println(database);

        Restaurant restaurant=applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();

        System.out.println("teaRestaurant -- IS PROTOTYPE  >> " +applicationContext.isPrototype("teaRestaurant"));

        Restaurant restaurant1=applicationContext.getBean("ExpressTeaRestaurant",Restaurant.class);
        restaurant1.getHotDrink().prepareHotDrink();


        Complex complex=applicationContext.getBean("complexBean",Complex.class);
        System.out.println(complex);



        Restaurant teaRestaurant1=applicationContext.getBean("teaBean1",Restaurant.class);
        System.out.println("By NAME >>>> ");
        teaRestaurant1.getHotDrink().prepareHotDrink();



        /*Restaurant teaRestaurant2=applicationContext.getBean("teaBean2",Restaurant.class);
        System.out.println("By TYPE >>>> ");
        teaRestaurant2.getHotDrink().prepareHotDrink();*/


        Restaurant teaRestaurant3=applicationContext.getBean("teaBean3",Restaurant.class);
        System.out.println("By Constructor >>>> ");
        teaRestaurant3.getHotDrink().prepareHotDrink();





    }
}
