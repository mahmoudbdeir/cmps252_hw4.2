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
class Record_4449 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4449: FirstName is Jan")
	void FirstNameOfRecord4449() {
		assertEquals("Jan", customers.get(4448).getFirstName());
	}

	@Test
	@DisplayName("Record 4449: LastName is Sunga")
	void LastNameOfRecord4449() {
		assertEquals("Sunga", customers.get(4448).getLastName());
	}

	@Test
	@DisplayName("Record 4449: Company is Sterling, Daniel S")
	void CompanyOfRecord4449() {
		assertEquals("Sterling, Daniel S", customers.get(4448).getCompany());
	}

	@Test
	@DisplayName("Record 4449: Address is 849 Seahawk Cir")
	void AddressOfRecord4449() {
		assertEquals("849 Seahawk Cir", customers.get(4448).getAddress());
	}

	@Test
	@DisplayName("Record 4449: City is Virginia Beach")
	void CityOfRecord4449() {
		assertEquals("Virginia Beach", customers.get(4448).getCity());
	}

	@Test
	@DisplayName("Record 4449: County is Virginia Beach City")
	void CountyOfRecord4449() {
		assertEquals("Virginia Beach City", customers.get(4448).getCounty());
	}

	@Test
	@DisplayName("Record 4449: State is VA")
	void StateOfRecord4449() {
		assertEquals("VA", customers.get(4448).getState());
	}

	@Test
	@DisplayName("Record 4449: ZIP is 23452")
	void ZIPOfRecord4449() {
		assertEquals("23452", customers.get(4448).getZIP());
	}

	@Test
	@DisplayName("Record 4449: Phone is 757-468-3828")
	void PhoneOfRecord4449() {
		assertEquals("757-468-3828", customers.get(4448).getPhone());
	}

	@Test
	@DisplayName("Record 4449: Fax is 757-468-9291")
	void FaxOfRecord4449() {
		assertEquals("757-468-9291", customers.get(4448).getFax());
	}

	@Test
	@DisplayName("Record 4449: Email is jan@sunga.com")
	void EmailOfRecord4449() {
		assertEquals("jan@sunga.com", customers.get(4448).getEmail());
	}

	@Test
	@DisplayName("Record 4449: Web is http://www.jansunga.com")
	void WebOfRecord4449() {
		assertEquals("http://www.jansunga.com", customers.get(4448).getWeb());
	}
}
