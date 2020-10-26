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

@Tag("23")
class Record_707 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 707: FirstName is Kristopher")
	void FirstNameOfRecord707() {
		assertEquals("Kristopher", customers.get(706).getFirstName());
	}

	@Test
	@DisplayName("Record 707: LastName is Guerino")
	void LastNameOfRecord707() {
		assertEquals("Guerino", customers.get(706).getLastName());
	}

	@Test
	@DisplayName("Record 707: Company is Amann, Colin B Esq")
	void CompanyOfRecord707() {
		assertEquals("Amann, Colin B Esq", customers.get(706).getCompany());
	}

	@Test
	@DisplayName("Record 707: Address is 613 W Green Bay St")
	void AddressOfRecord707() {
		assertEquals("613 W Green Bay St", customers.get(706).getAddress());
	}

	@Test
	@DisplayName("Record 707: City is Shawano")
	void CityOfRecord707() {
		assertEquals("Shawano", customers.get(706).getCity());
	}

	@Test
	@DisplayName("Record 707: County is Shawano")
	void CountyOfRecord707() {
		assertEquals("Shawano", customers.get(706).getCounty());
	}

	@Test
	@DisplayName("Record 707: State is WI")
	void StateOfRecord707() {
		assertEquals("WI", customers.get(706).getState());
	}

	@Test
	@DisplayName("Record 707: ZIP is 54166")
	void ZIPOfRecord707() {
		assertEquals("54166", customers.get(706).getZIP());
	}

	@Test
	@DisplayName("Record 707: Phone is 715-526-7160")
	void PhoneOfRecord707() {
		assertEquals("715-526-7160", customers.get(706).getPhone());
	}

	@Test
	@DisplayName("Record 707: Fax is 715-526-9574")
	void FaxOfRecord707() {
		assertEquals("715-526-9574", customers.get(706).getFax());
	}

	@Test
	@DisplayName("Record 707: Email is kristopher@guerino.com")
	void EmailOfRecord707() {
		assertEquals("kristopher@guerino.com", customers.get(706).getEmail());
	}

	@Test
	@DisplayName("Record 707: Web is http://www.kristopherguerino.com")
	void WebOfRecord707() {
		assertEquals("http://www.kristopherguerino.com", customers.get(706).getWeb());
	}
}
