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

@Tag("11")
class Record_3855 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3855: FirstName is Santiago")
	void FirstNameOfRecord3855() {
		assertEquals("Santiago", customers.get(3854).getFirstName());
	}

	@Test
	@DisplayName("Record 3855: LastName is Antos")
	void LastNameOfRecord3855() {
		assertEquals("Antos", customers.get(3854).getLastName());
	}

	@Test
	@DisplayName("Record 3855: Company is Brunnquell Iron Works Inc")
	void CompanyOfRecord3855() {
		assertEquals("Brunnquell Iron Works Inc", customers.get(3854).getCompany());
	}

	@Test
	@DisplayName("Record 3855: Address is 818 St Sebastian Way  #-404")
	void AddressOfRecord3855() {
		assertEquals("818 St Sebastian Way  #-404", customers.get(3854).getAddress());
	}

	@Test
	@DisplayName("Record 3855: City is Augusta")
	void CityOfRecord3855() {
		assertEquals("Augusta", customers.get(3854).getCity());
	}

	@Test
	@DisplayName("Record 3855: County is Richmond")
	void CountyOfRecord3855() {
		assertEquals("Richmond", customers.get(3854).getCounty());
	}

	@Test
	@DisplayName("Record 3855: State is GA")
	void StateOfRecord3855() {
		assertEquals("GA", customers.get(3854).getState());
	}

	@Test
	@DisplayName("Record 3855: ZIP is 30901")
	void ZIPOfRecord3855() {
		assertEquals("30901", customers.get(3854).getZIP());
	}

	@Test
	@DisplayName("Record 3855: Phone is 706-724-5660")
	void PhoneOfRecord3855() {
		assertEquals("706-724-5660", customers.get(3854).getPhone());
	}

	@Test
	@DisplayName("Record 3855: Fax is 706-724-1094")
	void FaxOfRecord3855() {
		assertEquals("706-724-1094", customers.get(3854).getFax());
	}

	@Test
	@DisplayName("Record 3855: Email is santiago@antos.com")
	void EmailOfRecord3855() {
		assertEquals("santiago@antos.com", customers.get(3854).getEmail());
	}

	@Test
	@DisplayName("Record 3855: Web is http://www.santiagoantos.com")
	void WebOfRecord3855() {
		assertEquals("http://www.santiagoantos.com", customers.get(3854).getWeb());
	}
}
