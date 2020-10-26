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
class Record_3188 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3188: FirstName is Ginger")
	void FirstNameOfRecord3188() {
		assertEquals("Ginger", customers.get(3187).getFirstName());
	}

	@Test
	@DisplayName("Record 3188: LastName is Wieck")
	void LastNameOfRecord3188() {
		assertEquals("Wieck", customers.get(3187).getLastName());
	}

	@Test
	@DisplayName("Record 3188: Company is Fairmont Hotel")
	void CompanyOfRecord3188() {
		assertEquals("Fairmont Hotel", customers.get(3187).getCompany());
	}

	@Test
	@DisplayName("Record 3188: Address is 2430 Stanwell Dr")
	void AddressOfRecord3188() {
		assertEquals("2430 Stanwell Dr", customers.get(3187).getAddress());
	}

	@Test
	@DisplayName("Record 3188: City is Concord")
	void CityOfRecord3188() {
		assertEquals("Concord", customers.get(3187).getCity());
	}

	@Test
	@DisplayName("Record 3188: County is Contra Costa")
	void CountyOfRecord3188() {
		assertEquals("Contra Costa", customers.get(3187).getCounty());
	}

	@Test
	@DisplayName("Record 3188: State is CA")
	void StateOfRecord3188() {
		assertEquals("CA", customers.get(3187).getState());
	}

	@Test
	@DisplayName("Record 3188: ZIP is 94520")
	void ZIPOfRecord3188() {
		assertEquals("94520", customers.get(3187).getZIP());
	}

	@Test
	@DisplayName("Record 3188: Phone is 925-827-2421")
	void PhoneOfRecord3188() {
		assertEquals("925-827-2421", customers.get(3187).getPhone());
	}

	@Test
	@DisplayName("Record 3188: Fax is 925-827-5508")
	void FaxOfRecord3188() {
		assertEquals("925-827-5508", customers.get(3187).getFax());
	}

	@Test
	@DisplayName("Record 3188: Email is ginger@wieck.com")
	void EmailOfRecord3188() {
		assertEquals("ginger@wieck.com", customers.get(3187).getEmail());
	}

	@Test
	@DisplayName("Record 3188: Web is http://www.gingerwieck.com")
	void WebOfRecord3188() {
		assertEquals("http://www.gingerwieck.com", customers.get(3187).getWeb());
	}
}
