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

@Tag("38")
class Record_4991 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4991: FirstName is Lupe")
	void FirstNameOfRecord4991() {
		assertEquals("Lupe", customers.get(4990).getFirstName());
	}

	@Test
	@DisplayName("Record 4991: LastName is Castaldi")
	void LastNameOfRecord4991() {
		assertEquals("Castaldi", customers.get(4990).getLastName());
	}

	@Test
	@DisplayName("Record 4991: Company is Hayes Electric Serv")
	void CompanyOfRecord4991() {
		assertEquals("Hayes Electric Serv", customers.get(4990).getCompany());
	}

	@Test
	@DisplayName("Record 4991: Address is 4929 E Colonial Dr")
	void AddressOfRecord4991() {
		assertEquals("4929 E Colonial Dr", customers.get(4990).getAddress());
	}

	@Test
	@DisplayName("Record 4991: City is Orlando")
	void CityOfRecord4991() {
		assertEquals("Orlando", customers.get(4990).getCity());
	}

	@Test
	@DisplayName("Record 4991: County is Orange")
	void CountyOfRecord4991() {
		assertEquals("Orange", customers.get(4990).getCounty());
	}

	@Test
	@DisplayName("Record 4991: State is FL")
	void StateOfRecord4991() {
		assertEquals("FL", customers.get(4990).getState());
	}

	@Test
	@DisplayName("Record 4991: ZIP is 32803")
	void ZIPOfRecord4991() {
		assertEquals("32803", customers.get(4990).getZIP());
	}

	@Test
	@DisplayName("Record 4991: Phone is 407-896-7642")
	void PhoneOfRecord4991() {
		assertEquals("407-896-7642", customers.get(4990).getPhone());
	}

	@Test
	@DisplayName("Record 4991: Fax is 407-896-9599")
	void FaxOfRecord4991() {
		assertEquals("407-896-9599", customers.get(4990).getFax());
	}

	@Test
	@DisplayName("Record 4991: Email is lupe@castaldi.com")
	void EmailOfRecord4991() {
		assertEquals("lupe@castaldi.com", customers.get(4990).getEmail());
	}

	@Test
	@DisplayName("Record 4991: Web is http://www.lupecastaldi.com")
	void WebOfRecord4991() {
		assertEquals("http://www.lupecastaldi.com", customers.get(4990).getWeb());
	}
}
