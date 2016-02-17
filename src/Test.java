import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Bid;
import com.entity.Item;
import com.entity.Product;
import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session  session = sessionFactory.openSession();
		
		Item item = (Item)session.get(Item.class, 101);
		
		System.out.println("Itemid    : "+item.getId());
		System.out.println("ItemName  : "+item.getName());
		System.out.println("ItemPrice : "+item.getPrice());
		
		System.out.println();
		
		Set<Bid> bids = item.getBids();
		
		for (Bid bid : bids) {
			
			System.out.println("BidId    : "+bid.getId());
			System.out.println("BidPrice : "+bid.getBidPrice());
			System.out.println();
		}
		
//		Product product = new Product(134,"External DVD drive","Lenovo Drive",4000);
//		
//		Transaction transaction = session.getTransaction();
//		
//		transaction.begin();
//		
//			session.save(product);
//			
//		transaction.commit();
//		
//		Product product = (Product)session.get(Product.class,102);
//		
//		System.out.println("ProductId    : "+product.getId());
//		System.out.println("ProductName  : "+product.getName());
//		System.out.println("ProductPrice : "+product.getPrice());
//		System.out.println("ProductDesc  : "+product.getDescription());

	}

}
