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

@Tag("26")
class Record_2665 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2665: FirstName is Noah")
	void FirstNameOfRecord2665() {
		assertEquals("Noah", customers.get(2664).getFirstName());
	}

	@Test
	@DisplayName("Record 2665: LastName is Pishner")
	void LastNameOfRecord2665() {
		assertEquals("Pishner", customers.get(2664).getLastName());
	}

	@Test
	@DisplayName("Record 2665: Company is Williams Scotsman")
	void CompanyOfRecord2665() {
		assertEquals("Williams Scotsman", customers.get(2664).getCompany());
	}

	@Test
	@DisplayName("Record 2665: Address is 4825 W Grand Ave")
	void AddressOfRecord2665() {
		assertEquals("4825 W Grand Ave", customers.get(2664).getAddress());
	}

	@Test
	@DisplayName("Record 2665: City is Chicago")
	void CityOfRecord2665() {
		assertEquals("Chicago", customers.get(2664).getCity());
	}

	@Test
	@DisplayName("Record 2665: County is Cook")
	void CountyOfRecord2665() {
		assertEquals("Cook", customers.get(2664).getCounty());
	}

	@Test
	@DisplayName("Record 2665: State is IL")
	void StateOfRecord2665() {
		assertEquals("IL", customers.get(2664).getState());
	}

	@Test
	@DisplayName("Record 2665: ZIP is 60639")
	void ZIPOfRecord2665() {
		assertEquals("60639", customers.get(2664).getZIP());
	}

	@Test
	@DisplayName("Record 2665: Phone is 773-745-5818")
	void PhoneOfRecord2665() {
		assertEquals("773-745-5818", customers.get(2664).getPhone());
	}

	@Test
	@DisplayName("Record 2665: Fax is 773-745-8116")
	void FaxOfRecord2665() {
		assertEquals("773-745-8116", customers.get(2664).getFax());
	}

	@Test
	@DisplayName("Record 2665: Email is noah@pishner.com")
	void EmailOfRecord2665() {
		assertEquals("noah@pishner.com", customers.get(2664).getEmail());
	}

	@Test
	@DisplayName("Record 2665: Web is http://www.noahpishner.com")
	void WebOfRecord2665() {
		assertEquals("http://www.noahpishner.com", customers.get(2664).getWeb());
	}
}
