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
class Record_2174 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2174: FirstName is Tyrone")
	void FirstNameOfRecord2174() {
		assertEquals("Tyrone", customers.get(2173).getFirstName());
	}

	@Test
	@DisplayName("Record 2174: LastName is Vivar")
	void LastNameOfRecord2174() {
		assertEquals("Vivar", customers.get(2173).getLastName());
	}

	@Test
	@DisplayName("Record 2174: Company is San Diego Soy Dairy")
	void CompanyOfRecord2174() {
		assertEquals("San Diego Soy Dairy", customers.get(2173).getCompany());
	}

	@Test
	@DisplayName("Record 2174: Address is 3591 Rickenbacker St")
	void AddressOfRecord2174() {
		assertEquals("3591 Rickenbacker St", customers.get(2173).getAddress());
	}

	@Test
	@DisplayName("Record 2174: City is Boise")
	void CityOfRecord2174() {
		assertEquals("Boise", customers.get(2173).getCity());
	}

	@Test
	@DisplayName("Record 2174: County is Ada")
	void CountyOfRecord2174() {
		assertEquals("Ada", customers.get(2173).getCounty());
	}

	@Test
	@DisplayName("Record 2174: State is ID")
	void StateOfRecord2174() {
		assertEquals("ID", customers.get(2173).getState());
	}

	@Test
	@DisplayName("Record 2174: ZIP is 83705")
	void ZIPOfRecord2174() {
		assertEquals("83705", customers.get(2173).getZIP());
	}

	@Test
	@DisplayName("Record 2174: Phone is 208-338-6032")
	void PhoneOfRecord2174() {
		assertEquals("208-338-6032", customers.get(2173).getPhone());
	}

	@Test
	@DisplayName("Record 2174: Fax is 208-338-7157")
	void FaxOfRecord2174() {
		assertEquals("208-338-7157", customers.get(2173).getFax());
	}

	@Test
	@DisplayName("Record 2174: Email is tyrone@vivar.com")
	void EmailOfRecord2174() {
		assertEquals("tyrone@vivar.com", customers.get(2173).getEmail());
	}

	@Test
	@DisplayName("Record 2174: Web is http://www.tyronevivar.com")
	void WebOfRecord2174() {
		assertEquals("http://www.tyronevivar.com", customers.get(2173).getWeb());
	}
}
