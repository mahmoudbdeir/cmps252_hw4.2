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

@Tag("27")
class Record_191 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 191: FirstName is Toby")
	void FirstNameOfRecord191() {
		assertEquals("Toby", customers.get(190).getFirstName());
	}

	@Test
	@DisplayName("Record 191: LastName is Twiford")
	void LastNameOfRecord191() {
		assertEquals("Twiford", customers.get(190).getLastName());
	}

	@Test
	@DisplayName("Record 191: Company is Knights Inn")
	void CompanyOfRecord191() {
		assertEquals("Knights Inn", customers.get(190).getCompany());
	}

	@Test
	@DisplayName("Record 191: Address is Box #-876")
	void AddressOfRecord191() {
		assertEquals("Box #-876", customers.get(190).getAddress());
	}

	@Test
	@DisplayName("Record 191: City is Rawlins")
	void CityOfRecord191() {
		assertEquals("Rawlins", customers.get(190).getCity());
	}

	@Test
	@DisplayName("Record 191: County is Carbon")
	void CountyOfRecord191() {
		assertEquals("Carbon", customers.get(190).getCounty());
	}

	@Test
	@DisplayName("Record 191: State is WY")
	void StateOfRecord191() {
		assertEquals("WY", customers.get(190).getState());
	}

	@Test
	@DisplayName("Record 191: ZIP is 82301")
	void ZIPOfRecord191() {
		assertEquals("82301", customers.get(190).getZIP());
	}

	@Test
	@DisplayName("Record 191: Phone is 307-324-1211")
	void PhoneOfRecord191() {
		assertEquals("307-324-1211", customers.get(190).getPhone());
	}

	@Test
	@DisplayName("Record 191: Fax is 307-324-9599")
	void FaxOfRecord191() {
		assertEquals("307-324-9599", customers.get(190).getFax());
	}

	@Test
	@DisplayName("Record 191: Email is toby@twiford.com")
	void EmailOfRecord191() {
		assertEquals("toby@twiford.com", customers.get(190).getEmail());
	}

	@Test
	@DisplayName("Record 191: Web is http://www.tobytwiford.com")
	void WebOfRecord191() {
		assertEquals("http://www.tobytwiford.com", customers.get(190).getWeb());
	}
}
