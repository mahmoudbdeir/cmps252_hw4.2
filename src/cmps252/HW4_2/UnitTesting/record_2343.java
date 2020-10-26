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

@Tag("45")
class Record_2343 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2343: FirstName is Jose")
	void FirstNameOfRecord2343() {
		assertEquals("Jose", customers.get(2342).getFirstName());
	}

	@Test
	@DisplayName("Record 2343: LastName is Dibley")
	void LastNameOfRecord2343() {
		assertEquals("Dibley", customers.get(2342).getLastName());
	}

	@Test
	@DisplayName("Record 2343: Company is Historic French Market Inn")
	void CompanyOfRecord2343() {
		assertEquals("Historic French Market Inn", customers.get(2342).getCompany());
	}

	@Test
	@DisplayName("Record 2343: Address is 1412 A St")
	void AddressOfRecord2343() {
		assertEquals("1412 A St", customers.get(2342).getAddress());
	}

	@Test
	@DisplayName("Record 2343: City is Antioch")
	void CityOfRecord2343() {
		assertEquals("Antioch", customers.get(2342).getCity());
	}

	@Test
	@DisplayName("Record 2343: County is Contra Costa")
	void CountyOfRecord2343() {
		assertEquals("Contra Costa", customers.get(2342).getCounty());
	}

	@Test
	@DisplayName("Record 2343: State is CA")
	void StateOfRecord2343() {
		assertEquals("CA", customers.get(2342).getState());
	}

	@Test
	@DisplayName("Record 2343: ZIP is 94509")
	void ZIPOfRecord2343() {
		assertEquals("94509", customers.get(2342).getZIP());
	}

	@Test
	@DisplayName("Record 2343: Phone is 925-757-0387")
	void PhoneOfRecord2343() {
		assertEquals("925-757-0387", customers.get(2342).getPhone());
	}

	@Test
	@DisplayName("Record 2343: Fax is 925-757-5953")
	void FaxOfRecord2343() {
		assertEquals("925-757-5953", customers.get(2342).getFax());
	}

	@Test
	@DisplayName("Record 2343: Email is jose@dibley.com")
	void EmailOfRecord2343() {
		assertEquals("jose@dibley.com", customers.get(2342).getEmail());
	}

	@Test
	@DisplayName("Record 2343: Web is http://www.josedibley.com")
	void WebOfRecord2343() {
		assertEquals("http://www.josedibley.com", customers.get(2342).getWeb());
	}
}
