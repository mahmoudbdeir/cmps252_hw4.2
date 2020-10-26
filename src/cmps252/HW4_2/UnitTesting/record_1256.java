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

@Tag("8")
class Record_1256 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1256: FirstName is Lolita")
	void FirstNameOfRecord1256() {
		assertEquals("Lolita", customers.get(1255).getFirstName());
	}

	@Test
	@DisplayName("Record 1256: LastName is Nancy")
	void LastNameOfRecord1256() {
		assertEquals("Nancy", customers.get(1255).getLastName());
	}

	@Test
	@DisplayName("Record 1256: Company is Chic Travel")
	void CompanyOfRecord1256() {
		assertEquals("Chic Travel", customers.get(1255).getCompany());
	}

	@Test
	@DisplayName("Record 1256: Address is 740 Lloyd Rd")
	void AddressOfRecord1256() {
		assertEquals("740 Lloyd Rd", customers.get(1255).getAddress());
	}

	@Test
	@DisplayName("Record 1256: City is Matawan")
	void CityOfRecord1256() {
		assertEquals("Matawan", customers.get(1255).getCity());
	}

	@Test
	@DisplayName("Record 1256: County is Monmouth")
	void CountyOfRecord1256() {
		assertEquals("Monmouth", customers.get(1255).getCounty());
	}

	@Test
	@DisplayName("Record 1256: State is NJ")
	void StateOfRecord1256() {
		assertEquals("NJ", customers.get(1255).getState());
	}

	@Test
	@DisplayName("Record 1256: ZIP is 7747")
	void ZIPOfRecord1256() {
		assertEquals("7747", customers.get(1255).getZIP());
	}

	@Test
	@DisplayName("Record 1256: Phone is 732-583-9933")
	void PhoneOfRecord1256() {
		assertEquals("732-583-9933", customers.get(1255).getPhone());
	}

	@Test
	@DisplayName("Record 1256: Fax is 732-583-5622")
	void FaxOfRecord1256() {
		assertEquals("732-583-5622", customers.get(1255).getFax());
	}

	@Test
	@DisplayName("Record 1256: Email is lolita@nancy.com")
	void EmailOfRecord1256() {
		assertEquals("lolita@nancy.com", customers.get(1255).getEmail());
	}

	@Test
	@DisplayName("Record 1256: Web is http://www.lolitanancy.com")
	void WebOfRecord1256() {
		assertEquals("http://www.lolitanancy.com", customers.get(1255).getWeb());
	}
}
