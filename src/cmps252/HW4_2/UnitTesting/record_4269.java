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

@Tag("13")
class Record_4269 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4269: FirstName is Jeremiah")
	void FirstNameOfRecord4269() {
		assertEquals("Jeremiah", customers.get(4268).getFirstName());
	}

	@Test
	@DisplayName("Record 4269: LastName is Holey")
	void LastNameOfRecord4269() {
		assertEquals("Holey", customers.get(4268).getLastName());
	}

	@Test
	@DisplayName("Record 4269: Company is Livingston & Markle")
	void CompanyOfRecord4269() {
		assertEquals("Livingston & Markle", customers.get(4268).getCompany());
	}

	@Test
	@DisplayName("Record 4269: Address is 100 E Wisconsin Ave")
	void AddressOfRecord4269() {
		assertEquals("100 E Wisconsin Ave", customers.get(4268).getAddress());
	}

	@Test
	@DisplayName("Record 4269: City is Milwaukee")
	void CityOfRecord4269() {
		assertEquals("Milwaukee", customers.get(4268).getCity());
	}

	@Test
	@DisplayName("Record 4269: County is Milwaukee")
	void CountyOfRecord4269() {
		assertEquals("Milwaukee", customers.get(4268).getCounty());
	}

	@Test
	@DisplayName("Record 4269: State is WI")
	void StateOfRecord4269() {
		assertEquals("WI", customers.get(4268).getState());
	}

	@Test
	@DisplayName("Record 4269: ZIP is 53202")
	void ZIPOfRecord4269() {
		assertEquals("53202", customers.get(4268).getZIP());
	}

	@Test
	@DisplayName("Record 4269: Phone is 414-271-6002")
	void PhoneOfRecord4269() {
		assertEquals("414-271-6002", customers.get(4268).getPhone());
	}

	@Test
	@DisplayName("Record 4269: Fax is 414-271-5953")
	void FaxOfRecord4269() {
		assertEquals("414-271-5953", customers.get(4268).getFax());
	}

	@Test
	@DisplayName("Record 4269: Email is jeremiah@holey.com")
	void EmailOfRecord4269() {
		assertEquals("jeremiah@holey.com", customers.get(4268).getEmail());
	}

	@Test
	@DisplayName("Record 4269: Web is http://www.jeremiahholey.com")
	void WebOfRecord4269() {
		assertEquals("http://www.jeremiahholey.com", customers.get(4268).getWeb());
	}
}
