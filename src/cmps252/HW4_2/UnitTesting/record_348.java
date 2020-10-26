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

@Tag("8")
class Record_348 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 348: FirstName is Millie")
	void FirstNameOfRecord348() {
		assertEquals("Millie", customers.get(347).getFirstName());
	}

	@Test
	@DisplayName("Record 348: LastName is Goldfischer")
	void LastNameOfRecord348() {
		assertEquals("Goldfischer", customers.get(347).getLastName());
	}

	@Test
	@DisplayName("Record 348: Company is Langlois Macdonald And Webster")
	void CompanyOfRecord348() {
		assertEquals("Langlois Macdonald And Webster", customers.get(347).getCompany());
	}

	@Test
	@DisplayName("Record 348: Address is 1 S Mill St")
	void AddressOfRecord348() {
		assertEquals("1 S Mill St", customers.get(347).getAddress());
	}

	@Test
	@DisplayName("Record 348: City is Eldon")
	void CityOfRecord348() {
		assertEquals("Eldon", customers.get(347).getCity());
	}

	@Test
	@DisplayName("Record 348: County is Miller")
	void CountyOfRecord348() {
		assertEquals("Miller", customers.get(347).getCounty());
	}

	@Test
	@DisplayName("Record 348: State is MO")
	void StateOfRecord348() {
		assertEquals("MO", customers.get(347).getState());
	}

	@Test
	@DisplayName("Record 348: ZIP is 65026")
	void ZIPOfRecord348() {
		assertEquals("65026", customers.get(347).getZIP());
	}

	@Test
	@DisplayName("Record 348: Phone is 573-392-9642")
	void PhoneOfRecord348() {
		assertEquals("573-392-9642", customers.get(347).getPhone());
	}

	@Test
	@DisplayName("Record 348: Fax is 573-392-8979")
	void FaxOfRecord348() {
		assertEquals("573-392-8979", customers.get(347).getFax());
	}

	@Test
	@DisplayName("Record 348: Email is millie@goldfischer.com")
	void EmailOfRecord348() {
		assertEquals("millie@goldfischer.com", customers.get(347).getEmail());
	}

	@Test
	@DisplayName("Record 348: Web is http://www.milliegoldfischer.com")
	void WebOfRecord348() {
		assertEquals("http://www.milliegoldfischer.com", customers.get(347).getWeb());
	}
}
