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

@Tag("48")
class Record_4045 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4045: FirstName is Bob")
	void FirstNameOfRecord4045() {
		assertEquals("Bob", customers.get(4044).getFirstName());
	}

	@Test
	@DisplayName("Record 4045: LastName is Paronto")
	void LastNameOfRecord4045() {
		assertEquals("Paronto", customers.get(4044).getLastName());
	}

	@Test
	@DisplayName("Record 4045: Company is Carousel Of Travel")
	void CompanyOfRecord4045() {
		assertEquals("Carousel Of Travel", customers.get(4044).getCompany());
	}

	@Test
	@DisplayName("Record 4045: Address is 1200 Old York Rd")
	void AddressOfRecord4045() {
		assertEquals("1200 Old York Rd", customers.get(4044).getAddress());
	}

	@Test
	@DisplayName("Record 4045: City is Abington")
	void CityOfRecord4045() {
		assertEquals("Abington", customers.get(4044).getCity());
	}

	@Test
	@DisplayName("Record 4045: County is Montgomery")
	void CountyOfRecord4045() {
		assertEquals("Montgomery", customers.get(4044).getCounty());
	}

	@Test
	@DisplayName("Record 4045: State is PA")
	void StateOfRecord4045() {
		assertEquals("PA", customers.get(4044).getState());
	}

	@Test
	@DisplayName("Record 4045: ZIP is 19001")
	void ZIPOfRecord4045() {
		assertEquals("19001", customers.get(4044).getZIP());
	}

	@Test
	@DisplayName("Record 4045: Phone is 215-576-0379")
	void PhoneOfRecord4045() {
		assertEquals("215-576-0379", customers.get(4044).getPhone());
	}

	@Test
	@DisplayName("Record 4045: Fax is 215-576-4916")
	void FaxOfRecord4045() {
		assertEquals("215-576-4916", customers.get(4044).getFax());
	}

	@Test
	@DisplayName("Record 4045: Email is bob@paronto.com")
	void EmailOfRecord4045() {
		assertEquals("bob@paronto.com", customers.get(4044).getEmail());
	}

	@Test
	@DisplayName("Record 4045: Web is http://www.bobparonto.com")
	void WebOfRecord4045() {
		assertEquals("http://www.bobparonto.com", customers.get(4044).getWeb());
	}
}
