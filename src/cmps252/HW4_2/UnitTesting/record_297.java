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
class Record_297 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 297: FirstName is Pilar")
	void FirstNameOfRecord297() {
		assertEquals("Pilar", customers.get(296).getFirstName());
	}

	@Test
	@DisplayName("Record 297: LastName is Axon")
	void LastNameOfRecord297() {
		assertEquals("Axon", customers.get(296).getLastName());
	}

	@Test
	@DisplayName("Record 297: Company is Jim Dunn & Associates")
	void CompanyOfRecord297() {
		assertEquals("Jim Dunn & Associates", customers.get(296).getCompany());
	}

	@Test
	@DisplayName("Record 297: Address is 4160 Commercial Dr")
	void AddressOfRecord297() {
		assertEquals("4160 Commercial Dr", customers.get(296).getAddress());
	}

	@Test
	@DisplayName("Record 297: City is Tracy")
	void CityOfRecord297() {
		assertEquals("Tracy", customers.get(296).getCity());
	}

	@Test
	@DisplayName("Record 297: County is San Joaquin")
	void CountyOfRecord297() {
		assertEquals("San Joaquin", customers.get(296).getCounty());
	}

	@Test
	@DisplayName("Record 297: State is CA")
	void StateOfRecord297() {
		assertEquals("CA", customers.get(296).getState());
	}

	@Test
	@DisplayName("Record 297: ZIP is 95376")
	void ZIPOfRecord297() {
		assertEquals("95376", customers.get(296).getZIP());
	}

	@Test
	@DisplayName("Record 297: Phone is 209-853-5143")
	void PhoneOfRecord297() {
		assertEquals("209-853-5143", customers.get(296).getPhone());
	}

	@Test
	@DisplayName("Record 297: Fax is 209-853-0134")
	void FaxOfRecord297() {
		assertEquals("209-853-0134", customers.get(296).getFax());
	}

	@Test
	@DisplayName("Record 297: Email is pilar@axon.com")
	void EmailOfRecord297() {
		assertEquals("pilar@axon.com", customers.get(296).getEmail());
	}

	@Test
	@DisplayName("Record 297: Web is http://www.pilaraxon.com")
	void WebOfRecord297() {
		assertEquals("http://www.pilaraxon.com", customers.get(296).getWeb());
	}
}
