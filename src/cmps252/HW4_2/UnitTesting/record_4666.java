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

@Tag("1")
class Record_4666 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4666: FirstName is Theo")
	void FirstNameOfRecord4666() {
		assertEquals("Theo", customers.get(4665).getFirstName());
	}

	@Test
	@DisplayName("Record 4666: LastName is Peddicord")
	void LastNameOfRecord4666() {
		assertEquals("Peddicord", customers.get(4665).getLastName());
	}

	@Test
	@DisplayName("Record 4666: Company is Service Associates")
	void CompanyOfRecord4666() {
		assertEquals("Service Associates", customers.get(4665).getCompany());
	}

	@Test
	@DisplayName("Record 4666: Address is 570 W Mount Pleasant Ave")
	void AddressOfRecord4666() {
		assertEquals("570 W Mount Pleasant Ave", customers.get(4665).getAddress());
	}

	@Test
	@DisplayName("Record 4666: City is Livingston")
	void CityOfRecord4666() {
		assertEquals("Livingston", customers.get(4665).getCity());
	}

	@Test
	@DisplayName("Record 4666: County is Essex")
	void CountyOfRecord4666() {
		assertEquals("Essex", customers.get(4665).getCounty());
	}

	@Test
	@DisplayName("Record 4666: State is NJ")
	void StateOfRecord4666() {
		assertEquals("NJ", customers.get(4665).getState());
	}

	@Test
	@DisplayName("Record 4666: ZIP is 7039")
	void ZIPOfRecord4666() {
		assertEquals("7039", customers.get(4665).getZIP());
	}

	@Test
	@DisplayName("Record 4666: Phone is 973-992-5364")
	void PhoneOfRecord4666() {
		assertEquals("973-992-5364", customers.get(4665).getPhone());
	}

	@Test
	@DisplayName("Record 4666: Fax is 973-992-5476")
	void FaxOfRecord4666() {
		assertEquals("973-992-5476", customers.get(4665).getFax());
	}

	@Test
	@DisplayName("Record 4666: Email is theo@peddicord.com")
	void EmailOfRecord4666() {
		assertEquals("theo@peddicord.com", customers.get(4665).getEmail());
	}

	@Test
	@DisplayName("Record 4666: Web is http://www.theopeddicord.com")
	void WebOfRecord4666() {
		assertEquals("http://www.theopeddicord.com", customers.get(4665).getWeb());
	}
}
