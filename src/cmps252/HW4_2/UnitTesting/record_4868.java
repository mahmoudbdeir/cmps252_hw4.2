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

@Tag("31")
class Record_4868 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4868: FirstName is Iva")
	void FirstNameOfRecord4868() {
		assertEquals("Iva", customers.get(4867).getFirstName());
	}

	@Test
	@DisplayName("Record 4868: LastName is Rishor")
	void LastNameOfRecord4868() {
		assertEquals("Rishor", customers.get(4867).getLastName());
	}

	@Test
	@DisplayName("Record 4868: Company is Thoms Proestler Co")
	void CompanyOfRecord4868() {
		assertEquals("Thoms Proestler Co", customers.get(4867).getCompany());
	}

	@Test
	@DisplayName("Record 4868: Address is 10605a 2judiccial Dr")
	void AddressOfRecord4868() {
		assertEquals("10605a 2judiccial Dr", customers.get(4867).getAddress());
	}

	@Test
	@DisplayName("Record 4868: City is Fairfax")
	void CityOfRecord4868() {
		assertEquals("Fairfax", customers.get(4867).getCity());
	}

	@Test
	@DisplayName("Record 4868: County is Fairfax City")
	void CountyOfRecord4868() {
		assertEquals("Fairfax City", customers.get(4867).getCounty());
	}

	@Test
	@DisplayName("Record 4868: State is VA")
	void StateOfRecord4868() {
		assertEquals("VA", customers.get(4867).getState());
	}

	@Test
	@DisplayName("Record 4868: ZIP is 22030")
	void ZIPOfRecord4868() {
		assertEquals("22030", customers.get(4867).getZIP());
	}

	@Test
	@DisplayName("Record 4868: Phone is 703-352-4290")
	void PhoneOfRecord4868() {
		assertEquals("703-352-4290", customers.get(4867).getPhone());
	}

	@Test
	@DisplayName("Record 4868: Fax is 703-352-4852")
	void FaxOfRecord4868() {
		assertEquals("703-352-4852", customers.get(4867).getFax());
	}

	@Test
	@DisplayName("Record 4868: Email is iva@rishor.com")
	void EmailOfRecord4868() {
		assertEquals("iva@rishor.com", customers.get(4867).getEmail());
	}

	@Test
	@DisplayName("Record 4868: Web is http://www.ivarishor.com")
	void WebOfRecord4868() {
		assertEquals("http://www.ivarishor.com", customers.get(4867).getWeb());
	}
}
