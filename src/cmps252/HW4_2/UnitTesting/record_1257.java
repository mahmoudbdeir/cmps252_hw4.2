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
class Record_1257 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1257: FirstName is Trent")
	void FirstNameOfRecord1257() {
		assertEquals("Trent", customers.get(1256).getFirstName());
	}

	@Test
	@DisplayName("Record 1257: LastName is Mailman")
	void LastNameOfRecord1257() {
		assertEquals("Mailman", customers.get(1256).getLastName());
	}

	@Test
	@DisplayName("Record 1257: Company is Pauls Candy Co Inc")
	void CompanyOfRecord1257() {
		assertEquals("Pauls Candy Co Inc", customers.get(1256).getCompany());
	}

	@Test
	@DisplayName("Record 1257: Address is 5920 Riley St  #-3")
	void AddressOfRecord1257() {
		assertEquals("5920 Riley St  #-3", customers.get(1256).getAddress());
	}

	@Test
	@DisplayName("Record 1257: City is San Diego")
	void CityOfRecord1257() {
		assertEquals("San Diego", customers.get(1256).getCity());
	}

	@Test
	@DisplayName("Record 1257: County is San Diego")
	void CountyOfRecord1257() {
		assertEquals("San Diego", customers.get(1256).getCounty());
	}

	@Test
	@DisplayName("Record 1257: State is CA")
	void StateOfRecord1257() {
		assertEquals("CA", customers.get(1256).getState());
	}

	@Test
	@DisplayName("Record 1257: ZIP is 92110")
	void ZIPOfRecord1257() {
		assertEquals("92110", customers.get(1256).getZIP());
	}

	@Test
	@DisplayName("Record 1257: Phone is 858-296-7488")
	void PhoneOfRecord1257() {
		assertEquals("858-296-7488", customers.get(1256).getPhone());
	}

	@Test
	@DisplayName("Record 1257: Fax is 858-296-6114")
	void FaxOfRecord1257() {
		assertEquals("858-296-6114", customers.get(1256).getFax());
	}

	@Test
	@DisplayName("Record 1257: Email is trent@mailman.com")
	void EmailOfRecord1257() {
		assertEquals("trent@mailman.com", customers.get(1256).getEmail());
	}

	@Test
	@DisplayName("Record 1257: Web is http://www.trentmailman.com")
	void WebOfRecord1257() {
		assertEquals("http://www.trentmailman.com", customers.get(1256).getWeb());
	}
}
