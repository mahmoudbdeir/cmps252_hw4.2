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

@Tag("28")
class Record_3134 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3134: FirstName is Buddy")
	void FirstNameOfRecord3134() {
		assertEquals("Buddy", customers.get(3133).getFirstName());
	}

	@Test
	@DisplayName("Record 3134: LastName is Hric")
	void LastNameOfRecord3134() {
		assertEquals("Hric", customers.get(3133).getLastName());
	}

	@Test
	@DisplayName("Record 3134: Company is Mason, Glenn Aia")
	void CompanyOfRecord3134() {
		assertEquals("Mason, Glenn Aia", customers.get(3133).getCompany());
	}

	@Test
	@DisplayName("Record 3134: Address is 220 Westgate Mall Dr")
	void AddressOfRecord3134() {
		assertEquals("220 Westgate Mall Dr", customers.get(3133).getAddress());
	}

	@Test
	@DisplayName("Record 3134: City is Spartanburg")
	void CityOfRecord3134() {
		assertEquals("Spartanburg", customers.get(3133).getCity());
	}

	@Test
	@DisplayName("Record 3134: County is Spartanburg")
	void CountyOfRecord3134() {
		assertEquals("Spartanburg", customers.get(3133).getCounty());
	}

	@Test
	@DisplayName("Record 3134: State is SC")
	void StateOfRecord3134() {
		assertEquals("SC", customers.get(3133).getState());
	}

	@Test
	@DisplayName("Record 3134: ZIP is 29301")
	void ZIPOfRecord3134() {
		assertEquals("29301", customers.get(3133).getZIP());
	}

	@Test
	@DisplayName("Record 3134: Phone is 864-587-7348")
	void PhoneOfRecord3134() {
		assertEquals("864-587-7348", customers.get(3133).getPhone());
	}

	@Test
	@DisplayName("Record 3134: Fax is 864-587-4438")
	void FaxOfRecord3134() {
		assertEquals("864-587-4438", customers.get(3133).getFax());
	}

	@Test
	@DisplayName("Record 3134: Email is buddy@hric.com")
	void EmailOfRecord3134() {
		assertEquals("buddy@hric.com", customers.get(3133).getEmail());
	}

	@Test
	@DisplayName("Record 3134: Web is http://www.buddyhric.com")
	void WebOfRecord3134() {
		assertEquals("http://www.buddyhric.com", customers.get(3133).getWeb());
	}
}
