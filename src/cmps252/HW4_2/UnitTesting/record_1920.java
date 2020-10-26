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
class Record_1920 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1920: FirstName is Judy")
	void FirstNameOfRecord1920() {
		assertEquals("Judy", customers.get(1919).getFirstName());
	}

	@Test
	@DisplayName("Record 1920: LastName is Prisk")
	void LastNameOfRecord1920() {
		assertEquals("Prisk", customers.get(1919).getLastName());
	}

	@Test
	@DisplayName("Record 1920: Company is Unlimited Systems Corp Inc")
	void CompanyOfRecord1920() {
		assertEquals("Unlimited Systems Corp Inc", customers.get(1919).getCompany());
	}

	@Test
	@DisplayName("Record 1920: Address is 4100 Pistorio Rd")
	void AddressOfRecord1920() {
		assertEquals("4100 Pistorio Rd", customers.get(1919).getAddress());
	}

	@Test
	@DisplayName("Record 1920: City is Baltimore")
	void CityOfRecord1920() {
		assertEquals("Baltimore", customers.get(1919).getCity());
	}

	@Test
	@DisplayName("Record 1920: County is Baltimore City")
	void CountyOfRecord1920() {
		assertEquals("Baltimore City", customers.get(1919).getCounty());
	}

	@Test
	@DisplayName("Record 1920: State is MD")
	void StateOfRecord1920() {
		assertEquals("MD", customers.get(1919).getState());
	}

	@Test
	@DisplayName("Record 1920: ZIP is 21229")
	void ZIPOfRecord1920() {
		assertEquals("21229", customers.get(1919).getZIP());
	}

	@Test
	@DisplayName("Record 1920: Phone is 410-247-0870")
	void PhoneOfRecord1920() {
		assertEquals("410-247-0870", customers.get(1919).getPhone());
	}

	@Test
	@DisplayName("Record 1920: Fax is 410-247-1409")
	void FaxOfRecord1920() {
		assertEquals("410-247-1409", customers.get(1919).getFax());
	}

	@Test
	@DisplayName("Record 1920: Email is judy@prisk.com")
	void EmailOfRecord1920() {
		assertEquals("judy@prisk.com", customers.get(1919).getEmail());
	}

	@Test
	@DisplayName("Record 1920: Web is http://www.judyprisk.com")
	void WebOfRecord1920() {
		assertEquals("http://www.judyprisk.com", customers.get(1919).getWeb());
	}
}
