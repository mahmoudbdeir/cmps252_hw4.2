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

@Tag("7")
class Record_2038 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2038: FirstName is Charmaine")
	void FirstNameOfRecord2038() {
		assertEquals("Charmaine", customers.get(2037).getFirstName());
	}

	@Test
	@DisplayName("Record 2038: LastName is Hansbrough")
	void LastNameOfRecord2038() {
		assertEquals("Hansbrough", customers.get(2037).getLastName());
	}

	@Test
	@DisplayName("Record 2038: Company is Jean Patou Inc")
	void CompanyOfRecord2038() {
		assertEquals("Jean Patou Inc", customers.get(2037).getCompany());
	}

	@Test
	@DisplayName("Record 2038: Address is 5601 Biggs Rd")
	void AddressOfRecord2038() {
		assertEquals("5601 Biggs Rd", customers.get(2037).getAddress());
	}

	@Test
	@DisplayName("Record 2038: City is Richmond")
	void CityOfRecord2038() {
		assertEquals("Richmond", customers.get(2037).getCity());
	}

	@Test
	@DisplayName("Record 2038: County is Richmond City")
	void CountyOfRecord2038() {
		assertEquals("Richmond City", customers.get(2037).getCounty());
	}

	@Test
	@DisplayName("Record 2038: State is VA")
	void StateOfRecord2038() {
		assertEquals("VA", customers.get(2037).getState());
	}

	@Test
	@DisplayName("Record 2038: ZIP is 23224")
	void ZIPOfRecord2038() {
		assertEquals("23224", customers.get(2037).getZIP());
	}

	@Test
	@DisplayName("Record 2038: Phone is 804-231-0711")
	void PhoneOfRecord2038() {
		assertEquals("804-231-0711", customers.get(2037).getPhone());
	}

	@Test
	@DisplayName("Record 2038: Fax is 804-231-9422")
	void FaxOfRecord2038() {
		assertEquals("804-231-9422", customers.get(2037).getFax());
	}

	@Test
	@DisplayName("Record 2038: Email is charmaine@hansbrough.com")
	void EmailOfRecord2038() {
		assertEquals("charmaine@hansbrough.com", customers.get(2037).getEmail());
	}

	@Test
	@DisplayName("Record 2038: Web is http://www.charmainehansbrough.com")
	void WebOfRecord2038() {
		assertEquals("http://www.charmainehansbrough.com", customers.get(2037).getWeb());
	}
}
