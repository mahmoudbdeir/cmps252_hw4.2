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

@Tag("37")
class Record_3016 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3016: FirstName is Brittany")
	void FirstNameOfRecord3016() {
		assertEquals("Brittany", customers.get(3015).getFirstName());
	}

	@Test
	@DisplayName("Record 3016: LastName is Wayford")
	void LastNameOfRecord3016() {
		assertEquals("Wayford", customers.get(3015).getLastName());
	}

	@Test
	@DisplayName("Record 3016: Company is Copy Cat Printing Co")
	void CompanyOfRecord3016() {
		assertEquals("Copy Cat Printing Co", customers.get(3015).getCompany());
	}

	@Test
	@DisplayName("Record 3016: Address is 2201 Wilson Blvd")
	void AddressOfRecord3016() {
		assertEquals("2201 Wilson Blvd", customers.get(3015).getAddress());
	}

	@Test
	@DisplayName("Record 3016: City is Arlington")
	void CityOfRecord3016() {
		assertEquals("Arlington", customers.get(3015).getCity());
	}

	@Test
	@DisplayName("Record 3016: County is Arlington")
	void CountyOfRecord3016() {
		assertEquals("Arlington", customers.get(3015).getCounty());
	}

	@Test
	@DisplayName("Record 3016: State is VA")
	void StateOfRecord3016() {
		assertEquals("VA", customers.get(3015).getState());
	}

	@Test
	@DisplayName("Record 3016: ZIP is 22201")
	void ZIPOfRecord3016() {
		assertEquals("22201", customers.get(3015).getZIP());
	}

	@Test
	@DisplayName("Record 3016: Phone is 703-527-1912")
	void PhoneOfRecord3016() {
		assertEquals("703-527-1912", customers.get(3015).getPhone());
	}

	@Test
	@DisplayName("Record 3016: Fax is 703-527-5824")
	void FaxOfRecord3016() {
		assertEquals("703-527-5824", customers.get(3015).getFax());
	}

	@Test
	@DisplayName("Record 3016: Email is brittany@wayford.com")
	void EmailOfRecord3016() {
		assertEquals("brittany@wayford.com", customers.get(3015).getEmail());
	}

	@Test
	@DisplayName("Record 3016: Web is http://www.brittanywayford.com")
	void WebOfRecord3016() {
		assertEquals("http://www.brittanywayford.com", customers.get(3015).getWeb());
	}
}
