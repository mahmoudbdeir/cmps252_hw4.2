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

@Tag("24")
class Record_1590 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1590: FirstName is Susana")
	void FirstNameOfRecord1590() {
		assertEquals("Susana", customers.get(1589).getFirstName());
	}

	@Test
	@DisplayName("Record 1590: LastName is Chhabra")
	void LastNameOfRecord1590() {
		assertEquals("Chhabra", customers.get(1589).getLastName());
	}

	@Test
	@DisplayName("Record 1590: Company is Perry Hall Quick Copy")
	void CompanyOfRecord1590() {
		assertEquals("Perry Hall Quick Copy", customers.get(1589).getCompany());
	}

	@Test
	@DisplayName("Record 1590: Address is 1818 N Water St")
	void AddressOfRecord1590() {
		assertEquals("1818 N Water St", customers.get(1589).getAddress());
	}

	@Test
	@DisplayName("Record 1590: City is Milwaukee")
	void CityOfRecord1590() {
		assertEquals("Milwaukee", customers.get(1589).getCity());
	}

	@Test
	@DisplayName("Record 1590: County is Milwaukee")
	void CountyOfRecord1590() {
		assertEquals("Milwaukee", customers.get(1589).getCounty());
	}

	@Test
	@DisplayName("Record 1590: State is WI")
	void StateOfRecord1590() {
		assertEquals("WI", customers.get(1589).getState());
	}

	@Test
	@DisplayName("Record 1590: ZIP is 53202")
	void ZIPOfRecord1590() {
		assertEquals("53202", customers.get(1589).getZIP());
	}

	@Test
	@DisplayName("Record 1590: Phone is 414-271-0929")
	void PhoneOfRecord1590() {
		assertEquals("414-271-0929", customers.get(1589).getPhone());
	}

	@Test
	@DisplayName("Record 1590: Fax is 414-271-3437")
	void FaxOfRecord1590() {
		assertEquals("414-271-3437", customers.get(1589).getFax());
	}

	@Test
	@DisplayName("Record 1590: Email is susana@chhabra.com")
	void EmailOfRecord1590() {
		assertEquals("susana@chhabra.com", customers.get(1589).getEmail());
	}

	@Test
	@DisplayName("Record 1590: Web is http://www.susanachhabra.com")
	void WebOfRecord1590() {
		assertEquals("http://www.susanachhabra.com", customers.get(1589).getWeb());
	}
}
