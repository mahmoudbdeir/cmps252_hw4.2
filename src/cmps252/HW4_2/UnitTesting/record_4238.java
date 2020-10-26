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

@Tag("37")
class Record_4238 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4238: FirstName is Jerome")
	void FirstNameOfRecord4238() {
		assertEquals("Jerome", customers.get(4237).getFirstName());
	}

	@Test
	@DisplayName("Record 4238: LastName is Goonez")
	void LastNameOfRecord4238() {
		assertEquals("Goonez", customers.get(4237).getLastName());
	}

	@Test
	@DisplayName("Record 4238: Company is Aaron Industries Inc")
	void CompanyOfRecord4238() {
		assertEquals("Aaron Industries Inc", customers.get(4237).getCompany());
	}

	@Test
	@DisplayName("Record 4238: Address is 901 Se Hawthorne Blvd")
	void AddressOfRecord4238() {
		assertEquals("901 Se Hawthorne Blvd", customers.get(4237).getAddress());
	}

	@Test
	@DisplayName("Record 4238: City is Portland")
	void CityOfRecord4238() {
		assertEquals("Portland", customers.get(4237).getCity());
	}

	@Test
	@DisplayName("Record 4238: County is Multnomah")
	void CountyOfRecord4238() {
		assertEquals("Multnomah", customers.get(4237).getCounty());
	}

	@Test
	@DisplayName("Record 4238: State is OR")
	void StateOfRecord4238() {
		assertEquals("OR", customers.get(4237).getState());
	}

	@Test
	@DisplayName("Record 4238: ZIP is 97214")
	void ZIPOfRecord4238() {
		assertEquals("97214", customers.get(4237).getZIP());
	}

	@Test
	@DisplayName("Record 4238: Phone is 503-234-2729")
	void PhoneOfRecord4238() {
		assertEquals("503-234-2729", customers.get(4237).getPhone());
	}

	@Test
	@DisplayName("Record 4238: Fax is 503-234-9644")
	void FaxOfRecord4238() {
		assertEquals("503-234-9644", customers.get(4237).getFax());
	}

	@Test
	@DisplayName("Record 4238: Email is jerome@goonez.com")
	void EmailOfRecord4238() {
		assertEquals("jerome@goonez.com", customers.get(4237).getEmail());
	}

	@Test
	@DisplayName("Record 4238: Web is http://www.jeromegoonez.com")
	void WebOfRecord4238() {
		assertEquals("http://www.jeromegoonez.com", customers.get(4237).getWeb());
	}
}
