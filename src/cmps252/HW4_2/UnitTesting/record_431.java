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
class Record_431 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 431: FirstName is Dena")
	void FirstNameOfRecord431() {
		assertEquals("Dena", customers.get(430).getFirstName());
	}

	@Test
	@DisplayName("Record 431: LastName is Sensabaugh")
	void LastNameOfRecord431() {
		assertEquals("Sensabaugh", customers.get(430).getLastName());
	}

	@Test
	@DisplayName("Record 431: Company is Durham Pecan Co")
	void CompanyOfRecord431() {
		assertEquals("Durham Pecan Co", customers.get(430).getCompany());
	}

	@Test
	@DisplayName("Record 431: Address is 200 N Marquette St")
	void AddressOfRecord431() {
		assertEquals("200 N Marquette St", customers.get(430).getAddress());
	}

	@Test
	@DisplayName("Record 431: City is Davenport")
	void CityOfRecord431() {
		assertEquals("Davenport", customers.get(430).getCity());
	}

	@Test
	@DisplayName("Record 431: County is Scott")
	void CountyOfRecord431() {
		assertEquals("Scott", customers.get(430).getCounty());
	}

	@Test
	@DisplayName("Record 431: State is IA")
	void StateOfRecord431() {
		assertEquals("IA", customers.get(430).getState());
	}

	@Test
	@DisplayName("Record 431: ZIP is 52802")
	void ZIPOfRecord431() {
		assertEquals("52802", customers.get(430).getZIP());
	}

	@Test
	@DisplayName("Record 431: Phone is 563-322-1789")
	void PhoneOfRecord431() {
		assertEquals("563-322-1789", customers.get(430).getPhone());
	}

	@Test
	@DisplayName("Record 431: Fax is 563-322-2816")
	void FaxOfRecord431() {
		assertEquals("563-322-2816", customers.get(430).getFax());
	}

	@Test
	@DisplayName("Record 431: Email is dena@sensabaugh.com")
	void EmailOfRecord431() {
		assertEquals("dena@sensabaugh.com", customers.get(430).getEmail());
	}

	@Test
	@DisplayName("Record 431: Web is http://www.denasensabaugh.com")
	void WebOfRecord431() {
		assertEquals("http://www.denasensabaugh.com", customers.get(430).getWeb());
	}
}
