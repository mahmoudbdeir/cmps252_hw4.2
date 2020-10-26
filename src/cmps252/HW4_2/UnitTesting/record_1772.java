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

@Tag("41")
class Record_1772 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1772: FirstName is Blanche")
	void FirstNameOfRecord1772() {
		assertEquals("Blanche", customers.get(1771).getFirstName());
	}

	@Test
	@DisplayName("Record 1772: LastName is Goralski")
	void LastNameOfRecord1772() {
		assertEquals("Goralski", customers.get(1771).getLastName());
	}

	@Test
	@DisplayName("Record 1772: Company is Triangle Stamping & Embossing")
	void CompanyOfRecord1772() {
		assertEquals("Triangle Stamping & Embossing", customers.get(1771).getCompany());
	}

	@Test
	@DisplayName("Record 1772: Address is 905 S 8th St")
	void AddressOfRecord1772() {
		assertEquals("905 S 8th St", customers.get(1771).getAddress());
	}

	@Test
	@DisplayName("Record 1772: City is Sheboygan")
	void CityOfRecord1772() {
		assertEquals("Sheboygan", customers.get(1771).getCity());
	}

	@Test
	@DisplayName("Record 1772: County is Sheboygan")
	void CountyOfRecord1772() {
		assertEquals("Sheboygan", customers.get(1771).getCounty());
	}

	@Test
	@DisplayName("Record 1772: State is WI")
	void StateOfRecord1772() {
		assertEquals("WI", customers.get(1771).getState());
	}

	@Test
	@DisplayName("Record 1772: ZIP is 53081")
	void ZIPOfRecord1772() {
		assertEquals("53081", customers.get(1771).getZIP());
	}

	@Test
	@DisplayName("Record 1772: Phone is 920-452-6806")
	void PhoneOfRecord1772() {
		assertEquals("920-452-6806", customers.get(1771).getPhone());
	}

	@Test
	@DisplayName("Record 1772: Fax is 920-452-6752")
	void FaxOfRecord1772() {
		assertEquals("920-452-6752", customers.get(1771).getFax());
	}

	@Test
	@DisplayName("Record 1772: Email is blanche@goralski.com")
	void EmailOfRecord1772() {
		assertEquals("blanche@goralski.com", customers.get(1771).getEmail());
	}

	@Test
	@DisplayName("Record 1772: Web is http://www.blanchegoralski.com")
	void WebOfRecord1772() {
		assertEquals("http://www.blanchegoralski.com", customers.get(1771).getWeb());
	}
}
