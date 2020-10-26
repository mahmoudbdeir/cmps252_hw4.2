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

@Tag("22")
class Record_1717 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1717: FirstName is Darron")
	void FirstNameOfRecord1717() {
		assertEquals("Darron", customers.get(1716).getFirstName());
	}

	@Test
	@DisplayName("Record 1717: LastName is Lemmert")
	void LastNameOfRecord1717() {
		assertEquals("Lemmert", customers.get(1716).getLastName());
	}

	@Test
	@DisplayName("Record 1717: Company is Fuel South")
	void CompanyOfRecord1717() {
		assertEquals("Fuel South", customers.get(1716).getCompany());
	}

	@Test
	@DisplayName("Record 1717: Address is 1341 W Robinhood Dr")
	void AddressOfRecord1717() {
		assertEquals("1341 W Robinhood Dr", customers.get(1716).getAddress());
	}

	@Test
	@DisplayName("Record 1717: City is Stockton")
	void CityOfRecord1717() {
		assertEquals("Stockton", customers.get(1716).getCity());
	}

	@Test
	@DisplayName("Record 1717: County is San Joaquin")
	void CountyOfRecord1717() {
		assertEquals("San Joaquin", customers.get(1716).getCounty());
	}

	@Test
	@DisplayName("Record 1717: State is CA")
	void StateOfRecord1717() {
		assertEquals("CA", customers.get(1716).getState());
	}

	@Test
	@DisplayName("Record 1717: ZIP is 95207")
	void ZIPOfRecord1717() {
		assertEquals("95207", customers.get(1716).getZIP());
	}

	@Test
	@DisplayName("Record 1717: Phone is 209-473-7738")
	void PhoneOfRecord1717() {
		assertEquals("209-473-7738", customers.get(1716).getPhone());
	}

	@Test
	@DisplayName("Record 1717: Fax is 209-473-0056")
	void FaxOfRecord1717() {
		assertEquals("209-473-0056", customers.get(1716).getFax());
	}

	@Test
	@DisplayName("Record 1717: Email is darron@lemmert.com")
	void EmailOfRecord1717() {
		assertEquals("darron@lemmert.com", customers.get(1716).getEmail());
	}

	@Test
	@DisplayName("Record 1717: Web is http://www.darronlemmert.com")
	void WebOfRecord1717() {
		assertEquals("http://www.darronlemmert.com", customers.get(1716).getWeb());
	}
}
