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

@Tag("41")
class Record_196 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 196: FirstName is Joseph")
	void FirstNameOfRecord196() {
		assertEquals("Joseph", customers.get(195).getFirstName());
	}

	@Test
	@DisplayName("Record 196: LastName is Mcsweeny")
	void LastNameOfRecord196() {
		assertEquals("Mcsweeny", customers.get(195).getLastName());
	}

	@Test
	@DisplayName("Record 196: Company is Ate International")
	void CompanyOfRecord196() {
		assertEquals("Ate International", customers.get(195).getCompany());
	}

	@Test
	@DisplayName("Record 196: Address is 1061 American St")
	void AddressOfRecord196() {
		assertEquals("1061 American St", customers.get(195).getAddress());
	}

	@Test
	@DisplayName("Record 196: City is San Carlos")
	void CityOfRecord196() {
		assertEquals("San Carlos", customers.get(195).getCity());
	}

	@Test
	@DisplayName("Record 196: County is San Mateo")
	void CountyOfRecord196() {
		assertEquals("San Mateo", customers.get(195).getCounty());
	}

	@Test
	@DisplayName("Record 196: State is CA")
	void StateOfRecord196() {
		assertEquals("CA", customers.get(195).getState());
	}

	@Test
	@DisplayName("Record 196: ZIP is 94070")
	void ZIPOfRecord196() {
		assertEquals("94070", customers.get(195).getZIP());
	}

	@Test
	@DisplayName("Record 196: Phone is 650-593-2660")
	void PhoneOfRecord196() {
		assertEquals("650-593-2660", customers.get(195).getPhone());
	}

	@Test
	@DisplayName("Record 196: Fax is 650-593-6341")
	void FaxOfRecord196() {
		assertEquals("650-593-6341", customers.get(195).getFax());
	}

	@Test
	@DisplayName("Record 196: Email is joseph@mcsweeny.com")
	void EmailOfRecord196() {
		assertEquals("joseph@mcsweeny.com", customers.get(195).getEmail());
	}

	@Test
	@DisplayName("Record 196: Web is http://www.josephmcsweeny.com")
	void WebOfRecord196() {
		assertEquals("http://www.josephmcsweeny.com", customers.get(195).getWeb());
	}
}
