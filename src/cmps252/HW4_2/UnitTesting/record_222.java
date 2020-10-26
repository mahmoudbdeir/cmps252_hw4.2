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

@Tag("29")
class Record_222 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 222: FirstName is Kurt")
	void FirstNameOfRecord222() {
		assertEquals("Kurt", customers.get(221).getFirstName());
	}

	@Test
	@DisplayName("Record 222: LastName is Cloonan")
	void LastNameOfRecord222() {
		assertEquals("Cloonan", customers.get(221).getLastName());
	}

	@Test
	@DisplayName("Record 222: Company is Buchan Industries Inc")
	void CompanyOfRecord222() {
		assertEquals("Buchan Industries Inc", customers.get(221).getCompany());
	}

	@Test
	@DisplayName("Record 222: Address is 8181 Center")
	void AddressOfRecord222() {
		assertEquals("8181 Center", customers.get(221).getAddress());
	}

	@Test
	@DisplayName("Record 222: City is La Mesa")
	void CityOfRecord222() {
		assertEquals("La Mesa", customers.get(221).getCity());
	}

	@Test
	@DisplayName("Record 222: County is San Diego")
	void CountyOfRecord222() {
		assertEquals("San Diego", customers.get(221).getCounty());
	}

	@Test
	@DisplayName("Record 222: State is CA")
	void StateOfRecord222() {
		assertEquals("CA", customers.get(221).getState());
	}

	@Test
	@DisplayName("Record 222: ZIP is 91942")
	void ZIPOfRecord222() {
		assertEquals("91942", customers.get(221).getZIP());
	}

	@Test
	@DisplayName("Record 222: Phone is 619-697-6307")
	void PhoneOfRecord222() {
		assertEquals("619-697-6307", customers.get(221).getPhone());
	}

	@Test
	@DisplayName("Record 222: Fax is 619-697-5673")
	void FaxOfRecord222() {
		assertEquals("619-697-5673", customers.get(221).getFax());
	}

	@Test
	@DisplayName("Record 222: Email is kurt@cloonan.com")
	void EmailOfRecord222() {
		assertEquals("kurt@cloonan.com", customers.get(221).getEmail());
	}

	@Test
	@DisplayName("Record 222: Web is http://www.kurtcloonan.com")
	void WebOfRecord222() {
		assertEquals("http://www.kurtcloonan.com", customers.get(221).getWeb());
	}
}
