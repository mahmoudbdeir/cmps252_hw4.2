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

@Tag("30")
class Record_4185 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4185: FirstName is Julius")
	void FirstNameOfRecord4185() {
		assertEquals("Julius", customers.get(4184).getFirstName());
	}

	@Test
	@DisplayName("Record 4185: LastName is Pernin")
	void LastNameOfRecord4185() {
		assertEquals("Pernin", customers.get(4184).getLastName());
	}

	@Test
	@DisplayName("Record 4185: Company is Sirera, David P Esq")
	void CompanyOfRecord4185() {
		assertEquals("Sirera, David P Esq", customers.get(4184).getCompany());
	}

	@Test
	@DisplayName("Record 4185: Address is 6046 Cornerstone Ct W  #-206")
	void AddressOfRecord4185() {
		assertEquals("6046 Cornerstone Ct W  #-206", customers.get(4184).getAddress());
	}

	@Test
	@DisplayName("Record 4185: City is San Diego")
	void CityOfRecord4185() {
		assertEquals("San Diego", customers.get(4184).getCity());
	}

	@Test
	@DisplayName("Record 4185: County is San Diego")
	void CountyOfRecord4185() {
		assertEquals("San Diego", customers.get(4184).getCounty());
	}

	@Test
	@DisplayName("Record 4185: State is CA")
	void StateOfRecord4185() {
		assertEquals("CA", customers.get(4184).getState());
	}

	@Test
	@DisplayName("Record 4185: ZIP is 92121")
	void ZIPOfRecord4185() {
		assertEquals("92121", customers.get(4184).getZIP());
	}

	@Test
	@DisplayName("Record 4185: Phone is 858-453-0380")
	void PhoneOfRecord4185() {
		assertEquals("858-453-0380", customers.get(4184).getPhone());
	}

	@Test
	@DisplayName("Record 4185: Fax is 858-453-8946")
	void FaxOfRecord4185() {
		assertEquals("858-453-8946", customers.get(4184).getFax());
	}

	@Test
	@DisplayName("Record 4185: Email is julius@pernin.com")
	void EmailOfRecord4185() {
		assertEquals("julius@pernin.com", customers.get(4184).getEmail());
	}

	@Test
	@DisplayName("Record 4185: Web is http://www.juliuspernin.com")
	void WebOfRecord4185() {
		assertEquals("http://www.juliuspernin.com", customers.get(4184).getWeb());
	}
}
