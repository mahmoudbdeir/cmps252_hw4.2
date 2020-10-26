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

@Tag("5")
class Record_47 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 47: FirstName is Quinn")
	void FirstNameOfRecord47() {
		assertEquals("Quinn", customers.get(46).getFirstName());
	}

	@Test
	@DisplayName("Record 47: LastName is Prazak")
	void LastNameOfRecord47() {
		assertEquals("Prazak", customers.get(46).getLastName());
	}

	@Test
	@DisplayName("Record 47: Company is Am Interntl")
	void CompanyOfRecord47() {
		assertEquals("Am Interntl", customers.get(46).getCompany());
	}

	@Test
	@DisplayName("Record 47: Address is Box #-27616")
	void AddressOfRecord47() {
		assertEquals("Box #-27616", customers.get(46).getAddress());
	}

	@Test
	@DisplayName("Record 47: City is Sacramento")
	void CityOfRecord47() {
		assertEquals("Sacramento", customers.get(46).getCity());
	}

	@Test
	@DisplayName("Record 47: County is Sacramento")
	void CountyOfRecord47() {
		assertEquals("Sacramento", customers.get(46).getCounty());
	}

	@Test
	@DisplayName("Record 47: State is CA")
	void StateOfRecord47() {
		assertEquals("CA", customers.get(46).getState());
	}

	@Test
	@DisplayName("Record 47: ZIP is 95827")
	void ZIPOfRecord47() {
		assertEquals("95827", customers.get(46).getZIP());
	}

	@Test
	@DisplayName("Record 47: Phone is 916-363-9562")
	void PhoneOfRecord47() {
		assertEquals("916-363-9562", customers.get(46).getPhone());
	}

	@Test
	@DisplayName("Record 47: Fax is 916-363-4822")
	void FaxOfRecord47() {
		assertEquals("916-363-4822", customers.get(46).getFax());
	}

	@Test
	@DisplayName("Record 47: Email is quinn@prazak.com")
	void EmailOfRecord47() {
		assertEquals("quinn@prazak.com", customers.get(46).getEmail());
	}

	@Test
	@DisplayName("Record 47: Web is http://www.quinnprazak.com")
	void WebOfRecord47() {
		assertEquals("http://www.quinnprazak.com", customers.get(46).getWeb());
	}
}
