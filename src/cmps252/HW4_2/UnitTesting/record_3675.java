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

@Tag("0")
class Record_3675 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3675: FirstName is Geneva")
	void FirstNameOfRecord3675() {
		assertEquals("Geneva", customers.get(3674).getFirstName());
	}

	@Test
	@DisplayName("Record 3675: LastName is Dutko")
	void LastNameOfRecord3675() {
		assertEquals("Dutko", customers.get(3674).getLastName());
	}

	@Test
	@DisplayName("Record 3675: Company is Sugar Steel Corp")
	void CompanyOfRecord3675() {
		assertEquals("Sugar Steel Corp", customers.get(3674).getCompany());
	}

	@Test
	@DisplayName("Record 3675: Address is 10810 Garfield Ave")
	void AddressOfRecord3675() {
		assertEquals("10810 Garfield Ave", customers.get(3674).getAddress());
	}

	@Test
	@DisplayName("Record 3675: City is South Gate")
	void CityOfRecord3675() {
		assertEquals("South Gate", customers.get(3674).getCity());
	}

	@Test
	@DisplayName("Record 3675: County is Los Angeles")
	void CountyOfRecord3675() {
		assertEquals("Los Angeles", customers.get(3674).getCounty());
	}

	@Test
	@DisplayName("Record 3675: State is CA")
	void StateOfRecord3675() {
		assertEquals("CA", customers.get(3674).getState());
	}

	@Test
	@DisplayName("Record 3675: ZIP is 90280")
	void ZIPOfRecord3675() {
		assertEquals("90280", customers.get(3674).getZIP());
	}

	@Test
	@DisplayName("Record 3675: Phone is 323-861-2192")
	void PhoneOfRecord3675() {
		assertEquals("323-861-2192", customers.get(3674).getPhone());
	}

	@Test
	@DisplayName("Record 3675: Fax is 323-861-5848")
	void FaxOfRecord3675() {
		assertEquals("323-861-5848", customers.get(3674).getFax());
	}

	@Test
	@DisplayName("Record 3675: Email is geneva@dutko.com")
	void EmailOfRecord3675() {
		assertEquals("geneva@dutko.com", customers.get(3674).getEmail());
	}

	@Test
	@DisplayName("Record 3675: Web is http://www.genevadutko.com")
	void WebOfRecord3675() {
		assertEquals("http://www.genevadutko.com", customers.get(3674).getWeb());
	}
}
