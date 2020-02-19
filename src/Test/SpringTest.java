package Test;

import Service.ProductService;
import bean.Category;
import bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Category category = (Category) context.getBean("category");
//        System.out.println(category.toString());
//        Product product = (Product) context.getBean("product");
//        System.out.println(product.toString());

        ProductService service = (ProductService) context.getBean("service");
        service.doSomeService();
    }
}
