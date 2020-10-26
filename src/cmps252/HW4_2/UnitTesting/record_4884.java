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

@Tag("13")
class Record_4884 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4884: FirstName is Hung")
	void FirstNameOfRecord4884() {
		assertEquals("Hung", customers.get(4883).getFirstName());
	}

	@Test
	@DisplayName("Record 4884: LastName is Hilmer")
	void LastNameOfRecord4884() {
		assertEquals("Hilmer", customers.get(4883).getLastName());
	}

	@Test
	@DisplayName("Record 4884: Company is Gonsalves, Edward A Esq")
	void CompanyOfRecord4884() {
		assertEquals("Gonsalves, Edward A Esq", customers.get(4883).getCompany());
	}

	@Test
	@DisplayName("Record 4884: Address is 516 W Los Angeles")
	void AddressOfRecord4884() {
		assertEquals("516 W Los Angeles", customers.get(4883).getAddress());
	}

	@Test
	@DisplayName("Record 4884: City is Broken Arrow")
	void CityOfRecord4884() {
		assertEquals("Broken Arrow", customers.get(4883).getCity());
	}

	@Test
	@DisplayName("Record 4884: County is Tulsa")
	void CountyOfRecord4884() {
		assertEquals("Tulsa", customers.get(4883).getCounty());
	}

	@Test
	@DisplayName("Record 4884: State is OK")
	void StateOfRecord4884() {
		assertEquals("OK", customers.get(4883).getState());
	}

	@Test
	@DisplayName("Record 4884: ZIP is 74011")
	void ZIPOfRecord4884() {
		assertEquals("74011", customers.get(4883).getZIP());
	}

	@Test
	@DisplayName("Record 4884: Phone is 918-455-0351")
	void PhoneOfRecord4884() {
		assertEquals("918-455-0351", customers.get(4883).getPhone());
	}

	@Test
	@DisplayName("Record 4884: Fax is 918-455-4308")
	void FaxOfRecord4884() {
		assertEquals("918-455-4308", customers.get(4883).getFax());
	}

	@Test
	@DisplayName("Record 4884: Email is hung@hilmer.com")
	void EmailOfRecord4884() {
		assertEquals("hung@hilmer.com", customers.get(4883).getEmail());
	}

	@Test
	@DisplayName("Record 4884: Web is http://www.hunghilmer.com")
	void WebOfRecord4884() {
		assertEquals("http://www.hunghilmer.com", customers.get(4883).getWeb());
	}
}
