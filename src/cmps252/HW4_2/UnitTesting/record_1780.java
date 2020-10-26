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

@Tag("44")
class Record_1780 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1780: FirstName is Kristopher")
	void FirstNameOfRecord1780() {
		assertEquals("Kristopher", customers.get(1779).getFirstName());
	}

	@Test
	@DisplayName("Record 1780: LastName is Bain")
	void LastNameOfRecord1780() {
		assertEquals("Bain", customers.get(1779).getLastName());
	}

	@Test
	@DisplayName("Record 1780: Company is Rubinstone, Jeffrey D Esq")
	void CompanyOfRecord1780() {
		assertEquals("Rubinstone, Jeffrey D Esq", customers.get(1779).getCompany());
	}

	@Test
	@DisplayName("Record 1780: Address is 320 Fern St")
	void AddressOfRecord1780() {
		assertEquals("320 Fern St", customers.get(1779).getAddress());
	}

	@Test
	@DisplayName("Record 1780: City is West Palm Beach")
	void CityOfRecord1780() {
		assertEquals("West Palm Beach", customers.get(1779).getCity());
	}

	@Test
	@DisplayName("Record 1780: County is Palm Beach")
	void CountyOfRecord1780() {
		assertEquals("Palm Beach", customers.get(1779).getCounty());
	}

	@Test
	@DisplayName("Record 1780: State is FL")
	void StateOfRecord1780() {
		assertEquals("FL", customers.get(1779).getState());
	}

	@Test
	@DisplayName("Record 1780: ZIP is 33401")
	void ZIPOfRecord1780() {
		assertEquals("33401", customers.get(1779).getZIP());
	}

	@Test
	@DisplayName("Record 1780: Phone is 561-832-8917")
	void PhoneOfRecord1780() {
		assertEquals("561-832-8917", customers.get(1779).getPhone());
	}

	@Test
	@DisplayName("Record 1780: Fax is 561-832-0209")
	void FaxOfRecord1780() {
		assertEquals("561-832-0209", customers.get(1779).getFax());
	}

	@Test
	@DisplayName("Record 1780: Email is kristopher@bain.com")
	void EmailOfRecord1780() {
		assertEquals("kristopher@bain.com", customers.get(1779).getEmail());
	}

	@Test
	@DisplayName("Record 1780: Web is http://www.kristopherbain.com")
	void WebOfRecord1780() {
		assertEquals("http://www.kristopherbain.com", customers.get(1779).getWeb());
	}
}
