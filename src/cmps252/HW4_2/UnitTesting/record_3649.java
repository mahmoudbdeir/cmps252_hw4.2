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

@Tag("3")
class Record_3649 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3649: FirstName is Keri")
	void FirstNameOfRecord3649() {
		assertEquals("Keri", customers.get(3648).getFirstName());
	}

	@Test
	@DisplayName("Record 3649: LastName is Lavelli")
	void LastNameOfRecord3649() {
		assertEquals("Lavelli", customers.get(3648).getLastName());
	}

	@Test
	@DisplayName("Record 3649: Company is Athletic Supply Co")
	void CompanyOfRecord3649() {
		assertEquals("Athletic Supply Co", customers.get(3648).getCompany());
	}

	@Test
	@DisplayName("Record 3649: Address is 3300 N Central Ave")
	void AddressOfRecord3649() {
		assertEquals("3300 N Central Ave", customers.get(3648).getAddress());
	}

	@Test
	@DisplayName("Record 3649: City is Phoenix")
	void CityOfRecord3649() {
		assertEquals("Phoenix", customers.get(3648).getCity());
	}

	@Test
	@DisplayName("Record 3649: County is Maricopa")
	void CountyOfRecord3649() {
		assertEquals("Maricopa", customers.get(3648).getCounty());
	}

	@Test
	@DisplayName("Record 3649: State is AZ")
	void StateOfRecord3649() {
		assertEquals("AZ", customers.get(3648).getState());
	}

	@Test
	@DisplayName("Record 3649: ZIP is 85012")
	void ZIPOfRecord3649() {
		assertEquals("85012", customers.get(3648).getZIP());
	}

	@Test
	@DisplayName("Record 3649: Phone is 602-272-6016")
	void PhoneOfRecord3649() {
		assertEquals("602-272-6016", customers.get(3648).getPhone());
	}

	@Test
	@DisplayName("Record 3649: Fax is 602-272-6531")
	void FaxOfRecord3649() {
		assertEquals("602-272-6531", customers.get(3648).getFax());
	}

	@Test
	@DisplayName("Record 3649: Email is keri@lavelli.com")
	void EmailOfRecord3649() {
		assertEquals("keri@lavelli.com", customers.get(3648).getEmail());
	}

	@Test
	@DisplayName("Record 3649: Web is http://www.kerilavelli.com")
	void WebOfRecord3649() {
		assertEquals("http://www.kerilavelli.com", customers.get(3648).getWeb());
	}
}
