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

@Tag("47")
class Record_846 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 846: FirstName is Van")
	void FirstNameOfRecord846() {
		assertEquals("Van", customers.get(845).getFirstName());
	}

	@Test
	@DisplayName("Record 846: LastName is Rawlinson")
	void LastNameOfRecord846() {
		assertEquals("Rawlinson", customers.get(845).getLastName());
	}

	@Test
	@DisplayName("Record 846: Company is Wes Co Industries")
	void CompanyOfRecord846() {
		assertEquals("Wes Co Industries", customers.get(845).getCompany());
	}

	@Test
	@DisplayName("Record 846: Address is 3910 Bristol Pk")
	void AddressOfRecord846() {
		assertEquals("3910 Bristol Pk", customers.get(845).getAddress());
	}

	@Test
	@DisplayName("Record 846: City is Bensalem")
	void CityOfRecord846() {
		assertEquals("Bensalem", customers.get(845).getCity());
	}

	@Test
	@DisplayName("Record 846: County is Bucks")
	void CountyOfRecord846() {
		assertEquals("Bucks", customers.get(845).getCounty());
	}

	@Test
	@DisplayName("Record 846: State is PA")
	void StateOfRecord846() {
		assertEquals("PA", customers.get(845).getState());
	}

	@Test
	@DisplayName("Record 846: ZIP is 19020")
	void ZIPOfRecord846() {
		assertEquals("19020", customers.get(845).getZIP());
	}

	@Test
	@DisplayName("Record 846: Phone is 215-245-2397")
	void PhoneOfRecord846() {
		assertEquals("215-245-2397", customers.get(845).getPhone());
	}

	@Test
	@DisplayName("Record 846: Fax is 215-245-8719")
	void FaxOfRecord846() {
		assertEquals("215-245-8719", customers.get(845).getFax());
	}

	@Test
	@DisplayName("Record 846: Email is van@rawlinson.com")
	void EmailOfRecord846() {
		assertEquals("van@rawlinson.com", customers.get(845).getEmail());
	}

	@Test
	@DisplayName("Record 846: Web is http://www.vanrawlinson.com")
	void WebOfRecord846() {
		assertEquals("http://www.vanrawlinson.com", customers.get(845).getWeb());
	}
}
