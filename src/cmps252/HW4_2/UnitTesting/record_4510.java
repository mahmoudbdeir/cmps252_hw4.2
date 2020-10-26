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

@Tag("21")
class Record_4510 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4510: FirstName is Tonia")
	void FirstNameOfRecord4510() {
		assertEquals("Tonia", customers.get(4509).getFirstName());
	}

	@Test
	@DisplayName("Record 4510: LastName is Bazydlo")
	void LastNameOfRecord4510() {
		assertEquals("Bazydlo", customers.get(4509).getLastName());
	}

	@Test
	@DisplayName("Record 4510: Company is Clarion Hotel & Conference Ctr")
	void CompanyOfRecord4510() {
		assertEquals("Clarion Hotel & Conference Ctr", customers.get(4509).getCompany());
	}

	@Test
	@DisplayName("Record 4510: Address is 7935 Sw Nyberg Rd")
	void AddressOfRecord4510() {
		assertEquals("7935 Sw Nyberg Rd", customers.get(4509).getAddress());
	}

	@Test
	@DisplayName("Record 4510: City is Tualatin")
	void CityOfRecord4510() {
		assertEquals("Tualatin", customers.get(4509).getCity());
	}

	@Test
	@DisplayName("Record 4510: County is Washington")
	void CountyOfRecord4510() {
		assertEquals("Washington", customers.get(4509).getCounty());
	}

	@Test
	@DisplayName("Record 4510: State is OR")
	void StateOfRecord4510() {
		assertEquals("OR", customers.get(4509).getState());
	}

	@Test
	@DisplayName("Record 4510: ZIP is 97062")
	void ZIPOfRecord4510() {
		assertEquals("97062", customers.get(4509).getZIP());
	}

	@Test
	@DisplayName("Record 4510: Phone is 503-692-9030")
	void PhoneOfRecord4510() {
		assertEquals("503-692-9030", customers.get(4509).getPhone());
	}

	@Test
	@DisplayName("Record 4510: Fax is 503-692-3029")
	void FaxOfRecord4510() {
		assertEquals("503-692-3029", customers.get(4509).getFax());
	}

	@Test
	@DisplayName("Record 4510: Email is tonia@bazydlo.com")
	void EmailOfRecord4510() {
		assertEquals("tonia@bazydlo.com", customers.get(4509).getEmail());
	}

	@Test
	@DisplayName("Record 4510: Web is http://www.toniabazydlo.com")
	void WebOfRecord4510() {
		assertEquals("http://www.toniabazydlo.com", customers.get(4509).getWeb());
	}
}
