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

@Tag("31")
class Record_4030 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4030: FirstName is Michal")
	void FirstNameOfRecord4030() {
		assertEquals("Michal", customers.get(4029).getFirstName());
	}

	@Test
	@DisplayName("Record 4030: LastName is Fidel")
	void LastNameOfRecord4030() {
		assertEquals("Fidel", customers.get(4029).getLastName());
	}

	@Test
	@DisplayName("Record 4030: Company is Burlington County Bicycle Ctr")
	void CompanyOfRecord4030() {
		assertEquals("Burlington County Bicycle Ctr", customers.get(4029).getCompany());
	}

	@Test
	@DisplayName("Record 4030: Address is 28450 Felix Valdez Ave")
	void AddressOfRecord4030() {
		assertEquals("28450 Felix Valdez Ave", customers.get(4029).getAddress());
	}

	@Test
	@DisplayName("Record 4030: City is Temecula")
	void CityOfRecord4030() {
		assertEquals("Temecula", customers.get(4029).getCity());
	}

	@Test
	@DisplayName("Record 4030: County is Riverside")
	void CountyOfRecord4030() {
		assertEquals("Riverside", customers.get(4029).getCounty());
	}

	@Test
	@DisplayName("Record 4030: State is CA")
	void StateOfRecord4030() {
		assertEquals("CA", customers.get(4029).getState());
	}

	@Test
	@DisplayName("Record 4030: ZIP is 92590")
	void ZIPOfRecord4030() {
		assertEquals("92590", customers.get(4029).getZIP());
	}

	@Test
	@DisplayName("Record 4030: Phone is 951-695-0465")
	void PhoneOfRecord4030() {
		assertEquals("951-695-0465", customers.get(4029).getPhone());
	}

	@Test
	@DisplayName("Record 4030: Fax is 951-695-5535")
	void FaxOfRecord4030() {
		assertEquals("951-695-5535", customers.get(4029).getFax());
	}

	@Test
	@DisplayName("Record 4030: Email is michal@fidel.com")
	void EmailOfRecord4030() {
		assertEquals("michal@fidel.com", customers.get(4029).getEmail());
	}

	@Test
	@DisplayName("Record 4030: Web is http://www.michalfidel.com")
	void WebOfRecord4030() {
		assertEquals("http://www.michalfidel.com", customers.get(4029).getWeb());
	}
}
