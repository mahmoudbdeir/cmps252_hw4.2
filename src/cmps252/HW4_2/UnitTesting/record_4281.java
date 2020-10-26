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

@Tag("49")
class Record_4281 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4281: FirstName is Emil")
	void FirstNameOfRecord4281() {
		assertEquals("Emil", customers.get(4280).getFirstName());
	}

	@Test
	@DisplayName("Record 4281: LastName is Liceaga")
	void LastNameOfRecord4281() {
		assertEquals("Liceaga", customers.get(4280).getLastName());
	}

	@Test
	@DisplayName("Record 4281: Company is Jones Chevrolet Geo Inc")
	void CompanyOfRecord4281() {
		assertEquals("Jones Chevrolet Geo Inc", customers.get(4280).getCompany());
	}

	@Test
	@DisplayName("Record 4281: Address is 9 Long Branch Ave")
	void AddressOfRecord4281() {
		assertEquals("9 Long Branch Ave", customers.get(4280).getAddress());
	}

	@Test
	@DisplayName("Record 4281: City is Long Branch")
	void CityOfRecord4281() {
		assertEquals("Long Branch", customers.get(4280).getCity());
	}

	@Test
	@DisplayName("Record 4281: County is Monmouth")
	void CountyOfRecord4281() {
		assertEquals("Monmouth", customers.get(4280).getCounty());
	}

	@Test
	@DisplayName("Record 4281: State is NJ")
	void StateOfRecord4281() {
		assertEquals("NJ", customers.get(4280).getState());
	}

	@Test
	@DisplayName("Record 4281: ZIP is 7740")
	void ZIPOfRecord4281() {
		assertEquals("7740", customers.get(4280).getZIP());
	}

	@Test
	@DisplayName("Record 4281: Phone is 732-571-6236")
	void PhoneOfRecord4281() {
		assertEquals("732-571-6236", customers.get(4280).getPhone());
	}

	@Test
	@DisplayName("Record 4281: Fax is 732-571-7526")
	void FaxOfRecord4281() {
		assertEquals("732-571-7526", customers.get(4280).getFax());
	}

	@Test
	@DisplayName("Record 4281: Email is emil@liceaga.com")
	void EmailOfRecord4281() {
		assertEquals("emil@liceaga.com", customers.get(4280).getEmail());
	}

	@Test
	@DisplayName("Record 4281: Web is http://www.emilliceaga.com")
	void WebOfRecord4281() {
		assertEquals("http://www.emilliceaga.com", customers.get(4280).getWeb());
	}
}
