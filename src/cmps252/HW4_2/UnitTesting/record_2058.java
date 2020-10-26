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
class Record_2058 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2058: FirstName is Wm")
	void FirstNameOfRecord2058() {
		assertEquals("Wm", customers.get(2057).getFirstName());
	}

	@Test
	@DisplayName("Record 2058: LastName is Frumkin")
	void LastNameOfRecord2058() {
		assertEquals("Frumkin", customers.get(2057).getLastName());
	}

	@Test
	@DisplayName("Record 2058: Company is Santa Barbara Engineering Inc")
	void CompanyOfRecord2058() {
		assertEquals("Santa Barbara Engineering Inc", customers.get(2057).getCompany());
	}

	@Test
	@DisplayName("Record 2058: Address is 120 Railroad Ave")
	void AddressOfRecord2058() {
		assertEquals("120 Railroad Ave", customers.get(2057).getAddress());
	}

	@Test
	@DisplayName("Record 2058: City is Closter")
	void CityOfRecord2058() {
		assertEquals("Closter", customers.get(2057).getCity());
	}

	@Test
	@DisplayName("Record 2058: County is Bergen")
	void CountyOfRecord2058() {
		assertEquals("Bergen", customers.get(2057).getCounty());
	}

	@Test
	@DisplayName("Record 2058: State is NJ")
	void StateOfRecord2058() {
		assertEquals("NJ", customers.get(2057).getState());
	}

	@Test
	@DisplayName("Record 2058: ZIP is 7624")
	void ZIPOfRecord2058() {
		assertEquals("7624", customers.get(2057).getZIP());
	}

	@Test
	@DisplayName("Record 2058: Phone is 201-767-0698")
	void PhoneOfRecord2058() {
		assertEquals("201-767-0698", customers.get(2057).getPhone());
	}

	@Test
	@DisplayName("Record 2058: Fax is 201-767-8685")
	void FaxOfRecord2058() {
		assertEquals("201-767-8685", customers.get(2057).getFax());
	}

	@Test
	@DisplayName("Record 2058: Email is wm@frumkin.com")
	void EmailOfRecord2058() {
		assertEquals("wm@frumkin.com", customers.get(2057).getEmail());
	}

	@Test
	@DisplayName("Record 2058: Web is http://www.wmfrumkin.com")
	void WebOfRecord2058() {
		assertEquals("http://www.wmfrumkin.com", customers.get(2057).getWeb());
	}
}
