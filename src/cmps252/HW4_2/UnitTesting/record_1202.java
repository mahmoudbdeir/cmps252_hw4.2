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
class Record_1202 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1202: FirstName is Christoper")
	void FirstNameOfRecord1202() {
		assertEquals("Christoper", customers.get(1201).getFirstName());
	}

	@Test
	@DisplayName("Record 1202: LastName is Kluemper")
	void LastNameOfRecord1202() {
		assertEquals("Kluemper", customers.get(1201).getLastName());
	}

	@Test
	@DisplayName("Record 1202: Company is Aetna Bearing Co")
	void CompanyOfRecord1202() {
		assertEquals("Aetna Bearing Co", customers.get(1201).getCompany());
	}

	@Test
	@DisplayName("Record 1202: Address is 25 Sutton Pl S")
	void AddressOfRecord1202() {
		assertEquals("25 Sutton Pl S", customers.get(1201).getAddress());
	}

	@Test
	@DisplayName("Record 1202: City is New York")
	void CityOfRecord1202() {
		assertEquals("New York", customers.get(1201).getCity());
	}

	@Test
	@DisplayName("Record 1202: County is New York")
	void CountyOfRecord1202() {
		assertEquals("New York", customers.get(1201).getCounty());
	}

	@Test
	@DisplayName("Record 1202: State is NY")
	void StateOfRecord1202() {
		assertEquals("NY", customers.get(1201).getState());
	}

	@Test
	@DisplayName("Record 1202: ZIP is 10022")
	void ZIPOfRecord1202() {
		assertEquals("10022", customers.get(1201).getZIP());
	}

	@Test
	@DisplayName("Record 1202: Phone is 212-888-4172")
	void PhoneOfRecord1202() {
		assertEquals("212-888-4172", customers.get(1201).getPhone());
	}

	@Test
	@DisplayName("Record 1202: Fax is 212-888-6255")
	void FaxOfRecord1202() {
		assertEquals("212-888-6255", customers.get(1201).getFax());
	}

	@Test
	@DisplayName("Record 1202: Email is christoper@kluemper.com")
	void EmailOfRecord1202() {
		assertEquals("christoper@kluemper.com", customers.get(1201).getEmail());
	}

	@Test
	@DisplayName("Record 1202: Web is http://www.christoperkluemper.com")
	void WebOfRecord1202() {
		assertEquals("http://www.christoperkluemper.com", customers.get(1201).getWeb());
	}
}
