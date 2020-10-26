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

@Tag("36")
class Record_3254 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3254: FirstName is Isaac")
	void FirstNameOfRecord3254() {
		assertEquals("Isaac", customers.get(3253).getFirstName());
	}

	@Test
	@DisplayName("Record 3254: LastName is Haasch")
	void LastNameOfRecord3254() {
		assertEquals("Haasch", customers.get(3253).getLastName());
	}

	@Test
	@DisplayName("Record 3254: Company is W A Cleary Corp")
	void CompanyOfRecord3254() {
		assertEquals("W A Cleary Corp", customers.get(3253).getCompany());
	}

	@Test
	@DisplayName("Record 3254: Address is 9401 Nw 100th St")
	void AddressOfRecord3254() {
		assertEquals("9401 Nw 100th St", customers.get(3253).getAddress());
	}

	@Test
	@DisplayName("Record 3254: City is Miami")
	void CityOfRecord3254() {
		assertEquals("Miami", customers.get(3253).getCity());
	}

	@Test
	@DisplayName("Record 3254: County is Miami-Dade")
	void CountyOfRecord3254() {
		assertEquals("Miami-Dade", customers.get(3253).getCounty());
	}

	@Test
	@DisplayName("Record 3254: State is FL")
	void StateOfRecord3254() {
		assertEquals("FL", customers.get(3253).getState());
	}

	@Test
	@DisplayName("Record 3254: ZIP is 33178")
	void ZIPOfRecord3254() {
		assertEquals("33178", customers.get(3253).getZIP());
	}

	@Test
	@DisplayName("Record 3254: Phone is 305-887-1602")
	void PhoneOfRecord3254() {
		assertEquals("305-887-1602", customers.get(3253).getPhone());
	}

	@Test
	@DisplayName("Record 3254: Fax is 305-887-7662")
	void FaxOfRecord3254() {
		assertEquals("305-887-7662", customers.get(3253).getFax());
	}

	@Test
	@DisplayName("Record 3254: Email is isaac@haasch.com")
	void EmailOfRecord3254() {
		assertEquals("isaac@haasch.com", customers.get(3253).getEmail());
	}

	@Test
	@DisplayName("Record 3254: Web is http://www.isaachaasch.com")
	void WebOfRecord3254() {
		assertEquals("http://www.isaachaasch.com", customers.get(3253).getWeb());
	}
}
