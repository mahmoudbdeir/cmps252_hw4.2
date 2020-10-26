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
class Record_2064 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2064: FirstName is Mervin")
	void FirstNameOfRecord2064() {
		assertEquals("Mervin", customers.get(2063).getFirstName());
	}

	@Test
	@DisplayName("Record 2064: LastName is Glaser")
	void LastNameOfRecord2064() {
		assertEquals("Glaser", customers.get(2063).getLastName());
	}

	@Test
	@DisplayName("Record 2064: Company is Certified Ambulance Service")
	void CompanyOfRecord2064() {
		assertEquals("Certified Ambulance Service", customers.get(2063).getCompany());
	}

	@Test
	@DisplayName("Record 2064: Address is 921 Tyson Ave")
	void AddressOfRecord2064() {
		assertEquals("921 Tyson Ave", customers.get(2063).getAddress());
	}

	@Test
	@DisplayName("Record 2064: City is Philadelphia")
	void CityOfRecord2064() {
		assertEquals("Philadelphia", customers.get(2063).getCity());
	}

	@Test
	@DisplayName("Record 2064: County is Philadelphia")
	void CountyOfRecord2064() {
		assertEquals("Philadelphia", customers.get(2063).getCounty());
	}

	@Test
	@DisplayName("Record 2064: State is PA")
	void StateOfRecord2064() {
		assertEquals("PA", customers.get(2063).getState());
	}

	@Test
	@DisplayName("Record 2064: ZIP is 19111")
	void ZIPOfRecord2064() {
		assertEquals("19111", customers.get(2063).getZIP());
	}

	@Test
	@DisplayName("Record 2064: Phone is 215-742-8775")
	void PhoneOfRecord2064() {
		assertEquals("215-742-8775", customers.get(2063).getPhone());
	}

	@Test
	@DisplayName("Record 2064: Fax is 215-742-7688")
	void FaxOfRecord2064() {
		assertEquals("215-742-7688", customers.get(2063).getFax());
	}

	@Test
	@DisplayName("Record 2064: Email is mervin@glaser.com")
	void EmailOfRecord2064() {
		assertEquals("mervin@glaser.com", customers.get(2063).getEmail());
	}

	@Test
	@DisplayName("Record 2064: Web is http://www.mervinglaser.com")
	void WebOfRecord2064() {
		assertEquals("http://www.mervinglaser.com", customers.get(2063).getWeb());
	}
}
