package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("11")
class Record_4598 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4598: FirstName is Ronnie")
	void FirstNameOfRecord4598() {
		assertEquals("Ronnie", customers.get(4597).getFirstName());
	}

	@Test
	@DisplayName("Record 4598: LastName is Garitty")
	void LastNameOfRecord4598() {
		assertEquals("Garitty", customers.get(4597).getLastName());
	}

	@Test
	@DisplayName("Record 4598: Company is Conagra Flower Milling Co")
	void CompanyOfRecord4598() {
		assertEquals("Conagra Flower Milling Co", customers.get(4597).getCompany());
	}

	@Test
	@DisplayName("Record 4598: Address is 14 Washington Rd  #-101")
	void AddressOfRecord4598() {
		assertEquals("14 Washington Rd  #-101", customers.get(4597).getAddress());
	}

	@Test
	@DisplayName("Record 4598: City is Princeton Junction")
	void CityOfRecord4598() {
		assertEquals("Princeton Junction", customers.get(4597).getCity());
	}

	@Test
	@DisplayName("Record 4598: County is Mercer")
	void CountyOfRecord4598() {
		assertEquals("Mercer", customers.get(4597).getCounty());
	}

	@Test
	@DisplayName("Record 4598: State is NJ")
	void StateOfRecord4598() {
		assertEquals("NJ", customers.get(4597).getState());
	}

	@Test
	@DisplayName("Record 4598: ZIP is 8550")
	void ZIPOfRecord4598() {
		assertEquals("8550", customers.get(4597).getZIP());
	}

	@Test
	@DisplayName("Record 4598: Phone is 609-275-2685")
	void PhoneOfRecord4598() {
		assertEquals("609-275-2685", customers.get(4597).getPhone());
	}

	@Test
	@DisplayName("Record 4598: Fax is 609-275-4552")
	void FaxOfRecord4598() {
		assertEquals("609-275-4552", customers.get(4597).getFax());
	}

	@Test
	@DisplayName("Record 4598: Email is ronnie@garitty.com")
	void EmailOfRecord4598() {
		assertEquals("ronnie@garitty.com", customers.get(4597).getEmail());
	}

	@Test
	@DisplayName("Record 4598: Web is http://www.ronniegaritty.com")
	void WebOfRecord4598() {
		assertEquals("http://www.ronniegaritty.com", customers.get(4597).getWeb());
	}
}
