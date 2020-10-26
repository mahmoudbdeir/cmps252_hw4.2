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

@Tag("14")
class Record_1426 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1426: FirstName is Christin")
	void FirstNameOfRecord1426() {
		assertEquals("Christin", customers.get(1425).getFirstName());
	}

	@Test
	@DisplayName("Record 1426: LastName is Coldsmith")
	void LastNameOfRecord1426() {
		assertEquals("Coldsmith", customers.get(1425).getLastName());
	}

	@Test
	@DisplayName("Record 1426: Company is Aldon Office Machine Inc")
	void CompanyOfRecord1426() {
		assertEquals("Aldon Office Machine Inc", customers.get(1425).getCompany());
	}

	@Test
	@DisplayName("Record 1426: Address is 9th Rd")
	void AddressOfRecord1426() {
		assertEquals("9th Rd", customers.get(1425).getAddress());
	}

	@Test
	@DisplayName("Record 1426: City is Hammonton")
	void CityOfRecord1426() {
		assertEquals("Hammonton", customers.get(1425).getCity());
	}

	@Test
	@DisplayName("Record 1426: County is Atlantic")
	void CountyOfRecord1426() {
		assertEquals("Atlantic", customers.get(1425).getCounty());
	}

	@Test
	@DisplayName("Record 1426: State is NJ")
	void StateOfRecord1426() {
		assertEquals("NJ", customers.get(1425).getState());
	}

	@Test
	@DisplayName("Record 1426: ZIP is 8037")
	void ZIPOfRecord1426() {
		assertEquals("8037", customers.get(1425).getZIP());
	}

	@Test
	@DisplayName("Record 1426: Phone is 609-567-7509")
	void PhoneOfRecord1426() {
		assertEquals("609-567-7509", customers.get(1425).getPhone());
	}

	@Test
	@DisplayName("Record 1426: Fax is 609-567-2037")
	void FaxOfRecord1426() {
		assertEquals("609-567-2037", customers.get(1425).getFax());
	}

	@Test
	@DisplayName("Record 1426: Email is christin@coldsmith.com")
	void EmailOfRecord1426() {
		assertEquals("christin@coldsmith.com", customers.get(1425).getEmail());
	}

	@Test
	@DisplayName("Record 1426: Web is http://www.christincoldsmith.com")
	void WebOfRecord1426() {
		assertEquals("http://www.christincoldsmith.com", customers.get(1425).getWeb());
	}
}
