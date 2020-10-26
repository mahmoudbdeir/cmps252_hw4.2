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

@Tag("21")
class Record_4447 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4447: FirstName is Johnny")
	void FirstNameOfRecord4447() {
		assertEquals("Johnny", customers.get(4446).getFirstName());
	}

	@Test
	@DisplayName("Record 4447: LastName is Chia")
	void LastNameOfRecord4447() {
		assertEquals("Chia", customers.get(4446).getLastName());
	}

	@Test
	@DisplayName("Record 4447: Company is Golden State Flooring Co")
	void CompanyOfRecord4447() {
		assertEquals("Golden State Flooring Co", customers.get(4446).getCompany());
	}

	@Test
	@DisplayName("Record 4447: Address is Box #-610")
	void AddressOfRecord4447() {
		assertEquals("Box #-610", customers.get(4446).getAddress());
	}

	@Test
	@DisplayName("Record 4447: City is Windermere")
	void CityOfRecord4447() {
		assertEquals("Windermere", customers.get(4446).getCity());
	}

	@Test
	@DisplayName("Record 4447: County is Orange")
	void CountyOfRecord4447() {
		assertEquals("Orange", customers.get(4446).getCounty());
	}

	@Test
	@DisplayName("Record 4447: State is FL")
	void StateOfRecord4447() {
		assertEquals("FL", customers.get(4446).getState());
	}

	@Test
	@DisplayName("Record 4447: ZIP is 34786")
	void ZIPOfRecord4447() {
		assertEquals("34786", customers.get(4446).getZIP());
	}

	@Test
	@DisplayName("Record 4447: Phone is 407-876-9664")
	void PhoneOfRecord4447() {
		assertEquals("407-876-9664", customers.get(4446).getPhone());
	}

	@Test
	@DisplayName("Record 4447: Fax is 407-876-3842")
	void FaxOfRecord4447() {
		assertEquals("407-876-3842", customers.get(4446).getFax());
	}

	@Test
	@DisplayName("Record 4447: Email is johnny@chia.com")
	void EmailOfRecord4447() {
		assertEquals("johnny@chia.com", customers.get(4446).getEmail());
	}

	@Test
	@DisplayName("Record 4447: Web is http://www.johnnychia.com")
	void WebOfRecord4447() {
		assertEquals("http://www.johnnychia.com", customers.get(4446).getWeb());
	}
}
