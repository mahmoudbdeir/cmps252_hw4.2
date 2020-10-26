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

@Tag("48")
class Record_1505 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1505: FirstName is Heath")
	void FirstNameOfRecord1505() {
		assertEquals("Heath", customers.get(1504).getFirstName());
	}

	@Test
	@DisplayName("Record 1505: LastName is Chham")
	void LastNameOfRecord1505() {
		assertEquals("Chham", customers.get(1504).getLastName());
	}

	@Test
	@DisplayName("Record 1505: Company is Bedusek Insurance Agency")
	void CompanyOfRecord1505() {
		assertEquals("Bedusek Insurance Agency", customers.get(1504).getCompany());
	}

	@Test
	@DisplayName("Record 1505: Address is 4501 E Saint Elmo Rd")
	void AddressOfRecord1505() {
		assertEquals("4501 E Saint Elmo Rd", customers.get(1504).getAddress());
	}

	@Test
	@DisplayName("Record 1505: City is Austin")
	void CityOfRecord1505() {
		assertEquals("Austin", customers.get(1504).getCity());
	}

	@Test
	@DisplayName("Record 1505: County is Travis")
	void CountyOfRecord1505() {
		assertEquals("Travis", customers.get(1504).getCounty());
	}

	@Test
	@DisplayName("Record 1505: State is TX")
	void StateOfRecord1505() {
		assertEquals("TX", customers.get(1504).getState());
	}

	@Test
	@DisplayName("Record 1505: ZIP is 78744")
	void ZIPOfRecord1505() {
		assertEquals("78744", customers.get(1504).getZIP());
	}

	@Test
	@DisplayName("Record 1505: Phone is 512-442-5686")
	void PhoneOfRecord1505() {
		assertEquals("512-442-5686", customers.get(1504).getPhone());
	}

	@Test
	@DisplayName("Record 1505: Fax is 512-442-3493")
	void FaxOfRecord1505() {
		assertEquals("512-442-3493", customers.get(1504).getFax());
	}

	@Test
	@DisplayName("Record 1505: Email is heath@chham.com")
	void EmailOfRecord1505() {
		assertEquals("heath@chham.com", customers.get(1504).getEmail());
	}

	@Test
	@DisplayName("Record 1505: Web is http://www.heathchham.com")
	void WebOfRecord1505() {
		assertEquals("http://www.heathchham.com", customers.get(1504).getWeb());
	}
}
