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
class Record_1215 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1215: FirstName is Jill")
	void FirstNameOfRecord1215() {
		assertEquals("Jill", customers.get(1214).getFirstName());
	}

	@Test
	@DisplayName("Record 1215: LastName is Nadell")
	void LastNameOfRecord1215() {
		assertEquals("Nadell", customers.get(1214).getLastName());
	}

	@Test
	@DisplayName("Record 1215: Company is Associated Rubber Inc")
	void CompanyOfRecord1215() {
		assertEquals("Associated Rubber Inc", customers.get(1214).getCompany());
	}

	@Test
	@DisplayName("Record 1215: Address is 115117 Poplar St")
	void AddressOfRecord1215() {
		assertEquals("115117 Poplar St", customers.get(1214).getAddress());
	}

	@Test
	@DisplayName("Record 1215: City is Scranton")
	void CityOfRecord1215() {
		assertEquals("Scranton", customers.get(1214).getCity());
	}

	@Test
	@DisplayName("Record 1215: County is Lackawanna")
	void CountyOfRecord1215() {
		assertEquals("Lackawanna", customers.get(1214).getCounty());
	}

	@Test
	@DisplayName("Record 1215: State is PA")
	void StateOfRecord1215() {
		assertEquals("PA", customers.get(1214).getState());
	}

	@Test
	@DisplayName("Record 1215: ZIP is 18509")
	void ZIPOfRecord1215() {
		assertEquals("18509", customers.get(1214).getZIP());
	}

	@Test
	@DisplayName("Record 1215: Phone is 570-347-7619")
	void PhoneOfRecord1215() {
		assertEquals("570-347-7619", customers.get(1214).getPhone());
	}

	@Test
	@DisplayName("Record 1215: Fax is 570-347-0518")
	void FaxOfRecord1215() {
		assertEquals("570-347-0518", customers.get(1214).getFax());
	}

	@Test
	@DisplayName("Record 1215: Email is jill@nadell.com")
	void EmailOfRecord1215() {
		assertEquals("jill@nadell.com", customers.get(1214).getEmail());
	}

	@Test
	@DisplayName("Record 1215: Web is http://www.jillnadell.com")
	void WebOfRecord1215() {
		assertEquals("http://www.jillnadell.com", customers.get(1214).getWeb());
	}
}
