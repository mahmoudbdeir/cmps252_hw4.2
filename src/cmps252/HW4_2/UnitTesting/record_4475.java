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
class Record_4475 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4475: FirstName is Guy")
	void FirstNameOfRecord4475() {
		assertEquals("Guy", customers.get(4474).getFirstName());
	}

	@Test
	@DisplayName("Record 4475: LastName is Derenzi")
	void LastNameOfRecord4475() {
		assertEquals("Derenzi", customers.get(4474).getLastName());
	}

	@Test
	@DisplayName("Record 4475: Company is Kay, Thomas L Esq")
	void CompanyOfRecord4475() {
		assertEquals("Kay, Thomas L Esq", customers.get(4474).getCompany());
	}

	@Test
	@DisplayName("Record 4475: Address is 800 W Landstreet Rd")
	void AddressOfRecord4475() {
		assertEquals("800 W Landstreet Rd", customers.get(4474).getAddress());
	}

	@Test
	@DisplayName("Record 4475: City is Orlando")
	void CityOfRecord4475() {
		assertEquals("Orlando", customers.get(4474).getCity());
	}

	@Test
	@DisplayName("Record 4475: County is Orange")
	void CountyOfRecord4475() {
		assertEquals("Orange", customers.get(4474).getCounty());
	}

	@Test
	@DisplayName("Record 4475: State is FL")
	void StateOfRecord4475() {
		assertEquals("FL", customers.get(4474).getState());
	}

	@Test
	@DisplayName("Record 4475: ZIP is 32824")
	void ZIPOfRecord4475() {
		assertEquals("32824", customers.get(4474).getZIP());
	}

	@Test
	@DisplayName("Record 4475: Phone is 407-850-8579")
	void PhoneOfRecord4475() {
		assertEquals("407-850-8579", customers.get(4474).getPhone());
	}

	@Test
	@DisplayName("Record 4475: Fax is 407-850-6211")
	void FaxOfRecord4475() {
		assertEquals("407-850-6211", customers.get(4474).getFax());
	}

	@Test
	@DisplayName("Record 4475: Email is guy@derenzi.com")
	void EmailOfRecord4475() {
		assertEquals("guy@derenzi.com", customers.get(4474).getEmail());
	}

	@Test
	@DisplayName("Record 4475: Web is http://www.guyderenzi.com")
	void WebOfRecord4475() {
		assertEquals("http://www.guyderenzi.com", customers.get(4474).getWeb());
	}
}
