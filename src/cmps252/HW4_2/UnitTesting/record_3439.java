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

@Tag("16")
class Record_3439 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3439: FirstName is Kaitlin")
	void FirstNameOfRecord3439() {
		assertEquals("Kaitlin", customers.get(3438).getFirstName());
	}

	@Test
	@DisplayName("Record 3439: LastName is Mcnuh")
	void LastNameOfRecord3439() {
		assertEquals("Mcnuh", customers.get(3438).getLastName());
	}

	@Test
	@DisplayName("Record 3439: Company is Innovative Systems Inc")
	void CompanyOfRecord3439() {
		assertEquals("Innovative Systems Inc", customers.get(3438).getCompany());
	}

	@Test
	@DisplayName("Record 3439: Address is 1710 Prince St")
	void AddressOfRecord3439() {
		assertEquals("1710 Prince St", customers.get(3438).getAddress());
	}

	@Test
	@DisplayName("Record 3439: City is Alexandria")
	void CityOfRecord3439() {
		assertEquals("Alexandria", customers.get(3438).getCity());
	}

	@Test
	@DisplayName("Record 3439: County is Alexandria City")
	void CountyOfRecord3439() {
		assertEquals("Alexandria City", customers.get(3438).getCounty());
	}

	@Test
	@DisplayName("Record 3439: State is VA")
	void StateOfRecord3439() {
		assertEquals("VA", customers.get(3438).getState());
	}

	@Test
	@DisplayName("Record 3439: ZIP is 22314")
	void ZIPOfRecord3439() {
		assertEquals("22314", customers.get(3438).getZIP());
	}

	@Test
	@DisplayName("Record 3439: Phone is 703-739-9476")
	void PhoneOfRecord3439() {
		assertEquals("703-739-9476", customers.get(3438).getPhone());
	}

	@Test
	@DisplayName("Record 3439: Fax is 703-739-6834")
	void FaxOfRecord3439() {
		assertEquals("703-739-6834", customers.get(3438).getFax());
	}

	@Test
	@DisplayName("Record 3439: Email is kaitlin@mcnuh.com")
	void EmailOfRecord3439() {
		assertEquals("kaitlin@mcnuh.com", customers.get(3438).getEmail());
	}

	@Test
	@DisplayName("Record 3439: Web is http://www.kaitlinmcnuh.com")
	void WebOfRecord3439() {
		assertEquals("http://www.kaitlinmcnuh.com", customers.get(3438).getWeb());
	}
}
