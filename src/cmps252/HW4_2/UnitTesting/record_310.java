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
class Record_310 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 310: FirstName is Dolly")
	void FirstNameOfRecord310() {
		assertEquals("Dolly", customers.get(309).getFirstName());
	}

	@Test
	@DisplayName("Record 310: LastName is Greder")
	void LastNameOfRecord310() {
		assertEquals("Greder", customers.get(309).getLastName());
	}

	@Test
	@DisplayName("Record 310: Company is Spun Products Inc")
	void CompanyOfRecord310() {
		assertEquals("Spun Products Inc", customers.get(309).getCompany());
	}

	@Test
	@DisplayName("Record 310: Address is 336346 Poplar St")
	void AddressOfRecord310() {
		assertEquals("336346 Poplar St", customers.get(309).getAddress());
	}

	@Test
	@DisplayName("Record 310: City is Columbia")
	void CityOfRecord310() {
		assertEquals("Columbia", customers.get(309).getCity());
	}

	@Test
	@DisplayName("Record 310: County is Lancaster")
	void CountyOfRecord310() {
		assertEquals("Lancaster", customers.get(309).getCounty());
	}

	@Test
	@DisplayName("Record 310: State is PA")
	void StateOfRecord310() {
		assertEquals("PA", customers.get(309).getState());
	}

	@Test
	@DisplayName("Record 310: ZIP is 17512")
	void ZIPOfRecord310() {
		assertEquals("17512", customers.get(309).getZIP());
	}

	@Test
	@DisplayName("Record 310: Phone is 717-684-8744")
	void PhoneOfRecord310() {
		assertEquals("717-684-8744", customers.get(309).getPhone());
	}

	@Test
	@DisplayName("Record 310: Fax is 717-684-1631")
	void FaxOfRecord310() {
		assertEquals("717-684-1631", customers.get(309).getFax());
	}

	@Test
	@DisplayName("Record 310: Email is dolly@greder.com")
	void EmailOfRecord310() {
		assertEquals("dolly@greder.com", customers.get(309).getEmail());
	}

	@Test
	@DisplayName("Record 310: Web is http://www.dollygreder.com")
	void WebOfRecord310() {
		assertEquals("http://www.dollygreder.com", customers.get(309).getWeb());
	}
}
