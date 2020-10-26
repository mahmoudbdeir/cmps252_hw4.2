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

@Tag("10")
class Record_2196 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2196: FirstName is Stefan")
	void FirstNameOfRecord2196() {
		assertEquals("Stefan", customers.get(2195).getFirstName());
	}

	@Test
	@DisplayName("Record 2196: LastName is Spena")
	void LastNameOfRecord2196() {
		assertEquals("Spena", customers.get(2195).getLastName());
	}

	@Test
	@DisplayName("Record 2196: Company is Princeton Area Foundation Inc")
	void CompanyOfRecord2196() {
		assertEquals("Princeton Area Foundation Inc", customers.get(2195).getCompany());
	}

	@Test
	@DisplayName("Record 2196: Address is 14476 Midway Rd")
	void AddressOfRecord2196() {
		assertEquals("14476 Midway Rd", customers.get(2195).getAddress());
	}

	@Test
	@DisplayName("Record 2196: City is Dallas")
	void CityOfRecord2196() {
		assertEquals("Dallas", customers.get(2195).getCity());
	}

	@Test
	@DisplayName("Record 2196: County is Dallas")
	void CountyOfRecord2196() {
		assertEquals("Dallas", customers.get(2195).getCounty());
	}

	@Test
	@DisplayName("Record 2196: State is TX")
	void StateOfRecord2196() {
		assertEquals("TX", customers.get(2195).getState());
	}

	@Test
	@DisplayName("Record 2196: ZIP is 75244")
	void ZIPOfRecord2196() {
		assertEquals("75244", customers.get(2195).getZIP());
	}

	@Test
	@DisplayName("Record 2196: Phone is 972-661-6264")
	void PhoneOfRecord2196() {
		assertEquals("972-661-6264", customers.get(2195).getPhone());
	}

	@Test
	@DisplayName("Record 2196: Fax is 972-661-9114")
	void FaxOfRecord2196() {
		assertEquals("972-661-9114", customers.get(2195).getFax());
	}

	@Test
	@DisplayName("Record 2196: Email is stefan@spena.com")
	void EmailOfRecord2196() {
		assertEquals("stefan@spena.com", customers.get(2195).getEmail());
	}

	@Test
	@DisplayName("Record 2196: Web is http://www.stefanspena.com")
	void WebOfRecord2196() {
		assertEquals("http://www.stefanspena.com", customers.get(2195).getWeb());
	}
}
