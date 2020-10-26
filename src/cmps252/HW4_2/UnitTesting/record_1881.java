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

@Tag("4")
class Record_1881 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1881: FirstName is Bernardo")
	void FirstNameOfRecord1881() {
		assertEquals("Bernardo", customers.get(1880).getFirstName());
	}

	@Test
	@DisplayName("Record 1881: LastName is Grilli")
	void LastNameOfRecord1881() {
		assertEquals("Grilli", customers.get(1880).getLastName());
	}

	@Test
	@DisplayName("Record 1881: Company is Brown, David W Esq")
	void CompanyOfRecord1881() {
		assertEquals("Brown, David W Esq", customers.get(1880).getCompany());
	}

	@Test
	@DisplayName("Record 1881: Address is 10 Essex St")
	void AddressOfRecord1881() {
		assertEquals("10 Essex St", customers.get(1880).getAddress());
	}

	@Test
	@DisplayName("Record 1881: City is Paterson")
	void CityOfRecord1881() {
		assertEquals("Paterson", customers.get(1880).getCity());
	}

	@Test
	@DisplayName("Record 1881: County is Passaic")
	void CountyOfRecord1881() {
		assertEquals("Passaic", customers.get(1880).getCounty());
	}

	@Test
	@DisplayName("Record 1881: State is NJ")
	void StateOfRecord1881() {
		assertEquals("NJ", customers.get(1880).getState());
	}

	@Test
	@DisplayName("Record 1881: ZIP is 7501")
	void ZIPOfRecord1881() {
		assertEquals("7501", customers.get(1880).getZIP());
	}

	@Test
	@DisplayName("Record 1881: Phone is 973-684-9957")
	void PhoneOfRecord1881() {
		assertEquals("973-684-9957", customers.get(1880).getPhone());
	}

	@Test
	@DisplayName("Record 1881: Fax is 973-684-7068")
	void FaxOfRecord1881() {
		assertEquals("973-684-7068", customers.get(1880).getFax());
	}

	@Test
	@DisplayName("Record 1881: Email is bernardo@grilli.com")
	void EmailOfRecord1881() {
		assertEquals("bernardo@grilli.com", customers.get(1880).getEmail());
	}

	@Test
	@DisplayName("Record 1881: Web is http://www.bernardogrilli.com")
	void WebOfRecord1881() {
		assertEquals("http://www.bernardogrilli.com", customers.get(1880).getWeb());
	}
}
