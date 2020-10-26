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

@Tag("21")
class Record_446 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 446: FirstName is Carole")
	void FirstNameOfRecord446() {
		assertEquals("Carole", customers.get(445).getFirstName());
	}

	@Test
	@DisplayName("Record 446: LastName is Nistler")
	void LastNameOfRecord446() {
		assertEquals("Nistler", customers.get(445).getLastName());
	}

	@Test
	@DisplayName("Record 446: Company is Fire Stop")
	void CompanyOfRecord446() {
		assertEquals("Fire Stop", customers.get(445).getCompany());
	}

	@Test
	@DisplayName("Record 446: Address is 2365 Main St")
	void AddressOfRecord446() {
		assertEquals("2365 Main St", customers.get(445).getAddress());
	}

	@Test
	@DisplayName("Record 446: City is Bridgeport")
	void CityOfRecord446() {
		assertEquals("Bridgeport", customers.get(445).getCity());
	}

	@Test
	@DisplayName("Record 446: County is Fairfield")
	void CountyOfRecord446() {
		assertEquals("Fairfield", customers.get(445).getCounty());
	}

	@Test
	@DisplayName("Record 446: State is CT")
	void StateOfRecord446() {
		assertEquals("CT", customers.get(445).getState());
	}

	@Test
	@DisplayName("Record 446: ZIP is 6606")
	void ZIPOfRecord446() {
		assertEquals("6606", customers.get(445).getZIP());
	}

	@Test
	@DisplayName("Record 446: Phone is 203-334-4197")
	void PhoneOfRecord446() {
		assertEquals("203-334-4197", customers.get(445).getPhone());
	}

	@Test
	@DisplayName("Record 446: Fax is 203-334-7776")
	void FaxOfRecord446() {
		assertEquals("203-334-7776", customers.get(445).getFax());
	}

	@Test
	@DisplayName("Record 446: Email is carole@nistler.com")
	void EmailOfRecord446() {
		assertEquals("carole@nistler.com", customers.get(445).getEmail());
	}

	@Test
	@DisplayName("Record 446: Web is http://www.carolenistler.com")
	void WebOfRecord446() {
		assertEquals("http://www.carolenistler.com", customers.get(445).getWeb());
	}
}
