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

@Tag("2")
class Record_4604 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4604: FirstName is Nick")
	void FirstNameOfRecord4604() {
		assertEquals("Nick", customers.get(4603).getFirstName());
	}

	@Test
	@DisplayName("Record 4604: LastName is Isadore")
	void LastNameOfRecord4604() {
		assertEquals("Isadore", customers.get(4603).getLastName());
	}

	@Test
	@DisplayName("Record 4604: Company is Kuhn Mfg")
	void CompanyOfRecord4604() {
		assertEquals("Kuhn Mfg", customers.get(4603).getCompany());
	}

	@Test
	@DisplayName("Record 4604: Address is 3386 Snouffer Rd")
	void AddressOfRecord4604() {
		assertEquals("3386 Snouffer Rd", customers.get(4603).getAddress());
	}

	@Test
	@DisplayName("Record 4604: City is Columbus")
	void CityOfRecord4604() {
		assertEquals("Columbus", customers.get(4603).getCity());
	}

	@Test
	@DisplayName("Record 4604: County is Franklin")
	void CountyOfRecord4604() {
		assertEquals("Franklin", customers.get(4603).getCounty());
	}

	@Test
	@DisplayName("Record 4604: State is OH")
	void StateOfRecord4604() {
		assertEquals("OH", customers.get(4603).getState());
	}

	@Test
	@DisplayName("Record 4604: ZIP is 43235")
	void ZIPOfRecord4604() {
		assertEquals("43235", customers.get(4603).getZIP());
	}

	@Test
	@DisplayName("Record 4604: Phone is 614-764-5824")
	void PhoneOfRecord4604() {
		assertEquals("614-764-5824", customers.get(4603).getPhone());
	}

	@Test
	@DisplayName("Record 4604: Fax is 614-764-4505")
	void FaxOfRecord4604() {
		assertEquals("614-764-4505", customers.get(4603).getFax());
	}

	@Test
	@DisplayName("Record 4604: Email is nick@isadore.com")
	void EmailOfRecord4604() {
		assertEquals("nick@isadore.com", customers.get(4603).getEmail());
	}

	@Test
	@DisplayName("Record 4604: Web is http://www.nickisadore.com")
	void WebOfRecord4604() {
		assertEquals("http://www.nickisadore.com", customers.get(4603).getWeb());
	}
}
