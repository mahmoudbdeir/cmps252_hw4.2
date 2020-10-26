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
class Record_2293 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2293: FirstName is Seth")
	void FirstNameOfRecord2293() {
		assertEquals("Seth", customers.get(2292).getFirstName());
	}

	@Test
	@DisplayName("Record 2293: LastName is Andis")
	void LastNameOfRecord2293() {
		assertEquals("Andis", customers.get(2292).getLastName());
	}

	@Test
	@DisplayName("Record 2293: Company is Liberty Contracting Corp")
	void CompanyOfRecord2293() {
		assertEquals("Liberty Contracting Corp", customers.get(2292).getCompany());
	}

	@Test
	@DisplayName("Record 2293: Address is 44837 10th St W")
	void AddressOfRecord2293() {
		assertEquals("44837 10th St W", customers.get(2292).getAddress());
	}

	@Test
	@DisplayName("Record 2293: City is Lancaster")
	void CityOfRecord2293() {
		assertEquals("Lancaster", customers.get(2292).getCity());
	}

	@Test
	@DisplayName("Record 2293: County is Los Angeles")
	void CountyOfRecord2293() {
		assertEquals("Los Angeles", customers.get(2292).getCounty());
	}

	@Test
	@DisplayName("Record 2293: State is CA")
	void StateOfRecord2293() {
		assertEquals("CA", customers.get(2292).getState());
	}

	@Test
	@DisplayName("Record 2293: ZIP is 93534")
	void ZIPOfRecord2293() {
		assertEquals("93534", customers.get(2292).getZIP());
	}

	@Test
	@DisplayName("Record 2293: Phone is 661-267-1294")
	void PhoneOfRecord2293() {
		assertEquals("661-267-1294", customers.get(2292).getPhone());
	}

	@Test
	@DisplayName("Record 2293: Fax is 661-267-2687")
	void FaxOfRecord2293() {
		assertEquals("661-267-2687", customers.get(2292).getFax());
	}

	@Test
	@DisplayName("Record 2293: Email is seth@andis.com")
	void EmailOfRecord2293() {
		assertEquals("seth@andis.com", customers.get(2292).getEmail());
	}

	@Test
	@DisplayName("Record 2293: Web is http://www.sethandis.com")
	void WebOfRecord2293() {
		assertEquals("http://www.sethandis.com", customers.get(2292).getWeb());
	}
}
