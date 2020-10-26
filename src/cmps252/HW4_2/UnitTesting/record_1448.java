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

@Tag("39")
class Record_1448 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1448: FirstName is Lou")
	void FirstNameOfRecord1448() {
		assertEquals("Lou", customers.get(1447).getFirstName());
	}

	@Test
	@DisplayName("Record 1448: LastName is Spirk")
	void LastNameOfRecord1448() {
		assertEquals("Spirk", customers.get(1447).getLastName());
	}

	@Test
	@DisplayName("Record 1448: Company is Gill, W Brent Esq")
	void CompanyOfRecord1448() {
		assertEquals("Gill, W Brent Esq", customers.get(1447).getCompany());
	}

	@Test
	@DisplayName("Record 1448: Address is 1013 Saint Ann St")
	void AddressOfRecord1448() {
		assertEquals("1013 Saint Ann St", customers.get(1447).getAddress());
	}

	@Test
	@DisplayName("Record 1448: City is New Orleans")
	void CityOfRecord1448() {
		assertEquals("New Orleans", customers.get(1447).getCity());
	}

	@Test
	@DisplayName("Record 1448: County is Orleans")
	void CountyOfRecord1448() {
		assertEquals("Orleans", customers.get(1447).getCounty());
	}

	@Test
	@DisplayName("Record 1448: State is LA")
	void StateOfRecord1448() {
		assertEquals("LA", customers.get(1447).getState());
	}

	@Test
	@DisplayName("Record 1448: ZIP is 70116")
	void ZIPOfRecord1448() {
		assertEquals("70116", customers.get(1447).getZIP());
	}

	@Test
	@DisplayName("Record 1448: Phone is 504-581-3114")
	void PhoneOfRecord1448() {
		assertEquals("504-581-3114", customers.get(1447).getPhone());
	}

	@Test
	@DisplayName("Record 1448: Fax is 504-581-4768")
	void FaxOfRecord1448() {
		assertEquals("504-581-4768", customers.get(1447).getFax());
	}

	@Test
	@DisplayName("Record 1448: Email is lou@spirk.com")
	void EmailOfRecord1448() {
		assertEquals("lou@spirk.com", customers.get(1447).getEmail());
	}

	@Test
	@DisplayName("Record 1448: Web is http://www.louspirk.com")
	void WebOfRecord1448() {
		assertEquals("http://www.louspirk.com", customers.get(1447).getWeb());
	}
}
