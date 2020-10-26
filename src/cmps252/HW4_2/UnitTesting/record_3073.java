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
class Record_3073 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3073: FirstName is Sharron")
	void FirstNameOfRecord3073() {
		assertEquals("Sharron", customers.get(3072).getFirstName());
	}

	@Test
	@DisplayName("Record 3073: LastName is Borstad")
	void LastNameOfRecord3073() {
		assertEquals("Borstad", customers.get(3072).getLastName());
	}

	@Test
	@DisplayName("Record 3073: Company is Natori Company Inc")
	void CompanyOfRecord3073() {
		assertEquals("Natori Company Inc", customers.get(3072).getCompany());
	}

	@Test
	@DisplayName("Record 3073: Address is 1240 Mookaula St  #-a")
	void AddressOfRecord3073() {
		assertEquals("1240 Mookaula St  #-a", customers.get(3072).getAddress());
	}

	@Test
	@DisplayName("Record 3073: City is Honolulu")
	void CityOfRecord3073() {
		assertEquals("Honolulu", customers.get(3072).getCity());
	}

	@Test
	@DisplayName("Record 3073: County is Honolulu")
	void CountyOfRecord3073() {
		assertEquals("Honolulu", customers.get(3072).getCounty());
	}

	@Test
	@DisplayName("Record 3073: State is HI")
	void StateOfRecord3073() {
		assertEquals("HI", customers.get(3072).getState());
	}

	@Test
	@DisplayName("Record 3073: ZIP is 96817")
	void ZIPOfRecord3073() {
		assertEquals("96817", customers.get(3072).getZIP());
	}

	@Test
	@DisplayName("Record 3073: Phone is 808-842-6974")
	void PhoneOfRecord3073() {
		assertEquals("808-842-6974", customers.get(3072).getPhone());
	}

	@Test
	@DisplayName("Record 3073: Fax is 808-842-0826")
	void FaxOfRecord3073() {
		assertEquals("808-842-0826", customers.get(3072).getFax());
	}

	@Test
	@DisplayName("Record 3073: Email is sharron@borstad.com")
	void EmailOfRecord3073() {
		assertEquals("sharron@borstad.com", customers.get(3072).getEmail());
	}

	@Test
	@DisplayName("Record 3073: Web is http://www.sharronborstad.com")
	void WebOfRecord3073() {
		assertEquals("http://www.sharronborstad.com", customers.get(3072).getWeb());
	}
}
