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

@Tag("26")
class Record_746 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 746: FirstName is Rueben")
	void FirstNameOfRecord746() {
		assertEquals("Rueben", customers.get(745).getFirstName());
	}

	@Test
	@DisplayName("Record 746: LastName is Schyern")
	void LastNameOfRecord746() {
		assertEquals("Schyern", customers.get(745).getLastName());
	}

	@Test
	@DisplayName("Record 746: Company is Christian Foundation For Chld")
	void CompanyOfRecord746() {
		assertEquals("Christian Foundation For Chld", customers.get(745).getCompany());
	}

	@Test
	@DisplayName("Record 746: Address is Hartford Rd  #-130")
	void AddressOfRecord746() {
		assertEquals("Hartford Rd  #-130", customers.get(745).getAddress());
	}

	@Test
	@DisplayName("Record 746: City is Riverside")
	void CityOfRecord746() {
		assertEquals("Riverside", customers.get(745).getCity());
	}

	@Test
	@DisplayName("Record 746: County is Burlington")
	void CountyOfRecord746() {
		assertEquals("Burlington", customers.get(745).getCounty());
	}

	@Test
	@DisplayName("Record 746: State is NJ")
	void StateOfRecord746() {
		assertEquals("NJ", customers.get(745).getState());
	}

	@Test
	@DisplayName("Record 746: ZIP is 8075")
	void ZIPOfRecord746() {
		assertEquals("8075", customers.get(745).getZIP());
	}

	@Test
	@DisplayName("Record 746: Phone is 856-461-1635")
	void PhoneOfRecord746() {
		assertEquals("856-461-1635", customers.get(745).getPhone());
	}

	@Test
	@DisplayName("Record 746: Fax is 856-461-3819")
	void FaxOfRecord746() {
		assertEquals("856-461-3819", customers.get(745).getFax());
	}

	@Test
	@DisplayName("Record 746: Email is rueben@schyern.com")
	void EmailOfRecord746() {
		assertEquals("rueben@schyern.com", customers.get(745).getEmail());
	}

	@Test
	@DisplayName("Record 746: Web is http://www.ruebenschyern.com")
	void WebOfRecord746() {
		assertEquals("http://www.ruebenschyern.com", customers.get(745).getWeb());
	}
}
