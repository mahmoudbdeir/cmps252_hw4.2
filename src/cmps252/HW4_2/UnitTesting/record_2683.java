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
class Record_2683 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2683: FirstName is Margarito")
	void FirstNameOfRecord2683() {
		assertEquals("Margarito", customers.get(2682).getFirstName());
	}

	@Test
	@DisplayName("Record 2683: LastName is Boissy")
	void LastNameOfRecord2683() {
		assertEquals("Boissy", customers.get(2682).getLastName());
	}

	@Test
	@DisplayName("Record 2683: Company is Advanced Business Systs")
	void CompanyOfRecord2683() {
		assertEquals("Advanced Business Systs", customers.get(2682).getCompany());
	}

	@Test
	@DisplayName("Record 2683: Address is 3440 Sierra Rd")
	void AddressOfRecord2683() {
		assertEquals("3440 Sierra Rd", customers.get(2682).getAddress());
	}

	@Test
	@DisplayName("Record 2683: City is San Jose")
	void CityOfRecord2683() {
		assertEquals("San Jose", customers.get(2682).getCity());
	}

	@Test
	@DisplayName("Record 2683: County is Santa Clara")
	void CountyOfRecord2683() {
		assertEquals("Santa Clara", customers.get(2682).getCounty());
	}

	@Test
	@DisplayName("Record 2683: State is CA")
	void StateOfRecord2683() {
		assertEquals("CA", customers.get(2682).getState());
	}

	@Test
	@DisplayName("Record 2683: ZIP is 95132")
	void ZIPOfRecord2683() {
		assertEquals("95132", customers.get(2682).getZIP());
	}

	@Test
	@DisplayName("Record 2683: Phone is 408-254-8930")
	void PhoneOfRecord2683() {
		assertEquals("408-254-8930", customers.get(2682).getPhone());
	}

	@Test
	@DisplayName("Record 2683: Fax is 408-254-7772")
	void FaxOfRecord2683() {
		assertEquals("408-254-7772", customers.get(2682).getFax());
	}

	@Test
	@DisplayName("Record 2683: Email is margarito@boissy.com")
	void EmailOfRecord2683() {
		assertEquals("margarito@boissy.com", customers.get(2682).getEmail());
	}

	@Test
	@DisplayName("Record 2683: Web is http://www.margaritoboissy.com")
	void WebOfRecord2683() {
		assertEquals("http://www.margaritoboissy.com", customers.get(2682).getWeb());
	}
}
