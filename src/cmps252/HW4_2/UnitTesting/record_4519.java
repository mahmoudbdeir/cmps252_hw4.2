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

@Tag("41")
class Record_4519 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4519: FirstName is Mel")
	void FirstNameOfRecord4519() {
		assertEquals("Mel", customers.get(4518).getFirstName());
	}

	@Test
	@DisplayName("Record 4519: LastName is Magarelli")
	void LastNameOfRecord4519() {
		assertEquals("Magarelli", customers.get(4518).getLastName());
	}

	@Test
	@DisplayName("Record 4519: Company is Benjamin Lipits Co Inc")
	void CompanyOfRecord4519() {
		assertEquals("Benjamin Lipits Co Inc", customers.get(4518).getCompany());
	}

	@Test
	@DisplayName("Record 4519: Address is 7777 S Lewis Ave")
	void AddressOfRecord4519() {
		assertEquals("7777 S Lewis Ave", customers.get(4518).getAddress());
	}

	@Test
	@DisplayName("Record 4519: City is Tulsa")
	void CityOfRecord4519() {
		assertEquals("Tulsa", customers.get(4518).getCity());
	}

	@Test
	@DisplayName("Record 4519: County is Tulsa")
	void CountyOfRecord4519() {
		assertEquals("Tulsa", customers.get(4518).getCounty());
	}

	@Test
	@DisplayName("Record 4519: State is OK")
	void StateOfRecord4519() {
		assertEquals("OK", customers.get(4518).getState());
	}

	@Test
	@DisplayName("Record 4519: ZIP is 74171")
	void ZIPOfRecord4519() {
		assertEquals("74171", customers.get(4518).getZIP());
	}

	@Test
	@DisplayName("Record 4519: Phone is 918-495-6973")
	void PhoneOfRecord4519() {
		assertEquals("918-495-6973", customers.get(4518).getPhone());
	}

	@Test
	@DisplayName("Record 4519: Fax is 918-495-2756")
	void FaxOfRecord4519() {
		assertEquals("918-495-2756", customers.get(4518).getFax());
	}

	@Test
	@DisplayName("Record 4519: Email is mel@magarelli.com")
	void EmailOfRecord4519() {
		assertEquals("mel@magarelli.com", customers.get(4518).getEmail());
	}

	@Test
	@DisplayName("Record 4519: Web is http://www.melmagarelli.com")
	void WebOfRecord4519() {
		assertEquals("http://www.melmagarelli.com", customers.get(4518).getWeb());
	}
}
