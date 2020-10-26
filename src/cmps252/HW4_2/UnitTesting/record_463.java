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

@Tag("34")
class Record_463 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 463: FirstName is Ernestine")
	void FirstNameOfRecord463() {
		assertEquals("Ernestine", customers.get(462).getFirstName());
	}

	@Test
	@DisplayName("Record 463: LastName is Zacharewicz")
	void LastNameOfRecord463() {
		assertEquals("Zacharewicz", customers.get(462).getLastName());
	}

	@Test
	@DisplayName("Record 463: Company is Dordick, Gary A Esq")
	void CompanyOfRecord463() {
		assertEquals("Dordick, Gary A Esq", customers.get(462).getCompany());
	}

	@Test
	@DisplayName("Record 463: Address is 3267 Monier Cir")
	void AddressOfRecord463() {
		assertEquals("3267 Monier Cir", customers.get(462).getAddress());
	}

	@Test
	@DisplayName("Record 463: City is Rancho Cordova")
	void CityOfRecord463() {
		assertEquals("Rancho Cordova", customers.get(462).getCity());
	}

	@Test
	@DisplayName("Record 463: County is Sacramento")
	void CountyOfRecord463() {
		assertEquals("Sacramento", customers.get(462).getCounty());
	}

	@Test
	@DisplayName("Record 463: State is CA")
	void StateOfRecord463() {
		assertEquals("CA", customers.get(462).getState());
	}

	@Test
	@DisplayName("Record 463: ZIP is 95742")
	void ZIPOfRecord463() {
		assertEquals("95742", customers.get(462).getZIP());
	}

	@Test
	@DisplayName("Record 463: Phone is 916-635-8520")
	void PhoneOfRecord463() {
		assertEquals("916-635-8520", customers.get(462).getPhone());
	}

	@Test
	@DisplayName("Record 463: Fax is 916-635-1022")
	void FaxOfRecord463() {
		assertEquals("916-635-1022", customers.get(462).getFax());
	}

	@Test
	@DisplayName("Record 463: Email is ernestine@zacharewicz.com")
	void EmailOfRecord463() {
		assertEquals("ernestine@zacharewicz.com", customers.get(462).getEmail());
	}

	@Test
	@DisplayName("Record 463: Web is http://www.ernestinezacharewicz.com")
	void WebOfRecord463() {
		assertEquals("http://www.ernestinezacharewicz.com", customers.get(462).getWeb());
	}
}
