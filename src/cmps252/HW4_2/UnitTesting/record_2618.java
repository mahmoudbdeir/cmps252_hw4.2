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

@Tag("36")
class Record_2618 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2618: FirstName is Janelle")
	void FirstNameOfRecord2618() {
		assertEquals("Janelle", customers.get(2617).getFirstName());
	}

	@Test
	@DisplayName("Record 2618: LastName is Yearta")
	void LastNameOfRecord2618() {
		assertEquals("Yearta", customers.get(2617).getLastName());
	}

	@Test
	@DisplayName("Record 2618: Company is Doerr, Fred L Cpa")
	void CompanyOfRecord2618() {
		assertEquals("Doerr, Fred L Cpa", customers.get(2617).getCompany());
	}

	@Test
	@DisplayName("Record 2618: Address is 955 Commerce Dr")
	void AddressOfRecord2618() {
		assertEquals("955 Commerce Dr", customers.get(2617).getAddress());
	}

	@Test
	@DisplayName("Record 2618: City is Perrysburg")
	void CityOfRecord2618() {
		assertEquals("Perrysburg", customers.get(2617).getCity());
	}

	@Test
	@DisplayName("Record 2618: County is Wood")
	void CountyOfRecord2618() {
		assertEquals("Wood", customers.get(2617).getCounty());
	}

	@Test
	@DisplayName("Record 2618: State is OH")
	void StateOfRecord2618() {
		assertEquals("OH", customers.get(2617).getState());
	}

	@Test
	@DisplayName("Record 2618: ZIP is 43551")
	void ZIPOfRecord2618() {
		assertEquals("43551", customers.get(2617).getZIP());
	}

	@Test
	@DisplayName("Record 2618: Phone is 419-874-5764")
	void PhoneOfRecord2618() {
		assertEquals("419-874-5764", customers.get(2617).getPhone());
	}

	@Test
	@DisplayName("Record 2618: Fax is 419-874-8627")
	void FaxOfRecord2618() {
		assertEquals("419-874-8627", customers.get(2617).getFax());
	}

	@Test
	@DisplayName("Record 2618: Email is janelle@yearta.com")
	void EmailOfRecord2618() {
		assertEquals("janelle@yearta.com", customers.get(2617).getEmail());
	}

	@Test
	@DisplayName("Record 2618: Web is http://www.janelleyearta.com")
	void WebOfRecord2618() {
		assertEquals("http://www.janelleyearta.com", customers.get(2617).getWeb());
	}
}
