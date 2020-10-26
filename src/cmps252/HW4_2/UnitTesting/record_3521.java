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

@Tag("18")
class Record_3521 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3521: FirstName is Jamaal")
	void FirstNameOfRecord3521() {
		assertEquals("Jamaal", customers.get(3520).getFirstName());
	}

	@Test
	@DisplayName("Record 3521: LastName is Greenleaf")
	void LastNameOfRecord3521() {
		assertEquals("Greenleaf", customers.get(3520).getLastName());
	}

	@Test
	@DisplayName("Record 3521: Company is Merry Maids")
	void CompanyOfRecord3521() {
		assertEquals("Merry Maids", customers.get(3520).getCompany());
	}

	@Test
	@DisplayName("Record 3521: Address is 229 W 28th St")
	void AddressOfRecord3521() {
		assertEquals("229 W 28th St", customers.get(3520).getAddress());
	}

	@Test
	@DisplayName("Record 3521: City is New York")
	void CityOfRecord3521() {
		assertEquals("New York", customers.get(3520).getCity());
	}

	@Test
	@DisplayName("Record 3521: County is New York")
	void CountyOfRecord3521() {
		assertEquals("New York", customers.get(3520).getCounty());
	}

	@Test
	@DisplayName("Record 3521: State is NY")
	void StateOfRecord3521() {
		assertEquals("NY", customers.get(3520).getState());
	}

	@Test
	@DisplayName("Record 3521: ZIP is 10001")
	void ZIPOfRecord3521() {
		assertEquals("10001", customers.get(3520).getZIP());
	}

	@Test
	@DisplayName("Record 3521: Phone is 212-268-5508")
	void PhoneOfRecord3521() {
		assertEquals("212-268-5508", customers.get(3520).getPhone());
	}

	@Test
	@DisplayName("Record 3521: Fax is 212-268-1589")
	void FaxOfRecord3521() {
		assertEquals("212-268-1589", customers.get(3520).getFax());
	}

	@Test
	@DisplayName("Record 3521: Email is jamaal@greenleaf.com")
	void EmailOfRecord3521() {
		assertEquals("jamaal@greenleaf.com", customers.get(3520).getEmail());
	}

	@Test
	@DisplayName("Record 3521: Web is http://www.jamaalgreenleaf.com")
	void WebOfRecord3521() {
		assertEquals("http://www.jamaalgreenleaf.com", customers.get(3520).getWeb());
	}
}
