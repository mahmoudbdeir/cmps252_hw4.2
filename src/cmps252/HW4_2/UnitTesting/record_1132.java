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

@Tag("34")
class Record_1132 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1132: FirstName is Melinda")
	void FirstNameOfRecord1132() {
		assertEquals("Melinda", customers.get(1131).getFirstName());
	}

	@Test
	@DisplayName("Record 1132: LastName is Galford")
	void LastNameOfRecord1132() {
		assertEquals("Galford", customers.get(1131).getLastName());
	}

	@Test
	@DisplayName("Record 1132: Company is Lincoln Electric Grge Door Co")
	void CompanyOfRecord1132() {
		assertEquals("Lincoln Electric Grge Door Co", customers.get(1131).getCompany());
	}

	@Test
	@DisplayName("Record 1132: Address is 7101 E 8mile Rd")
	void AddressOfRecord1132() {
		assertEquals("7101 E 8mile Rd", customers.get(1131).getAddress());
	}

	@Test
	@DisplayName("Record 1132: City is Warren")
	void CityOfRecord1132() {
		assertEquals("Warren", customers.get(1131).getCity());
	}

	@Test
	@DisplayName("Record 1132: County is Macomb")
	void CountyOfRecord1132() {
		assertEquals("Macomb", customers.get(1131).getCounty());
	}

	@Test
	@DisplayName("Record 1132: State is MI")
	void StateOfRecord1132() {
		assertEquals("MI", customers.get(1131).getState());
	}

	@Test
	@DisplayName("Record 1132: ZIP is 48091")
	void ZIPOfRecord1132() {
		assertEquals("48091", customers.get(1131).getZIP());
	}

	@Test
	@DisplayName("Record 1132: Phone is 586-757-1309")
	void PhoneOfRecord1132() {
		assertEquals("586-757-1309", customers.get(1131).getPhone());
	}

	@Test
	@DisplayName("Record 1132: Fax is 586-757-4522")
	void FaxOfRecord1132() {
		assertEquals("586-757-4522", customers.get(1131).getFax());
	}

	@Test
	@DisplayName("Record 1132: Email is melinda@galford.com")
	void EmailOfRecord1132() {
		assertEquals("melinda@galford.com", customers.get(1131).getEmail());
	}

	@Test
	@DisplayName("Record 1132: Web is http://www.melindagalford.com")
	void WebOfRecord1132() {
		assertEquals("http://www.melindagalford.com", customers.get(1131).getWeb());
	}
}
