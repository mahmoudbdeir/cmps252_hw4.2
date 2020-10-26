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
class Record_2232 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2232: FirstName is Katheryn")
	void FirstNameOfRecord2232() {
		assertEquals("Katheryn", customers.get(2231).getFirstName());
	}

	@Test
	@DisplayName("Record 2232: LastName is Jeancharles")
	void LastNameOfRecord2232() {
		assertEquals("Jeancharles", customers.get(2231).getLastName());
	}

	@Test
	@DisplayName("Record 2232: Company is Vibo Sportswear")
	void CompanyOfRecord2232() {
		assertEquals("Vibo Sportswear", customers.get(2231).getCompany());
	}

	@Test
	@DisplayName("Record 2232: Address is 375 Rabro Dr")
	void AddressOfRecord2232() {
		assertEquals("375 Rabro Dr", customers.get(2231).getAddress());
	}

	@Test
	@DisplayName("Record 2232: City is Hauppauge")
	void CityOfRecord2232() {
		assertEquals("Hauppauge", customers.get(2231).getCity());
	}

	@Test
	@DisplayName("Record 2232: County is Suffolk")
	void CountyOfRecord2232() {
		assertEquals("Suffolk", customers.get(2231).getCounty());
	}

	@Test
	@DisplayName("Record 2232: State is NY")
	void StateOfRecord2232() {
		assertEquals("NY", customers.get(2231).getState());
	}

	@Test
	@DisplayName("Record 2232: ZIP is 11788")
	void ZIPOfRecord2232() {
		assertEquals("11788", customers.get(2231).getZIP());
	}

	@Test
	@DisplayName("Record 2232: Phone is 631-582-3397")
	void PhoneOfRecord2232() {
		assertEquals("631-582-3397", customers.get(2231).getPhone());
	}

	@Test
	@DisplayName("Record 2232: Fax is 631-582-6979")
	void FaxOfRecord2232() {
		assertEquals("631-582-6979", customers.get(2231).getFax());
	}

	@Test
	@DisplayName("Record 2232: Email is katheryn@jeancharles.com")
	void EmailOfRecord2232() {
		assertEquals("katheryn@jeancharles.com", customers.get(2231).getEmail());
	}

	@Test
	@DisplayName("Record 2232: Web is http://www.katherynjeancharles.com")
	void WebOfRecord2232() {
		assertEquals("http://www.katherynjeancharles.com", customers.get(2231).getWeb());
	}
}
