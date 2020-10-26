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

@Tag("15")
class Record_1039 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1039: FirstName is Noah")
	void FirstNameOfRecord1039() {
		assertEquals("Noah", customers.get(1038).getFirstName());
	}

	@Test
	@DisplayName("Record 1039: LastName is Namanny")
	void LastNameOfRecord1039() {
		assertEquals("Namanny", customers.get(1038).getLastName());
	}

	@Test
	@DisplayName("Record 1039: Company is Ferrell Reed Ltd Inc")
	void CompanyOfRecord1039() {
		assertEquals("Ferrell Reed Ltd Inc", customers.get(1038).getCompany());
	}

	@Test
	@DisplayName("Record 1039: Address is 1645 Old County Rd")
	void AddressOfRecord1039() {
		assertEquals("1645 Old County Rd", customers.get(1038).getAddress());
	}

	@Test
	@DisplayName("Record 1039: City is San Carlos")
	void CityOfRecord1039() {
		assertEquals("San Carlos", customers.get(1038).getCity());
	}

	@Test
	@DisplayName("Record 1039: County is San Mateo")
	void CountyOfRecord1039() {
		assertEquals("San Mateo", customers.get(1038).getCounty());
	}

	@Test
	@DisplayName("Record 1039: State is CA")
	void StateOfRecord1039() {
		assertEquals("CA", customers.get(1038).getState());
	}

	@Test
	@DisplayName("Record 1039: ZIP is 94070")
	void ZIPOfRecord1039() {
		assertEquals("94070", customers.get(1038).getZIP());
	}

	@Test
	@DisplayName("Record 1039: Phone is 650-591-6703")
	void PhoneOfRecord1039() {
		assertEquals("650-591-6703", customers.get(1038).getPhone());
	}

	@Test
	@DisplayName("Record 1039: Fax is 650-591-2453")
	void FaxOfRecord1039() {
		assertEquals("650-591-2453", customers.get(1038).getFax());
	}

	@Test
	@DisplayName("Record 1039: Email is noah@namanny.com")
	void EmailOfRecord1039() {
		assertEquals("noah@namanny.com", customers.get(1038).getEmail());
	}

	@Test
	@DisplayName("Record 1039: Web is http://www.noahnamanny.com")
	void WebOfRecord1039() {
		assertEquals("http://www.noahnamanny.com", customers.get(1038).getWeb());
	}
}
