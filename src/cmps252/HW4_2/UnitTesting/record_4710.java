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

@Tag("43")
class Record_4710 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4710: FirstName is Phoebe")
	void FirstNameOfRecord4710() {
		assertEquals("Phoebe", customers.get(4709).getFirstName());
	}

	@Test
	@DisplayName("Record 4710: LastName is Kassell")
	void LastNameOfRecord4710() {
		assertEquals("Kassell", customers.get(4709).getLastName());
	}

	@Test
	@DisplayName("Record 4710: Company is Altop Inc")
	void CompanyOfRecord4710() {
		assertEquals("Altop Inc", customers.get(4709).getCompany());
	}

	@Test
	@DisplayName("Record 4710: Address is 1300 N Knollwood Cir")
	void AddressOfRecord4710() {
		assertEquals("1300 N Knollwood Cir", customers.get(4709).getAddress());
	}

	@Test
	@DisplayName("Record 4710: City is Anahym")
	void CityOfRecord4710() {
		assertEquals("Anahym", customers.get(4709).getCity());
	}

	@Test
	@DisplayName("Record 4710: County is Orange")
	void CountyOfRecord4710() {
		assertEquals("Orange", customers.get(4709).getCounty());
	}

	@Test
	@DisplayName("Record 4710: State is CA")
	void StateOfRecord4710() {
		assertEquals("CA", customers.get(4709).getState());
	}

	@Test
	@DisplayName("Record 4710: ZIP is 92801")
	void ZIPOfRecord4710() {
		assertEquals("92801", customers.get(4709).getZIP());
	}

	@Test
	@DisplayName("Record 4710: Phone is 714-995-5635")
	void PhoneOfRecord4710() {
		assertEquals("714-995-5635", customers.get(4709).getPhone());
	}

	@Test
	@DisplayName("Record 4710: Fax is 714-995-9529")
	void FaxOfRecord4710() {
		assertEquals("714-995-9529", customers.get(4709).getFax());
	}

	@Test
	@DisplayName("Record 4710: Email is phoebe@kassell.com")
	void EmailOfRecord4710() {
		assertEquals("phoebe@kassell.com", customers.get(4709).getEmail());
	}

	@Test
	@DisplayName("Record 4710: Web is http://www.phoebekassell.com")
	void WebOfRecord4710() {
		assertEquals("http://www.phoebekassell.com", customers.get(4709).getWeb());
	}
}
