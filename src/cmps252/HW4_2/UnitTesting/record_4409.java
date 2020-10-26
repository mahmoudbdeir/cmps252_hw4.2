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

@Tag("38")
class Record_4409 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4409: FirstName is Haley")
	void FirstNameOfRecord4409() {
		assertEquals("Haley", customers.get(4408).getFirstName());
	}

	@Test
	@DisplayName("Record 4409: LastName is Machey")
	void LastNameOfRecord4409() {
		assertEquals("Machey", customers.get(4408).getLastName());
	}

	@Test
	@DisplayName("Record 4409: Company is Brody Paper Sales Co")
	void CompanyOfRecord4409() {
		assertEquals("Brody Paper Sales Co", customers.get(4408).getCompany());
	}

	@Test
	@DisplayName("Record 4409: Address is Rd 13n N")
	void AddressOfRecord4409() {
		assertEquals("Rd 13n N", customers.get(4408).getAddress());
	}

	@Test
	@DisplayName("Record 4409: City is Urbana")
	void CityOfRecord4409() {
		assertEquals("Urbana", customers.get(4408).getCity());
	}

	@Test
	@DisplayName("Record 4409: County is Wabash")
	void CountyOfRecord4409() {
		assertEquals("Wabash", customers.get(4408).getCounty());
	}

	@Test
	@DisplayName("Record 4409: State is IN")
	void StateOfRecord4409() {
		assertEquals("IN", customers.get(4408).getState());
	}

	@Test
	@DisplayName("Record 4409: ZIP is 46990")
	void ZIPOfRecord4409() {
		assertEquals("46990", customers.get(4408).getZIP());
	}

	@Test
	@DisplayName("Record 4409: Phone is 260-774-0469")
	void PhoneOfRecord4409() {
		assertEquals("260-774-0469", customers.get(4408).getPhone());
	}

	@Test
	@DisplayName("Record 4409: Fax is 260-774-8112")
	void FaxOfRecord4409() {
		assertEquals("260-774-8112", customers.get(4408).getFax());
	}

	@Test
	@DisplayName("Record 4409: Email is haley@machey.com")
	void EmailOfRecord4409() {
		assertEquals("haley@machey.com", customers.get(4408).getEmail());
	}

	@Test
	@DisplayName("Record 4409: Web is http://www.haleymachey.com")
	void WebOfRecord4409() {
		assertEquals("http://www.haleymachey.com", customers.get(4408).getWeb());
	}
}
