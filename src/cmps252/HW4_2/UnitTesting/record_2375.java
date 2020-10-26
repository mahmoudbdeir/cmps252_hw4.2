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

@Tag("14")
class Record_2375 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2375: FirstName is Kysha")
	void FirstNameOfRecord2375() {
		assertEquals("Kysha", customers.get(2374).getFirstName());
	}

	@Test
	@DisplayName("Record 2375: LastName is Slown")
	void LastNameOfRecord2375() {
		assertEquals("Slown", customers.get(2374).getLastName());
	}

	@Test
	@DisplayName("Record 2375: Company is Markwood, James S Esq")
	void CompanyOfRecord2375() {
		assertEquals("Markwood, James S Esq", customers.get(2374).getCompany());
	}

	@Test
	@DisplayName("Record 2375: Address is 201 Palmetto Ave")
	void AddressOfRecord2375() {
		assertEquals("201 Palmetto Ave", customers.get(2374).getAddress());
	}

	@Test
	@DisplayName("Record 2375: City is Orlando")
	void CityOfRecord2375() {
		assertEquals("Orlando", customers.get(2374).getCity());
	}

	@Test
	@DisplayName("Record 2375: County is Orange")
	void CountyOfRecord2375() {
		assertEquals("Orange", customers.get(2374).getCounty());
	}

	@Test
	@DisplayName("Record 2375: State is FL")
	void StateOfRecord2375() {
		assertEquals("FL", customers.get(2374).getState());
	}

	@Test
	@DisplayName("Record 2375: ZIP is 32801")
	void ZIPOfRecord2375() {
		assertEquals("32801", customers.get(2374).getZIP());
	}

	@Test
	@DisplayName("Record 2375: Phone is 407-648-1086")
	void PhoneOfRecord2375() {
		assertEquals("407-648-1086", customers.get(2374).getPhone());
	}

	@Test
	@DisplayName("Record 2375: Fax is 407-648-8071")
	void FaxOfRecord2375() {
		assertEquals("407-648-8071", customers.get(2374).getFax());
	}

	@Test
	@DisplayName("Record 2375: Email is kysha@slown.com")
	void EmailOfRecord2375() {
		assertEquals("kysha@slown.com", customers.get(2374).getEmail());
	}

	@Test
	@DisplayName("Record 2375: Web is http://www.kyshaslown.com")
	void WebOfRecord2375() {
		assertEquals("http://www.kyshaslown.com", customers.get(2374).getWeb());
	}
}
