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

@Tag("11")
class Record_4564 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4564: FirstName is Isaiah")
	void FirstNameOfRecord4564() {
		assertEquals("Isaiah", customers.get(4563).getFirstName());
	}

	@Test
	@DisplayName("Record 4564: LastName is Slifer")
	void LastNameOfRecord4564() {
		assertEquals("Slifer", customers.get(4563).getLastName());
	}

	@Test
	@DisplayName("Record 4564: Company is Candle Lite Inc")
	void CompanyOfRecord4564() {
		assertEquals("Candle Lite Inc", customers.get(4563).getCompany());
	}

	@Test
	@DisplayName("Record 4564: Address is 364 Speedwell Ave")
	void AddressOfRecord4564() {
		assertEquals("364 Speedwell Ave", customers.get(4563).getAddress());
	}

	@Test
	@DisplayName("Record 4564: City is Morristown")
	void CityOfRecord4564() {
		assertEquals("Morristown", customers.get(4563).getCity());
	}

	@Test
	@DisplayName("Record 4564: County is Morris")
	void CountyOfRecord4564() {
		assertEquals("Morris", customers.get(4563).getCounty());
	}

	@Test
	@DisplayName("Record 4564: State is NJ")
	void StateOfRecord4564() {
		assertEquals("NJ", customers.get(4563).getState());
	}

	@Test
	@DisplayName("Record 4564: ZIP is 7960")
	void ZIPOfRecord4564() {
		assertEquals("7960", customers.get(4563).getZIP());
	}

	@Test
	@DisplayName("Record 4564: Phone is 973-292-6516")
	void PhoneOfRecord4564() {
		assertEquals("973-292-6516", customers.get(4563).getPhone());
	}

	@Test
	@DisplayName("Record 4564: Fax is 973-292-3522")
	void FaxOfRecord4564() {
		assertEquals("973-292-3522", customers.get(4563).getFax());
	}

	@Test
	@DisplayName("Record 4564: Email is isaiah@slifer.com")
	void EmailOfRecord4564() {
		assertEquals("isaiah@slifer.com", customers.get(4563).getEmail());
	}

	@Test
	@DisplayName("Record 4564: Web is http://www.isaiahslifer.com")
	void WebOfRecord4564() {
		assertEquals("http://www.isaiahslifer.com", customers.get(4563).getWeb());
	}
}
