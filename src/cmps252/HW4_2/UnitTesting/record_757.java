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

@Tag("28")
class Record_757 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 757: FirstName is Delia")
	void FirstNameOfRecord757() {
		assertEquals("Delia", customers.get(756).getFirstName());
	}

	@Test
	@DisplayName("Record 757: LastName is Pavlick")
	void LastNameOfRecord757() {
		assertEquals("Pavlick", customers.get(756).getLastName());
	}

	@Test
	@DisplayName("Record 757: Company is Texas Theatre Supply")
	void CompanyOfRecord757() {
		assertEquals("Texas Theatre Supply", customers.get(756).getCompany());
	}

	@Test
	@DisplayName("Record 757: Address is 18812 Bryant St  #-5")
	void AddressOfRecord757() {
		assertEquals("18812 Bryant St  #-5", customers.get(756).getAddress());
	}

	@Test
	@DisplayName("Record 757: City is Northridge")
	void CityOfRecord757() {
		assertEquals("Northridge", customers.get(756).getCity());
	}

	@Test
	@DisplayName("Record 757: County is Los Angeles")
	void CountyOfRecord757() {
		assertEquals("Los Angeles", customers.get(756).getCounty());
	}

	@Test
	@DisplayName("Record 757: State is CA")
	void StateOfRecord757() {
		assertEquals("CA", customers.get(756).getState());
	}

	@Test
	@DisplayName("Record 757: ZIP is 91324")
	void ZIPOfRecord757() {
		assertEquals("91324", customers.get(756).getZIP());
	}

	@Test
	@DisplayName("Record 757: Phone is 818-886-4021")
	void PhoneOfRecord757() {
		assertEquals("818-886-4021", customers.get(756).getPhone());
	}

	@Test
	@DisplayName("Record 757: Fax is 818-886-5567")
	void FaxOfRecord757() {
		assertEquals("818-886-5567", customers.get(756).getFax());
	}

	@Test
	@DisplayName("Record 757: Email is delia@pavlick.com")
	void EmailOfRecord757() {
		assertEquals("delia@pavlick.com", customers.get(756).getEmail());
	}

	@Test
	@DisplayName("Record 757: Web is http://www.deliapavlick.com")
	void WebOfRecord757() {
		assertEquals("http://www.deliapavlick.com", customers.get(756).getWeb());
	}
}
