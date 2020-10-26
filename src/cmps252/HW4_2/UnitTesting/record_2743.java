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

@Tag("16")
class Record_2743 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2743: FirstName is Garret")
	void FirstNameOfRecord2743() {
		assertEquals("Garret", customers.get(2742).getFirstName());
	}

	@Test
	@DisplayName("Record 2743: LastName is Sundberg")
	void LastNameOfRecord2743() {
		assertEquals("Sundberg", customers.get(2742).getLastName());
	}

	@Test
	@DisplayName("Record 2743: Company is San Diego Historical Society")
	void CompanyOfRecord2743() {
		assertEquals("San Diego Historical Society", customers.get(2742).getCompany());
	}

	@Test
	@DisplayName("Record 2743: Address is 2908 Adeline St")
	void AddressOfRecord2743() {
		assertEquals("2908 Adeline St", customers.get(2742).getAddress());
	}

	@Test
	@DisplayName("Record 2743: City is Berkeley")
	void CityOfRecord2743() {
		assertEquals("Berkeley", customers.get(2742).getCity());
	}

	@Test
	@DisplayName("Record 2743: County is Alameda")
	void CountyOfRecord2743() {
		assertEquals("Alameda", customers.get(2742).getCounty());
	}

	@Test
	@DisplayName("Record 2743: State is CA")
	void StateOfRecord2743() {
		assertEquals("CA", customers.get(2742).getState());
	}

	@Test
	@DisplayName("Record 2743: ZIP is 94703")
	void ZIPOfRecord2743() {
		assertEquals("94703", customers.get(2742).getZIP());
	}

	@Test
	@DisplayName("Record 2743: Phone is 510-540-6236")
	void PhoneOfRecord2743() {
		assertEquals("510-540-6236", customers.get(2742).getPhone());
	}

	@Test
	@DisplayName("Record 2743: Fax is 510-540-2277")
	void FaxOfRecord2743() {
		assertEquals("510-540-2277", customers.get(2742).getFax());
	}

	@Test
	@DisplayName("Record 2743: Email is garret@sundberg.com")
	void EmailOfRecord2743() {
		assertEquals("garret@sundberg.com", customers.get(2742).getEmail());
	}

	@Test
	@DisplayName("Record 2743: Web is http://www.garretsundberg.com")
	void WebOfRecord2743() {
		assertEquals("http://www.garretsundberg.com", customers.get(2742).getWeb());
	}
}
