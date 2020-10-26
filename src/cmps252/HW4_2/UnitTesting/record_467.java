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

@Tag("19")
class Record_467 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 467: FirstName is Basil")
	void FirstNameOfRecord467() {
		assertEquals("Basil", customers.get(466).getFirstName());
	}

	@Test
	@DisplayName("Record 467: LastName is Pama")
	void LastNameOfRecord467() {
		assertEquals("Pama", customers.get(466).getLastName());
	}

	@Test
	@DisplayName("Record 467: Company is Nassau Educators Fed Crdt Un")
	void CompanyOfRecord467() {
		assertEquals("Nassau Educators Fed Crdt Un", customers.get(466).getCompany());
	}

	@Test
	@DisplayName("Record 467: Address is 2101 Standiford Ave")
	void AddressOfRecord467() {
		assertEquals("2101 Standiford Ave", customers.get(466).getAddress());
	}

	@Test
	@DisplayName("Record 467: City is Modesto")
	void CityOfRecord467() {
		assertEquals("Modesto", customers.get(466).getCity());
	}

	@Test
	@DisplayName("Record 467: County is Stanislaus")
	void CountyOfRecord467() {
		assertEquals("Stanislaus", customers.get(466).getCounty());
	}

	@Test
	@DisplayName("Record 467: State is CA")
	void StateOfRecord467() {
		assertEquals("CA", customers.get(466).getState());
	}

	@Test
	@DisplayName("Record 467: ZIP is 95350")
	void ZIPOfRecord467() {
		assertEquals("95350", customers.get(466).getZIP());
	}

	@Test
	@DisplayName("Record 467: Phone is 209-577-1775")
	void PhoneOfRecord467() {
		assertEquals("209-577-1775", customers.get(466).getPhone());
	}

	@Test
	@DisplayName("Record 467: Fax is 209-577-7053")
	void FaxOfRecord467() {
		assertEquals("209-577-7053", customers.get(466).getFax());
	}

	@Test
	@DisplayName("Record 467: Email is basil@pama.com")
	void EmailOfRecord467() {
		assertEquals("basil@pama.com", customers.get(466).getEmail());
	}

	@Test
	@DisplayName("Record 467: Web is http://www.basilpama.com")
	void WebOfRecord467() {
		assertEquals("http://www.basilpama.com", customers.get(466).getWeb());
	}
}
