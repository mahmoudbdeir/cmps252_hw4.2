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

@Tag("32")
class Record_4302 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4302: FirstName is Berry")
	void FirstNameOfRecord4302() {
		assertEquals("Berry", customers.get(4301).getFirstName());
	}

	@Test
	@DisplayName("Record 4302: LastName is Jaksch")
	void LastNameOfRecord4302() {
		assertEquals("Jaksch", customers.get(4301).getLastName());
	}

	@Test
	@DisplayName("Record 4302: Company is Brabston, James K Esq")
	void CompanyOfRecord4302() {
		assertEquals("Brabston, James K Esq", customers.get(4301).getCompany());
	}

	@Test
	@DisplayName("Record 4302: Address is 201 N Central Ave")
	void AddressOfRecord4302() {
		assertEquals("201 N Central Ave", customers.get(4301).getAddress());
	}

	@Test
	@DisplayName("Record 4302: City is Phoenix")
	void CityOfRecord4302() {
		assertEquals("Phoenix", customers.get(4301).getCity());
	}

	@Test
	@DisplayName("Record 4302: County is Maricopa")
	void CountyOfRecord4302() {
		assertEquals("Maricopa", customers.get(4301).getCounty());
	}

	@Test
	@DisplayName("Record 4302: State is AZ")
	void StateOfRecord4302() {
		assertEquals("AZ", customers.get(4301).getState());
	}

	@Test
	@DisplayName("Record 4302: ZIP is 85073")
	void ZIPOfRecord4302() {
		assertEquals("85073", customers.get(4301).getZIP());
	}

	@Test
	@DisplayName("Record 4302: Phone is 602-254-7295")
	void PhoneOfRecord4302() {
		assertEquals("602-254-7295", customers.get(4301).getPhone());
	}

	@Test
	@DisplayName("Record 4302: Fax is 602-254-6379")
	void FaxOfRecord4302() {
		assertEquals("602-254-6379", customers.get(4301).getFax());
	}

	@Test
	@DisplayName("Record 4302: Email is berry@jaksch.com")
	void EmailOfRecord4302() {
		assertEquals("berry@jaksch.com", customers.get(4301).getEmail());
	}

	@Test
	@DisplayName("Record 4302: Web is http://www.berryjaksch.com")
	void WebOfRecord4302() {
		assertEquals("http://www.berryjaksch.com", customers.get(4301).getWeb());
	}
}
