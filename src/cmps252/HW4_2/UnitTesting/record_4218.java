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

@Tag("49")
class Record_4218 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4218: FirstName is Alton")
	void FirstNameOfRecord4218() {
		assertEquals("Alton", customers.get(4217).getFirstName());
	}

	@Test
	@DisplayName("Record 4218: LastName is Solhjem")
	void LastNameOfRecord4218() {
		assertEquals("Solhjem", customers.get(4217).getLastName());
	}

	@Test
	@DisplayName("Record 4218: Company is Miles Nissan")
	void CompanyOfRecord4218() {
		assertEquals("Miles Nissan", customers.get(4217).getCompany());
	}

	@Test
	@DisplayName("Record 4218: Address is 2625 S 31st St")
	void AddressOfRecord4218() {
		assertEquals("2625 S 31st St", customers.get(4217).getAddress());
	}

	@Test
	@DisplayName("Record 4218: City is Temple")
	void CityOfRecord4218() {
		assertEquals("Temple", customers.get(4217).getCity());
	}

	@Test
	@DisplayName("Record 4218: County is Bell")
	void CountyOfRecord4218() {
		assertEquals("Bell", customers.get(4217).getCounty());
	}

	@Test
	@DisplayName("Record 4218: State is TX")
	void StateOfRecord4218() {
		assertEquals("TX", customers.get(4217).getState());
	}

	@Test
	@DisplayName("Record 4218: ZIP is 76504")
	void ZIPOfRecord4218() {
		assertEquals("76504", customers.get(4217).getZIP());
	}

	@Test
	@DisplayName("Record 4218: Phone is 254-773-4939")
	void PhoneOfRecord4218() {
		assertEquals("254-773-4939", customers.get(4217).getPhone());
	}

	@Test
	@DisplayName("Record 4218: Fax is 254-773-2841")
	void FaxOfRecord4218() {
		assertEquals("254-773-2841", customers.get(4217).getFax());
	}

	@Test
	@DisplayName("Record 4218: Email is alton@solhjem.com")
	void EmailOfRecord4218() {
		assertEquals("alton@solhjem.com", customers.get(4217).getEmail());
	}

	@Test
	@DisplayName("Record 4218: Web is http://www.altonsolhjem.com")
	void WebOfRecord4218() {
		assertEquals("http://www.altonsolhjem.com", customers.get(4217).getWeb());
	}
}
