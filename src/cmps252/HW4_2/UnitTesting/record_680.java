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

@Tag("48")
class Record_680 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 680: FirstName is Sylvester")
	void FirstNameOfRecord680() {
		assertEquals("Sylvester", customers.get(679).getFirstName());
	}

	@Test
	@DisplayName("Record 680: LastName is Chinzi")
	void LastNameOfRecord680() {
		assertEquals("Chinzi", customers.get(679).getLastName());
	}

	@Test
	@DisplayName("Record 680: Company is Hall, W Craig Esq")
	void CompanyOfRecord680() {
		assertEquals("Hall, W Craig Esq", customers.get(679).getCompany());
	}

	@Test
	@DisplayName("Record 680: Address is 4900 Upshur St")
	void AddressOfRecord680() {
		assertEquals("4900 Upshur St", customers.get(679).getAddress());
	}

	@Test
	@DisplayName("Record 680: City is Bladensburg")
	void CityOfRecord680() {
		assertEquals("Bladensburg", customers.get(679).getCity());
	}

	@Test
	@DisplayName("Record 680: County is Prince Georges")
	void CountyOfRecord680() {
		assertEquals("Prince Georges", customers.get(679).getCounty());
	}

	@Test
	@DisplayName("Record 680: State is MD")
	void StateOfRecord680() {
		assertEquals("MD", customers.get(679).getState());
	}

	@Test
	@DisplayName("Record 680: ZIP is 20710")
	void ZIPOfRecord680() {
		assertEquals("20710", customers.get(679).getZIP());
	}

	@Test
	@DisplayName("Record 680: Phone is 301-779-9221")
	void PhoneOfRecord680() {
		assertEquals("301-779-9221", customers.get(679).getPhone());
	}

	@Test
	@DisplayName("Record 680: Fax is 301-779-9389")
	void FaxOfRecord680() {
		assertEquals("301-779-9389", customers.get(679).getFax());
	}

	@Test
	@DisplayName("Record 680: Email is sylvester@chinzi.com")
	void EmailOfRecord680() {
		assertEquals("sylvester@chinzi.com", customers.get(679).getEmail());
	}

	@Test
	@DisplayName("Record 680: Web is http://www.sylvesterchinzi.com")
	void WebOfRecord680() {
		assertEquals("http://www.sylvesterchinzi.com", customers.get(679).getWeb());
	}
}
