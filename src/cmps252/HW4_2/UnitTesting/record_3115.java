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

@Tag("1")
class Record_3115 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3115: FirstName is Alonzo")
	void FirstNameOfRecord3115() {
		assertEquals("Alonzo", customers.get(3114).getFirstName());
	}

	@Test
	@DisplayName("Record 3115: LastName is Brummel")
	void LastNameOfRecord3115() {
		assertEquals("Brummel", customers.get(3114).getLastName());
	}

	@Test
	@DisplayName("Record 3115: Company is Brewer & Assoc Inc")
	void CompanyOfRecord3115() {
		assertEquals("Brewer & Assoc Inc", customers.get(3114).getCompany());
	}

	@Test
	@DisplayName("Record 3115: Address is 363 5th St")
	void AddressOfRecord3115() {
		assertEquals("363 5th St", customers.get(3114).getAddress());
	}

	@Test
	@DisplayName("Record 3115: City is Syracuse")
	void CityOfRecord3115() {
		assertEquals("Syracuse", customers.get(3114).getCity());
	}

	@Test
	@DisplayName("Record 3115: County is Otoe")
	void CountyOfRecord3115() {
		assertEquals("Otoe", customers.get(3114).getCounty());
	}

	@Test
	@DisplayName("Record 3115: State is NE")
	void StateOfRecord3115() {
		assertEquals("NE", customers.get(3114).getState());
	}

	@Test
	@DisplayName("Record 3115: ZIP is 68446")
	void ZIPOfRecord3115() {
		assertEquals("68446", customers.get(3114).getZIP());
	}

	@Test
	@DisplayName("Record 3115: Phone is 402-269-8465")
	void PhoneOfRecord3115() {
		assertEquals("402-269-8465", customers.get(3114).getPhone());
	}

	@Test
	@DisplayName("Record 3115: Fax is 402-269-6554")
	void FaxOfRecord3115() {
		assertEquals("402-269-6554", customers.get(3114).getFax());
	}

	@Test
	@DisplayName("Record 3115: Email is alonzo@brummel.com")
	void EmailOfRecord3115() {
		assertEquals("alonzo@brummel.com", customers.get(3114).getEmail());
	}

	@Test
	@DisplayName("Record 3115: Web is http://www.alonzobrummel.com")
	void WebOfRecord3115() {
		assertEquals("http://www.alonzobrummel.com", customers.get(3114).getWeb());
	}
}
