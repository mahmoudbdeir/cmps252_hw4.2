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

@Tag("11")
class Record_4137 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4137: FirstName is Berry")
	void FirstNameOfRecord4137() {
		assertEquals("Berry", customers.get(4136).getFirstName());
	}

	@Test
	@DisplayName("Record 4137: LastName is Swaner")
	void LastNameOfRecord4137() {
		assertEquals("Swaner", customers.get(4136).getLastName());
	}

	@Test
	@DisplayName("Record 4137: Company is Moxie Alley Screen Printing")
	void CompanyOfRecord4137() {
		assertEquals("Moxie Alley Screen Printing", customers.get(4136).getCompany());
	}

	@Test
	@DisplayName("Record 4137: Address is 120 Pershing St")
	void AddressOfRecord4137() {
		assertEquals("120 Pershing St", customers.get(4136).getAddress());
	}

	@Test
	@DisplayName("Record 4137: City is East Providence")
	void CityOfRecord4137() {
		assertEquals("East Providence", customers.get(4136).getCity());
	}

	@Test
	@DisplayName("Record 4137: County is Providence")
	void CountyOfRecord4137() {
		assertEquals("Providence", customers.get(4136).getCounty());
	}

	@Test
	@DisplayName("Record 4137: State is RI")
	void StateOfRecord4137() {
		assertEquals("RI", customers.get(4136).getState());
	}

	@Test
	@DisplayName("Record 4137: ZIP is 2914")
	void ZIPOfRecord4137() {
		assertEquals("2914", customers.get(4136).getZIP());
	}

	@Test
	@DisplayName("Record 4137: Phone is 401-438-6990")
	void PhoneOfRecord4137() {
		assertEquals("401-438-6990", customers.get(4136).getPhone());
	}

	@Test
	@DisplayName("Record 4137: Fax is 401-438-1777")
	void FaxOfRecord4137() {
		assertEquals("401-438-1777", customers.get(4136).getFax());
	}

	@Test
	@DisplayName("Record 4137: Email is berry@swaner.com")
	void EmailOfRecord4137() {
		assertEquals("berry@swaner.com", customers.get(4136).getEmail());
	}

	@Test
	@DisplayName("Record 4137: Web is http://www.berryswaner.com")
	void WebOfRecord4137() {
		assertEquals("http://www.berryswaner.com", customers.get(4136).getWeb());
	}
}
