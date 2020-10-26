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

@Tag("15")
class Record_528 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 528: FirstName is Kylie")
	void FirstNameOfRecord528() {
		assertEquals("Kylie", customers.get(527).getFirstName());
	}

	@Test
	@DisplayName("Record 528: LastName is Persons")
	void LastNameOfRecord528() {
		assertEquals("Persons", customers.get(527).getLastName());
	}

	@Test
	@DisplayName("Record 528: Company is E G Verrett & Assoc")
	void CompanyOfRecord528() {
		assertEquals("E G Verrett & Assoc", customers.get(527).getCompany());
	}

	@Test
	@DisplayName("Record 528: Address is 15544 Se 82nd Dr")
	void AddressOfRecord528() {
		assertEquals("15544 Se 82nd Dr", customers.get(527).getAddress());
	}

	@Test
	@DisplayName("Record 528: City is Clackamas")
	void CityOfRecord528() {
		assertEquals("Clackamas", customers.get(527).getCity());
	}

	@Test
	@DisplayName("Record 528: County is Clackamas")
	void CountyOfRecord528() {
		assertEquals("Clackamas", customers.get(527).getCounty());
	}

	@Test
	@DisplayName("Record 528: State is OR")
	void StateOfRecord528() {
		assertEquals("OR", customers.get(527).getState());
	}

	@Test
	@DisplayName("Record 528: ZIP is 97015")
	void ZIPOfRecord528() {
		assertEquals("97015", customers.get(527).getZIP());
	}

	@Test
	@DisplayName("Record 528: Phone is 503-656-8827")
	void PhoneOfRecord528() {
		assertEquals("503-656-8827", customers.get(527).getPhone());
	}

	@Test
	@DisplayName("Record 528: Fax is 503-656-5159")
	void FaxOfRecord528() {
		assertEquals("503-656-5159", customers.get(527).getFax());
	}

	@Test
	@DisplayName("Record 528: Email is kylie@persons.com")
	void EmailOfRecord528() {
		assertEquals("kylie@persons.com", customers.get(527).getEmail());
	}

	@Test
	@DisplayName("Record 528: Web is http://www.kyliepersons.com")
	void WebOfRecord528() {
		assertEquals("http://www.kyliepersons.com", customers.get(527).getWeb());
	}
}
