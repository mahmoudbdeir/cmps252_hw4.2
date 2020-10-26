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

@Tag("18")
class Record_1911 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1911: FirstName is Javier")
	void FirstNameOfRecord1911() {
		assertEquals("Javier", customers.get(1910).getFirstName());
	}

	@Test
	@DisplayName("Record 1911: LastName is Suddreth")
	void LastNameOfRecord1911() {
		assertEquals("Suddreth", customers.get(1910).getLastName());
	}

	@Test
	@DisplayName("Record 1911: Company is Mcgovern Collectibles")
	void CompanyOfRecord1911() {
		assertEquals("Mcgovern Collectibles", customers.get(1910).getCompany());
	}

	@Test
	@DisplayName("Record 1911: Address is 111 W 11th St")
	void AddressOfRecord1911() {
		assertEquals("111 W 11th St", customers.get(1910).getAddress());
	}

	@Test
	@DisplayName("Record 1911: City is Erie")
	void CityOfRecord1911() {
		assertEquals("Erie", customers.get(1910).getCity());
	}

	@Test
	@DisplayName("Record 1911: County is Erie")
	void CountyOfRecord1911() {
		assertEquals("Erie", customers.get(1910).getCounty());
	}

	@Test
	@DisplayName("Record 1911: State is PA")
	void StateOfRecord1911() {
		assertEquals("PA", customers.get(1910).getState());
	}

	@Test
	@DisplayName("Record 1911: ZIP is 16501")
	void ZIPOfRecord1911() {
		assertEquals("16501", customers.get(1910).getZIP());
	}

	@Test
	@DisplayName("Record 1911: Phone is 814-456-1921")
	void PhoneOfRecord1911() {
		assertEquals("814-456-1921", customers.get(1910).getPhone());
	}

	@Test
	@DisplayName("Record 1911: Fax is 814-456-1247")
	void FaxOfRecord1911() {
		assertEquals("814-456-1247", customers.get(1910).getFax());
	}

	@Test
	@DisplayName("Record 1911: Email is javier@suddreth.com")
	void EmailOfRecord1911() {
		assertEquals("javier@suddreth.com", customers.get(1910).getEmail());
	}

	@Test
	@DisplayName("Record 1911: Web is http://www.javiersuddreth.com")
	void WebOfRecord1911() {
		assertEquals("http://www.javiersuddreth.com", customers.get(1910).getWeb());
	}
}
