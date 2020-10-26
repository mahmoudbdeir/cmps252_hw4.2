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

@Tag("45")
class Record_3619 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3619: FirstName is Geri")
	void FirstNameOfRecord3619() {
		assertEquals("Geri", customers.get(3618).getFirstName());
	}

	@Test
	@DisplayName("Record 3619: LastName is Bosa")
	void LastNameOfRecord3619() {
		assertEquals("Bosa", customers.get(3618).getLastName());
	}

	@Test
	@DisplayName("Record 3619: Company is Fragrance Resources Inc")
	void CompanyOfRecord3619() {
		assertEquals("Fragrance Resources Inc", customers.get(3618).getCompany());
	}

	@Test
	@DisplayName("Record 3619: Address is 910 Campisi Way")
	void AddressOfRecord3619() {
		assertEquals("910 Campisi Way", customers.get(3618).getAddress());
	}

	@Test
	@DisplayName("Record 3619: City is Campbell")
	void CityOfRecord3619() {
		assertEquals("Campbell", customers.get(3618).getCity());
	}

	@Test
	@DisplayName("Record 3619: County is Santa Clara")
	void CountyOfRecord3619() {
		assertEquals("Santa Clara", customers.get(3618).getCounty());
	}

	@Test
	@DisplayName("Record 3619: State is CA")
	void StateOfRecord3619() {
		assertEquals("CA", customers.get(3618).getState());
	}

	@Test
	@DisplayName("Record 3619: ZIP is 95008")
	void ZIPOfRecord3619() {
		assertEquals("95008", customers.get(3618).getZIP());
	}

	@Test
	@DisplayName("Record 3619: Phone is 408-377-9416")
	void PhoneOfRecord3619() {
		assertEquals("408-377-9416", customers.get(3618).getPhone());
	}

	@Test
	@DisplayName("Record 3619: Fax is 408-377-3689")
	void FaxOfRecord3619() {
		assertEquals("408-377-3689", customers.get(3618).getFax());
	}

	@Test
	@DisplayName("Record 3619: Email is geri@bosa.com")
	void EmailOfRecord3619() {
		assertEquals("geri@bosa.com", customers.get(3618).getEmail());
	}

	@Test
	@DisplayName("Record 3619: Web is http://www.geribosa.com")
	void WebOfRecord3619() {
		assertEquals("http://www.geribosa.com", customers.get(3618).getWeb());
	}
}
