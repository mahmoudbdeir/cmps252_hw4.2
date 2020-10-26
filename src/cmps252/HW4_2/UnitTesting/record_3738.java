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

@Tag("39")
class Record_3738 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3738: FirstName is Ruth")
	void FirstNameOfRecord3738() {
		assertEquals("Ruth", customers.get(3737).getFirstName());
	}

	@Test
	@DisplayName("Record 3738: LastName is Vari")
	void LastNameOfRecord3738() {
		assertEquals("Vari", customers.get(3737).getLastName());
	}

	@Test
	@DisplayName("Record 3738: Company is Wildwood Inn")
	void CompanyOfRecord3738() {
		assertEquals("Wildwood Inn", customers.get(3737).getCompany());
	}

	@Test
	@DisplayName("Record 3738: Address is 1585 N 4th St")
	void AddressOfRecord3738() {
		assertEquals("1585 N 4th St", customers.get(3737).getAddress());
	}

	@Test
	@DisplayName("Record 3738: City is San Jose")
	void CityOfRecord3738() {
		assertEquals("San Jose", customers.get(3737).getCity());
	}

	@Test
	@DisplayName("Record 3738: County is Santa Clara")
	void CountyOfRecord3738() {
		assertEquals("Santa Clara", customers.get(3737).getCounty());
	}

	@Test
	@DisplayName("Record 3738: State is CA")
	void StateOfRecord3738() {
		assertEquals("CA", customers.get(3737).getState());
	}

	@Test
	@DisplayName("Record 3738: ZIP is 95112")
	void ZIPOfRecord3738() {
		assertEquals("95112", customers.get(3737).getZIP());
	}

	@Test
	@DisplayName("Record 3738: Phone is 408-453-6341")
	void PhoneOfRecord3738() {
		assertEquals("408-453-6341", customers.get(3737).getPhone());
	}

	@Test
	@DisplayName("Record 3738: Fax is 408-453-1942")
	void FaxOfRecord3738() {
		assertEquals("408-453-1942", customers.get(3737).getFax());
	}

	@Test
	@DisplayName("Record 3738: Email is ruth@vari.com")
	void EmailOfRecord3738() {
		assertEquals("ruth@vari.com", customers.get(3737).getEmail());
	}

	@Test
	@DisplayName("Record 3738: Web is http://www.ruthvari.com")
	void WebOfRecord3738() {
		assertEquals("http://www.ruthvari.com", customers.get(3737).getWeb());
	}
}
