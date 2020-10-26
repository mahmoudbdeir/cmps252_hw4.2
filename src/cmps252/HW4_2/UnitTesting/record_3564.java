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
class Record_3564 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3564: FirstName is Erma")
	void FirstNameOfRecord3564() {
		assertEquals("Erma", customers.get(3563).getFirstName());
	}

	@Test
	@DisplayName("Record 3564: LastName is Daubert")
	void LastNameOfRecord3564() {
		assertEquals("Daubert", customers.get(3563).getLastName());
	}

	@Test
	@DisplayName("Record 3564: Company is Delligatti, Anthony Jr")
	void CompanyOfRecord3564() {
		assertEquals("Delligatti, Anthony Jr", customers.get(3563).getCompany());
	}

	@Test
	@DisplayName("Record 3564: Address is 2211 N Prospect Ave")
	void AddressOfRecord3564() {
		assertEquals("2211 N Prospect Ave", customers.get(3563).getAddress());
	}

	@Test
	@DisplayName("Record 3564: City is Milwaukee")
	void CityOfRecord3564() {
		assertEquals("Milwaukee", customers.get(3563).getCity());
	}

	@Test
	@DisplayName("Record 3564: County is Milwaukee")
	void CountyOfRecord3564() {
		assertEquals("Milwaukee", customers.get(3563).getCounty());
	}

	@Test
	@DisplayName("Record 3564: State is WI")
	void StateOfRecord3564() {
		assertEquals("WI", customers.get(3563).getState());
	}

	@Test
	@DisplayName("Record 3564: ZIP is 53202")
	void ZIPOfRecord3564() {
		assertEquals("53202", customers.get(3563).getZIP());
	}

	@Test
	@DisplayName("Record 3564: Phone is 414-271-8908")
	void PhoneOfRecord3564() {
		assertEquals("414-271-8908", customers.get(3563).getPhone());
	}

	@Test
	@DisplayName("Record 3564: Fax is 414-271-2235")
	void FaxOfRecord3564() {
		assertEquals("414-271-2235", customers.get(3563).getFax());
	}

	@Test
	@DisplayName("Record 3564: Email is erma@daubert.com")
	void EmailOfRecord3564() {
		assertEquals("erma@daubert.com", customers.get(3563).getEmail());
	}

	@Test
	@DisplayName("Record 3564: Web is http://www.ermadaubert.com")
	void WebOfRecord3564() {
		assertEquals("http://www.ermadaubert.com", customers.get(3563).getWeb());
	}
}
