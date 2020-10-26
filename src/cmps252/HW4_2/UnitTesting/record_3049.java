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
class Record_3049 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3049: FirstName is Coy")
	void FirstNameOfRecord3049() {
		assertEquals("Coy", customers.get(3048).getFirstName());
	}

	@Test
	@DisplayName("Record 3049: LastName is Klyman")
	void LastNameOfRecord3049() {
		assertEquals("Klyman", customers.get(3048).getLastName());
	}

	@Test
	@DisplayName("Record 3049: Company is Metrosonics Inc Factory Rep")
	void CompanyOfRecord3049() {
		assertEquals("Metrosonics Inc Factory Rep", customers.get(3048).getCompany());
	}

	@Test
	@DisplayName("Record 3049: Address is 1402 E Rancier Ave  #-b1")
	void AddressOfRecord3049() {
		assertEquals("1402 E Rancier Ave  #-b1", customers.get(3048).getAddress());
	}

	@Test
	@DisplayName("Record 3049: City is Killeen")
	void CityOfRecord3049() {
		assertEquals("Killeen", customers.get(3048).getCity());
	}

	@Test
	@DisplayName("Record 3049: County is Bell")
	void CountyOfRecord3049() {
		assertEquals("Bell", customers.get(3048).getCounty());
	}

	@Test
	@DisplayName("Record 3049: State is TX")
	void StateOfRecord3049() {
		assertEquals("TX", customers.get(3048).getState());
	}

	@Test
	@DisplayName("Record 3049: ZIP is 76541")
	void ZIPOfRecord3049() {
		assertEquals("76541", customers.get(3048).getZIP());
	}

	@Test
	@DisplayName("Record 3049: Phone is 254-634-3782")
	void PhoneOfRecord3049() {
		assertEquals("254-634-3782", customers.get(3048).getPhone());
	}

	@Test
	@DisplayName("Record 3049: Fax is 254-634-8388")
	void FaxOfRecord3049() {
		assertEquals("254-634-8388", customers.get(3048).getFax());
	}

	@Test
	@DisplayName("Record 3049: Email is coy@klyman.com")
	void EmailOfRecord3049() {
		assertEquals("coy@klyman.com", customers.get(3048).getEmail());
	}

	@Test
	@DisplayName("Record 3049: Web is http://www.coyklyman.com")
	void WebOfRecord3049() {
		assertEquals("http://www.coyklyman.com", customers.get(3048).getWeb());
	}
}
