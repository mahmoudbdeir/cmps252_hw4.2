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

@Tag("29")
class Record_2607 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2607: FirstName is Lynwood")
	void FirstNameOfRecord2607() {
		assertEquals("Lynwood", customers.get(2606).getFirstName());
	}

	@Test
	@DisplayName("Record 2607: LastName is Ragain")
	void LastNameOfRecord2607() {
		assertEquals("Ragain", customers.get(2606).getLastName());
	}

	@Test
	@DisplayName("Record 2607: Company is Foster, C Allen Esq")
	void CompanyOfRecord2607() {
		assertEquals("Foster, C Allen Esq", customers.get(2606).getCompany());
	}

	@Test
	@DisplayName("Record 2607: Address is 9025 N 7th Ave")
	void AddressOfRecord2607() {
		assertEquals("9025 N 7th Ave", customers.get(2606).getAddress());
	}

	@Test
	@DisplayName("Record 2607: City is Phoenix")
	void CityOfRecord2607() {
		assertEquals("Phoenix", customers.get(2606).getCity());
	}

	@Test
	@DisplayName("Record 2607: County is Maricopa")
	void CountyOfRecord2607() {
		assertEquals("Maricopa", customers.get(2606).getCounty());
	}

	@Test
	@DisplayName("Record 2607: State is AZ")
	void StateOfRecord2607() {
		assertEquals("AZ", customers.get(2606).getState());
	}

	@Test
	@DisplayName("Record 2607: ZIP is 85021")
	void ZIPOfRecord2607() {
		assertEquals("85021", customers.get(2606).getZIP());
	}

	@Test
	@DisplayName("Record 2607: Phone is 602-870-4641")
	void PhoneOfRecord2607() {
		assertEquals("602-870-4641", customers.get(2606).getPhone());
	}

	@Test
	@DisplayName("Record 2607: Fax is 602-870-9235")
	void FaxOfRecord2607() {
		assertEquals("602-870-9235", customers.get(2606).getFax());
	}

	@Test
	@DisplayName("Record 2607: Email is lynwood@ragain.com")
	void EmailOfRecord2607() {
		assertEquals("lynwood@ragain.com", customers.get(2606).getEmail());
	}

	@Test
	@DisplayName("Record 2607: Web is http://www.lynwoodragain.com")
	void WebOfRecord2607() {
		assertEquals("http://www.lynwoodragain.com", customers.get(2606).getWeb());
	}
}
