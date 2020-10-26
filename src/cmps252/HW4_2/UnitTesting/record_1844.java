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

@Tag("36")
class Record_1844 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1844: FirstName is Kirby")
	void FirstNameOfRecord1844() {
		assertEquals("Kirby", customers.get(1843).getFirstName());
	}

	@Test
	@DisplayName("Record 1844: LastName is Styer")
	void LastNameOfRecord1844() {
		assertEquals("Styer", customers.get(1843).getLastName());
	}

	@Test
	@DisplayName("Record 1844: Company is Frensilli, Beth A Esq")
	void CompanyOfRecord1844() {
		assertEquals("Frensilli, Beth A Esq", customers.get(1843).getCompany());
	}

	@Test
	@DisplayName("Record 1844: Address is 125 Saint Nicholas Ave")
	void AddressOfRecord1844() {
		assertEquals("125 Saint Nicholas Ave", customers.get(1843).getAddress());
	}

	@Test
	@DisplayName("Record 1844: City is South Plainfield")
	void CityOfRecord1844() {
		assertEquals("South Plainfield", customers.get(1843).getCity());
	}

	@Test
	@DisplayName("Record 1844: County is Middlesex")
	void CountyOfRecord1844() {
		assertEquals("Middlesex", customers.get(1843).getCounty());
	}

	@Test
	@DisplayName("Record 1844: State is NJ")
	void StateOfRecord1844() {
		assertEquals("NJ", customers.get(1843).getState());
	}

	@Test
	@DisplayName("Record 1844: ZIP is 7080")
	void ZIPOfRecord1844() {
		assertEquals("7080", customers.get(1843).getZIP());
	}

	@Test
	@DisplayName("Record 1844: Phone is 908-754-6187")
	void PhoneOfRecord1844() {
		assertEquals("908-754-6187", customers.get(1843).getPhone());
	}

	@Test
	@DisplayName("Record 1844: Fax is 908-754-9234")
	void FaxOfRecord1844() {
		assertEquals("908-754-9234", customers.get(1843).getFax());
	}

	@Test
	@DisplayName("Record 1844: Email is kirby@styer.com")
	void EmailOfRecord1844() {
		assertEquals("kirby@styer.com", customers.get(1843).getEmail());
	}

	@Test
	@DisplayName("Record 1844: Web is http://www.kirbystyer.com")
	void WebOfRecord1844() {
		assertEquals("http://www.kirbystyer.com", customers.get(1843).getWeb());
	}
}
