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

@Tag("22")
class Record_1451 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1451: FirstName is Mary")
	void FirstNameOfRecord1451() {
		assertEquals("Mary", customers.get(1450).getFirstName());
	}

	@Test
	@DisplayName("Record 1451: LastName is Roya")
	void LastNameOfRecord1451() {
		assertEquals("Roya", customers.get(1450).getLastName());
	}

	@Test
	@DisplayName("Record 1451: Company is Driscoll, Timothy C")
	void CompanyOfRecord1451() {
		assertEquals("Driscoll, Timothy C", customers.get(1450).getCompany());
	}

	@Test
	@DisplayName("Record 1451: Address is 882 Mahler Rd")
	void AddressOfRecord1451() {
		assertEquals("882 Mahler Rd", customers.get(1450).getAddress());
	}

	@Test
	@DisplayName("Record 1451: City is Burlingame")
	void CityOfRecord1451() {
		assertEquals("Burlingame", customers.get(1450).getCity());
	}

	@Test
	@DisplayName("Record 1451: County is San Mateo")
	void CountyOfRecord1451() {
		assertEquals("San Mateo", customers.get(1450).getCounty());
	}

	@Test
	@DisplayName("Record 1451: State is CA")
	void StateOfRecord1451() {
		assertEquals("CA", customers.get(1450).getState());
	}

	@Test
	@DisplayName("Record 1451: ZIP is 94010")
	void ZIPOfRecord1451() {
		assertEquals("94010", customers.get(1450).getZIP());
	}

	@Test
	@DisplayName("Record 1451: Phone is 650-697-4995")
	void PhoneOfRecord1451() {
		assertEquals("650-697-4995", customers.get(1450).getPhone());
	}

	@Test
	@DisplayName("Record 1451: Fax is 650-697-0966")
	void FaxOfRecord1451() {
		assertEquals("650-697-0966", customers.get(1450).getFax());
	}

	@Test
	@DisplayName("Record 1451: Email is mary@roya.com")
	void EmailOfRecord1451() {
		assertEquals("mary@roya.com", customers.get(1450).getEmail());
	}

	@Test
	@DisplayName("Record 1451: Web is http://www.maryroya.com")
	void WebOfRecord1451() {
		assertEquals("http://www.maryroya.com", customers.get(1450).getWeb());
	}
}
