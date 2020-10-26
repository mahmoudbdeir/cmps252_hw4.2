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
class Record_3600 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3600: FirstName is Clay")
	void FirstNameOfRecord3600() {
		assertEquals("Clay", customers.get(3599).getFirstName());
	}

	@Test
	@DisplayName("Record 3600: LastName is Cozine")
	void LastNameOfRecord3600() {
		assertEquals("Cozine", customers.get(3599).getLastName());
	}

	@Test
	@DisplayName("Record 3600: Company is Barresi, Joseph A Md")
	void CompanyOfRecord3600() {
		assertEquals("Barresi, Joseph A Md", customers.get(3599).getCompany());
	}

	@Test
	@DisplayName("Record 3600: Address is 910 Campisi Way  #-2d")
	void AddressOfRecord3600() {
		assertEquals("910 Campisi Way  #-2d", customers.get(3599).getAddress());
	}

	@Test
	@DisplayName("Record 3600: City is Campbell")
	void CityOfRecord3600() {
		assertEquals("Campbell", customers.get(3599).getCity());
	}

	@Test
	@DisplayName("Record 3600: County is Santa Clara")
	void CountyOfRecord3600() {
		assertEquals("Santa Clara", customers.get(3599).getCounty());
	}

	@Test
	@DisplayName("Record 3600: State is CA")
	void StateOfRecord3600() {
		assertEquals("CA", customers.get(3599).getState());
	}

	@Test
	@DisplayName("Record 3600: ZIP is 95008")
	void ZIPOfRecord3600() {
		assertEquals("95008", customers.get(3599).getZIP());
	}

	@Test
	@DisplayName("Record 3600: Phone is 408-377-8908")
	void PhoneOfRecord3600() {
		assertEquals("408-377-8908", customers.get(3599).getPhone());
	}

	@Test
	@DisplayName("Record 3600: Fax is 408-377-9018")
	void FaxOfRecord3600() {
		assertEquals("408-377-9018", customers.get(3599).getFax());
	}

	@Test
	@DisplayName("Record 3600: Email is clay@cozine.com")
	void EmailOfRecord3600() {
		assertEquals("clay@cozine.com", customers.get(3599).getEmail());
	}

	@Test
	@DisplayName("Record 3600: Web is http://www.claycozine.com")
	void WebOfRecord3600() {
		assertEquals("http://www.claycozine.com", customers.get(3599).getWeb());
	}
}
