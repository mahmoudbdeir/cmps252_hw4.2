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

@Tag("35")
class Record_2346 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2346: FirstName is Gina")
	void FirstNameOfRecord2346() {
		assertEquals("Gina", customers.get(2345).getFirstName());
	}

	@Test
	@DisplayName("Record 2346: LastName is Blanford")
	void LastNameOfRecord2346() {
		assertEquals("Blanford", customers.get(2345).getLastName());
	}

	@Test
	@DisplayName("Record 2346: Company is Websters Nursery")
	void CompanyOfRecord2346() {
		assertEquals("Websters Nursery", customers.get(2345).getCompany());
	}

	@Test
	@DisplayName("Record 2346: Address is 215 Bergen Blvd")
	void AddressOfRecord2346() {
		assertEquals("215 Bergen Blvd", customers.get(2345).getAddress());
	}

	@Test
	@DisplayName("Record 2346: City is Fairview")
	void CityOfRecord2346() {
		assertEquals("Fairview", customers.get(2345).getCity());
	}

	@Test
	@DisplayName("Record 2346: County is Bergen")
	void CountyOfRecord2346() {
		assertEquals("Bergen", customers.get(2345).getCounty());
	}

	@Test
	@DisplayName("Record 2346: State is NJ")
	void StateOfRecord2346() {
		assertEquals("NJ", customers.get(2345).getState());
	}

	@Test
	@DisplayName("Record 2346: ZIP is 7022")
	void ZIPOfRecord2346() {
		assertEquals("7022", customers.get(2345).getZIP());
	}

	@Test
	@DisplayName("Record 2346: Phone is 201-941-8168")
	void PhoneOfRecord2346() {
		assertEquals("201-941-8168", customers.get(2345).getPhone());
	}

	@Test
	@DisplayName("Record 2346: Fax is 201-941-6308")
	void FaxOfRecord2346() {
		assertEquals("201-941-6308", customers.get(2345).getFax());
	}

	@Test
	@DisplayName("Record 2346: Email is gina@blanford.com")
	void EmailOfRecord2346() {
		assertEquals("gina@blanford.com", customers.get(2345).getEmail());
	}

	@Test
	@DisplayName("Record 2346: Web is http://www.ginablanford.com")
	void WebOfRecord2346() {
		assertEquals("http://www.ginablanford.com", customers.get(2345).getWeb());
	}
}
