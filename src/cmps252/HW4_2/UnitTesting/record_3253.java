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

@Tag("26")
class Record_3253 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3253: FirstName is Charlene")
	void FirstNameOfRecord3253() {
		assertEquals("Charlene", customers.get(3252).getFirstName());
	}

	@Test
	@DisplayName("Record 3253: LastName is Karhoff")
	void LastNameOfRecord3253() {
		assertEquals("Karhoff", customers.get(3252).getLastName());
	}

	@Test
	@DisplayName("Record 3253: Company is Whiteside Motors")
	void CompanyOfRecord3253() {
		assertEquals("Whiteside Motors", customers.get(3252).getCompany());
	}

	@Test
	@DisplayName("Record 3253: Address is 16800 Edwards Rd")
	void AddressOfRecord3253() {
		assertEquals("16800 Edwards Rd", customers.get(3252).getAddress());
	}

	@Test
	@DisplayName("Record 3253: City is Cerritos")
	void CityOfRecord3253() {
		assertEquals("Cerritos", customers.get(3252).getCity());
	}

	@Test
	@DisplayName("Record 3253: County is Los Angeles")
	void CountyOfRecord3253() {
		assertEquals("Los Angeles", customers.get(3252).getCounty());
	}

	@Test
	@DisplayName("Record 3253: State is CA")
	void StateOfRecord3253() {
		assertEquals("CA", customers.get(3252).getState());
	}

	@Test
	@DisplayName("Record 3253: ZIP is 90703")
	void ZIPOfRecord3253() {
		assertEquals("90703", customers.get(3252).getZIP());
	}

	@Test
	@DisplayName("Record 3253: Phone is 562-970-6101")
	void PhoneOfRecord3253() {
		assertEquals("562-970-6101", customers.get(3252).getPhone());
	}

	@Test
	@DisplayName("Record 3253: Fax is 562-970-7814")
	void FaxOfRecord3253() {
		assertEquals("562-970-7814", customers.get(3252).getFax());
	}

	@Test
	@DisplayName("Record 3253: Email is charlene@karhoff.com")
	void EmailOfRecord3253() {
		assertEquals("charlene@karhoff.com", customers.get(3252).getEmail());
	}

	@Test
	@DisplayName("Record 3253: Web is http://www.charlenekarhoff.com")
	void WebOfRecord3253() {
		assertEquals("http://www.charlenekarhoff.com", customers.get(3252).getWeb());
	}
}
