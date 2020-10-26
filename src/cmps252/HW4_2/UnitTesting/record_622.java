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
class Record_622 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 622: FirstName is Birdie")
	void FirstNameOfRecord622() {
		assertEquals("Birdie", customers.get(621).getFirstName());
	}

	@Test
	@DisplayName("Record 622: LastName is Whitchurch")
	void LastNameOfRecord622() {
		assertEquals("Whitchurch", customers.get(621).getLastName());
	}

	@Test
	@DisplayName("Record 622: Company is Franel Optical Supl Co")
	void CompanyOfRecord622() {
		assertEquals("Franel Optical Supl Co", customers.get(621).getCompany());
	}

	@Test
	@DisplayName("Record 622: Address is 5795 Stockdale Rd")
	void AddressOfRecord622() {
		assertEquals("5795 Stockdale Rd", customers.get(621).getAddress());
	}

	@Test
	@DisplayName("Record 622: City is Paso Robles")
	void CityOfRecord622() {
		assertEquals("Paso Robles", customers.get(621).getCity());
	}

	@Test
	@DisplayName("Record 622: County is San Luis Obispo")
	void CountyOfRecord622() {
		assertEquals("San Luis Obispo", customers.get(621).getCounty());
	}

	@Test
	@DisplayName("Record 622: State is CA")
	void StateOfRecord622() {
		assertEquals("CA", customers.get(621).getState());
	}

	@Test
	@DisplayName("Record 622: ZIP is 93446")
	void ZIPOfRecord622() {
		assertEquals("93446", customers.get(621).getZIP());
	}

	@Test
	@DisplayName("Record 622: Phone is 805-238-3501")
	void PhoneOfRecord622() {
		assertEquals("805-238-3501", customers.get(621).getPhone());
	}

	@Test
	@DisplayName("Record 622: Fax is 805-238-8991")
	void FaxOfRecord622() {
		assertEquals("805-238-8991", customers.get(621).getFax());
	}

	@Test
	@DisplayName("Record 622: Email is birdie@whitchurch.com")
	void EmailOfRecord622() {
		assertEquals("birdie@whitchurch.com", customers.get(621).getEmail());
	}

	@Test
	@DisplayName("Record 622: Web is http://www.birdiewhitchurch.com")
	void WebOfRecord622() {
		assertEquals("http://www.birdiewhitchurch.com", customers.get(621).getWeb());
	}
}
