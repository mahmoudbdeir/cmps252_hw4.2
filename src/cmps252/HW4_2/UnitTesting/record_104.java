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

@Tag("23")
class Record_104 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 104: FirstName is Petra")
	void FirstNameOfRecord104() {
		assertEquals("Petra", customers.get(103).getFirstName());
	}

	@Test
	@DisplayName("Record 104: LastName is Cangey")
	void LastNameOfRecord104() {
		assertEquals("Cangey", customers.get(103).getLastName());
	}

	@Test
	@DisplayName("Record 104: Company is Plunkett, Hugh V Iii")
	void CompanyOfRecord104() {
		assertEquals("Plunkett, Hugh V Iii", customers.get(103).getCompany());
	}

	@Test
	@DisplayName("Record 104: Address is 4400 Worth St")
	void AddressOfRecord104() {
		assertEquals("4400 Worth St", customers.get(103).getAddress());
	}

	@Test
	@DisplayName("Record 104: City is Los Angeles")
	void CityOfRecord104() {
		assertEquals("Los Angeles", customers.get(103).getCity());
	}

	@Test
	@DisplayName("Record 104: County is Los Angeles")
	void CountyOfRecord104() {
		assertEquals("Los Angeles", customers.get(103).getCounty());
	}

	@Test
	@DisplayName("Record 104: State is CA")
	void StateOfRecord104() {
		assertEquals("CA", customers.get(103).getState());
	}

	@Test
	@DisplayName("Record 104: ZIP is 90063")
	void ZIPOfRecord104() {
		assertEquals("90063", customers.get(103).getZIP());
	}

	@Test
	@DisplayName("Record 104: Phone is 323-262-2280")
	void PhoneOfRecord104() {
		assertEquals("323-262-2280", customers.get(103).getPhone());
	}

	@Test
	@DisplayName("Record 104: Fax is 323-262-9151")
	void FaxOfRecord104() {
		assertEquals("323-262-9151", customers.get(103).getFax());
	}

	@Test
	@DisplayName("Record 104: Email is petra@cangey.com")
	void EmailOfRecord104() {
		assertEquals("petra@cangey.com", customers.get(103).getEmail());
	}

	@Test
	@DisplayName("Record 104: Web is http://www.petracangey.com")
	void WebOfRecord104() {
		assertEquals("http://www.petracangey.com", customers.get(103).getWeb());
	}
}
