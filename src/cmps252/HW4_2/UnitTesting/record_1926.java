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
class Record_1926 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1926: FirstName is Ferdinand")
	void FirstNameOfRecord1926() {
		assertEquals("Ferdinand", customers.get(1925).getFirstName());
	}

	@Test
	@DisplayName("Record 1926: LastName is Bilbo")
	void LastNameOfRecord1926() {
		assertEquals("Bilbo", customers.get(1925).getLastName());
	}

	@Test
	@DisplayName("Record 1926: Company is Atlantic Moving & Storage Corp")
	void CompanyOfRecord1926() {
		assertEquals("Atlantic Moving & Storage Corp", customers.get(1925).getCompany());
	}

	@Test
	@DisplayName("Record 1926: Address is 334 W 3rd St  #-207")
	void AddressOfRecord1926() {
		assertEquals("334 W 3rd St  #-207", customers.get(1925).getAddress());
	}

	@Test
	@DisplayName("Record 1926: City is San Bernardino")
	void CityOfRecord1926() {
		assertEquals("San Bernardino", customers.get(1925).getCity());
	}

	@Test
	@DisplayName("Record 1926: County is San Bernardino")
	void CountyOfRecord1926() {
		assertEquals("San Bernardino", customers.get(1925).getCounty());
	}

	@Test
	@DisplayName("Record 1926: State is CA")
	void StateOfRecord1926() {
		assertEquals("CA", customers.get(1925).getState());
	}

	@Test
	@DisplayName("Record 1926: ZIP is 92401")
	void ZIPOfRecord1926() {
		assertEquals("92401", customers.get(1925).getZIP());
	}

	@Test
	@DisplayName("Record 1926: Phone is 909-884-3387")
	void PhoneOfRecord1926() {
		assertEquals("909-884-3387", customers.get(1925).getPhone());
	}

	@Test
	@DisplayName("Record 1926: Fax is 909-884-9561")
	void FaxOfRecord1926() {
		assertEquals("909-884-9561", customers.get(1925).getFax());
	}

	@Test
	@DisplayName("Record 1926: Email is ferdinand@bilbo.com")
	void EmailOfRecord1926() {
		assertEquals("ferdinand@bilbo.com", customers.get(1925).getEmail());
	}

	@Test
	@DisplayName("Record 1926: Web is http://www.ferdinandbilbo.com")
	void WebOfRecord1926() {
		assertEquals("http://www.ferdinandbilbo.com", customers.get(1925).getWeb());
	}
}
