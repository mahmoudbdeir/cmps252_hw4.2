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
class Record_2297 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2297: FirstName is Ellie")
	void FirstNameOfRecord2297() {
		assertEquals("Ellie", customers.get(2296).getFirstName());
	}

	@Test
	@DisplayName("Record 2297: LastName is Boutte")
	void LastNameOfRecord2297() {
		assertEquals("Boutte", customers.get(2296).getLastName());
	}

	@Test
	@DisplayName("Record 2297: Company is Mail Boxes Etc")
	void CompanyOfRecord2297() {
		assertEquals("Mail Boxes Etc", customers.get(2296).getCompany());
	}

	@Test
	@DisplayName("Record 2297: Address is 1404 Laurens Rd")
	void AddressOfRecord2297() {
		assertEquals("1404 Laurens Rd", customers.get(2296).getAddress());
	}

	@Test
	@DisplayName("Record 2297: City is Greenville")
	void CityOfRecord2297() {
		assertEquals("Greenville", customers.get(2296).getCity());
	}

	@Test
	@DisplayName("Record 2297: County is Greenville")
	void CountyOfRecord2297() {
		assertEquals("Greenville", customers.get(2296).getCounty());
	}

	@Test
	@DisplayName("Record 2297: State is SC")
	void StateOfRecord2297() {
		assertEquals("SC", customers.get(2296).getState());
	}

	@Test
	@DisplayName("Record 2297: ZIP is 29607")
	void ZIPOfRecord2297() {
		assertEquals("29607", customers.get(2296).getZIP());
	}

	@Test
	@DisplayName("Record 2297: Phone is 864-271-2708")
	void PhoneOfRecord2297() {
		assertEquals("864-271-2708", customers.get(2296).getPhone());
	}

	@Test
	@DisplayName("Record 2297: Fax is 864-271-3952")
	void FaxOfRecord2297() {
		assertEquals("864-271-3952", customers.get(2296).getFax());
	}

	@Test
	@DisplayName("Record 2297: Email is ellie@boutte.com")
	void EmailOfRecord2297() {
		assertEquals("ellie@boutte.com", customers.get(2296).getEmail());
	}

	@Test
	@DisplayName("Record 2297: Web is http://www.ellieboutte.com")
	void WebOfRecord2297() {
		assertEquals("http://www.ellieboutte.com", customers.get(2296).getWeb());
	}
}
