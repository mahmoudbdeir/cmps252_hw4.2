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
class Record_4680 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4680: FirstName is Chad")
	void FirstNameOfRecord4680() {
		assertEquals("Chad", customers.get(4679).getFirstName());
	}

	@Test
	@DisplayName("Record 4680: LastName is Bartkowski")
	void LastNameOfRecord4680() {
		assertEquals("Bartkowski", customers.get(4679).getLastName());
	}

	@Test
	@DisplayName("Record 4680: Company is Mc Manus, Francis J")
	void CompanyOfRecord4680() {
		assertEquals("Mc Manus, Francis J", customers.get(4679).getCompany());
	}

	@Test
	@DisplayName("Record 4680: Address is 460 Cambridge Ave")
	void AddressOfRecord4680() {
		assertEquals("460 Cambridge Ave", customers.get(4679).getAddress());
	}

	@Test
	@DisplayName("Record 4680: City is Palo Alto")
	void CityOfRecord4680() {
		assertEquals("Palo Alto", customers.get(4679).getCity());
	}

	@Test
	@DisplayName("Record 4680: County is Santa Clara")
	void CountyOfRecord4680() {
		assertEquals("Santa Clara", customers.get(4679).getCounty());
	}

	@Test
	@DisplayName("Record 4680: State is CA")
	void StateOfRecord4680() {
		assertEquals("CA", customers.get(4679).getState());
	}

	@Test
	@DisplayName("Record 4680: ZIP is 94306")
	void ZIPOfRecord4680() {
		assertEquals("94306", customers.get(4679).getZIP());
	}

	@Test
	@DisplayName("Record 4680: Phone is 650-326-0949")
	void PhoneOfRecord4680() {
		assertEquals("650-326-0949", customers.get(4679).getPhone());
	}

	@Test
	@DisplayName("Record 4680: Fax is 650-326-0896")
	void FaxOfRecord4680() {
		assertEquals("650-326-0896", customers.get(4679).getFax());
	}

	@Test
	@DisplayName("Record 4680: Email is chad@bartkowski.com")
	void EmailOfRecord4680() {
		assertEquals("chad@bartkowski.com", customers.get(4679).getEmail());
	}

	@Test
	@DisplayName("Record 4680: Web is http://www.chadbartkowski.com")
	void WebOfRecord4680() {
		assertEquals("http://www.chadbartkowski.com", customers.get(4679).getWeb());
	}
}
