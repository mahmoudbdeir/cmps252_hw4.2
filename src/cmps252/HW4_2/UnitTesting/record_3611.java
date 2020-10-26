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

@Tag("24")
class Record_3611 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3611: FirstName is Lenny")
	void FirstNameOfRecord3611() {
		assertEquals("Lenny", customers.get(3610).getFirstName());
	}

	@Test
	@DisplayName("Record 3611: LastName is Gowler")
	void LastNameOfRecord3611() {
		assertEquals("Gowler", customers.get(3610).getLastName());
	}

	@Test
	@DisplayName("Record 3611: Company is National Environmental Balncng")
	void CompanyOfRecord3611() {
		assertEquals("National Environmental Balncng", customers.get(3610).getCompany());
	}

	@Test
	@DisplayName("Record 3611: Address is 33 State St")
	void AddressOfRecord3611() {
		assertEquals("33 State St", customers.get(3610).getAddress());
	}

	@Test
	@DisplayName("Record 3611: City is Springfield")
	void CityOfRecord3611() {
		assertEquals("Springfield", customers.get(3610).getCity());
	}

	@Test
	@DisplayName("Record 3611: County is Hampden")
	void CountyOfRecord3611() {
		assertEquals("Hampden", customers.get(3610).getCounty());
	}

	@Test
	@DisplayName("Record 3611: State is MA")
	void StateOfRecord3611() {
		assertEquals("MA", customers.get(3610).getState());
	}

	@Test
	@DisplayName("Record 3611: ZIP is 01103")
	void ZIPOfRecord3611() {
		assertEquals("01103", customers.get(3610).getZIP());
	}

	@Test
	@DisplayName("Record 3611: Phone is 413-739-3526")
	void PhoneOfRecord3611() {
		assertEquals("413-739-3526", customers.get(3610).getPhone());
	}

	@Test
	@DisplayName("Record 3611: Fax is 413-739-6699")
	void FaxOfRecord3611() {
		assertEquals("413-739-6699", customers.get(3610).getFax());
	}

	@Test
	@DisplayName("Record 3611: Email is lenny@gowler.com")
	void EmailOfRecord3611() {
		assertEquals("lenny@gowler.com", customers.get(3610).getEmail());
	}

	@Test
	@DisplayName("Record 3611: Web is http://www.lennygowler.com")
	void WebOfRecord3611() {
		assertEquals("http://www.lennygowler.com", customers.get(3610).getWeb());
	}
}
