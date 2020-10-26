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

@Tag("40")
class Record_2030 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2030: FirstName is Adriana")
	void FirstNameOfRecord2030() {
		assertEquals("Adriana", customers.get(2029).getFirstName());
	}

	@Test
	@DisplayName("Record 2030: LastName is Lemus")
	void LastNameOfRecord2030() {
		assertEquals("Lemus", customers.get(2029).getLastName());
	}

	@Test
	@DisplayName("Record 2030: Company is S & S Beauty Supls")
	void CompanyOfRecord2030() {
		assertEquals("S & S Beauty Supls", customers.get(2029).getCompany());
	}

	@Test
	@DisplayName("Record 2030: Address is 4340 Vandever Ave")
	void AddressOfRecord2030() {
		assertEquals("4340 Vandever Ave", customers.get(2029).getAddress());
	}

	@Test
	@DisplayName("Record 2030: City is San Diego")
	void CityOfRecord2030() {
		assertEquals("San Diego", customers.get(2029).getCity());
	}

	@Test
	@DisplayName("Record 2030: County is San Diego")
	void CountyOfRecord2030() {
		assertEquals("San Diego", customers.get(2029).getCounty());
	}

	@Test
	@DisplayName("Record 2030: State is CA")
	void StateOfRecord2030() {
		assertEquals("CA", customers.get(2029).getState());
	}

	@Test
	@DisplayName("Record 2030: ZIP is 92120")
	void ZIPOfRecord2030() {
		assertEquals("92120", customers.get(2029).getZIP());
	}

	@Test
	@DisplayName("Record 2030: Phone is 858-281-3492")
	void PhoneOfRecord2030() {
		assertEquals("858-281-3492", customers.get(2029).getPhone());
	}

	@Test
	@DisplayName("Record 2030: Fax is 858-281-6504")
	void FaxOfRecord2030() {
		assertEquals("858-281-6504", customers.get(2029).getFax());
	}

	@Test
	@DisplayName("Record 2030: Email is adriana@lemus.com")
	void EmailOfRecord2030() {
		assertEquals("adriana@lemus.com", customers.get(2029).getEmail());
	}

	@Test
	@DisplayName("Record 2030: Web is http://www.adrianalemus.com")
	void WebOfRecord2030() {
		assertEquals("http://www.adrianalemus.com", customers.get(2029).getWeb());
	}
}
