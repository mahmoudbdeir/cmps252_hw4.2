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

@Tag("32")
class Record_1388 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1388: FirstName is Jc")
	void FirstNameOfRecord1388() {
		assertEquals("Jc", customers.get(1387).getFirstName());
	}

	@Test
	@DisplayName("Record 1388: LastName is Prots")
	void LastNameOfRecord1388() {
		assertEquals("Prots", customers.get(1387).getLastName());
	}

	@Test
	@DisplayName("Record 1388: Company is Cheerful Internatl Corp")
	void CompanyOfRecord1388() {
		assertEquals("Cheerful Internatl Corp", customers.get(1387).getCompany());
	}

	@Test
	@DisplayName("Record 1388: Address is 1735 Berry Blvd")
	void AddressOfRecord1388() {
		assertEquals("1735 Berry Blvd", customers.get(1387).getAddress());
	}

	@Test
	@DisplayName("Record 1388: City is Louisville")
	void CityOfRecord1388() {
		assertEquals("Louisville", customers.get(1387).getCity());
	}

	@Test
	@DisplayName("Record 1388: County is Jefferson")
	void CountyOfRecord1388() {
		assertEquals("Jefferson", customers.get(1387).getCounty());
	}

	@Test
	@DisplayName("Record 1388: State is KY")
	void StateOfRecord1388() {
		assertEquals("KY", customers.get(1387).getState());
	}

	@Test
	@DisplayName("Record 1388: ZIP is 40215")
	void ZIPOfRecord1388() {
		assertEquals("40215", customers.get(1387).getZIP());
	}

	@Test
	@DisplayName("Record 1388: Phone is 502-363-0889")
	void PhoneOfRecord1388() {
		assertEquals("502-363-0889", customers.get(1387).getPhone());
	}

	@Test
	@DisplayName("Record 1388: Fax is 502-363-4419")
	void FaxOfRecord1388() {
		assertEquals("502-363-4419", customers.get(1387).getFax());
	}

	@Test
	@DisplayName("Record 1388: Email is jc@prots.com")
	void EmailOfRecord1388() {
		assertEquals("jc@prots.com", customers.get(1387).getEmail());
	}

	@Test
	@DisplayName("Record 1388: Web is http://www.jcprots.com")
	void WebOfRecord1388() {
		assertEquals("http://www.jcprots.com", customers.get(1387).getWeb());
	}
}
