import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCustomer {

	@Test
	void testStatement() {
		Movie movie1 = new Movie("Singleton 2",2);
		Movie movie2 = new Movie("Interestllar",1);
		Movie movie3 = new Movie("O Joker, o coringa, o palhaço",2);
		Movie movie4 = new Movie("Lagoa Azul",0);
		
		Rental rental1 = new Rental(movie1,2);
;		Rental rental2 = new Rental(movie2,6);
		Rental rental3 = new Rental(movie3,3);
		Rental rental4 = new Rental(movie4,1);
		
		Customer customer = new Customer("Pedro");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		customer.addRental(rental4);
		
		assertEquals(customer.statement(),"Rental Record for Pedro\n\tSingleton 2\t1.5\n\tInterestllar\t18.0\n\tO Joker, o coringa, o palhaço\t1.5\n\tLagoa Azul\t2.0\nAmount owed is 23.0\nYou earned 5 frequent renter points");
		
	}

}
