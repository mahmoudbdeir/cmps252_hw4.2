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

@Tag("48")
class Record_307 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 307: FirstName is Chadwick")
	void FirstNameOfRecord307() {
		assertEquals("Chadwick", customers.get(306).getFirstName());
	}

	@Test
	@DisplayName("Record 307: LastName is Casabona")
	void LastNameOfRecord307() {
		assertEquals("Casabona", customers.get(306).getLastName());
	}

	@Test
	@DisplayName("Record 307: Company is Patterson, Gary B Esq")
	void CompanyOfRecord307() {
		assertEquals("Patterson, Gary B Esq", customers.get(306).getCompany());
	}

	@Test
	@DisplayName("Record 307: Address is 2526 Westminister St")
	void AddressOfRecord307() {
		assertEquals("2526 Westminister St", customers.get(306).getAddress());
	}

	@Test
	@DisplayName("Record 307: City is Pearland")
	void CityOfRecord307() {
		assertEquals("Pearland", customers.get(306).getCity());
	}

	@Test
	@DisplayName("Record 307: County is Brazoria")
	void CountyOfRecord307() {
		assertEquals("Brazoria", customers.get(306).getCounty());
	}

	@Test
	@DisplayName("Record 307: State is TX")
	void StateOfRecord307() {
		assertEquals("TX", customers.get(306).getState());
	}

	@Test
	@DisplayName("Record 307: ZIP is 77581")
	void ZIPOfRecord307() {
		assertEquals("77581", customers.get(306).getZIP());
	}

	@Test
	@DisplayName("Record 307: Phone is 281-485-5408")
	void PhoneOfRecord307() {
		assertEquals("281-485-5408", customers.get(306).getPhone());
	}

	@Test
	@DisplayName("Record 307: Fax is 281-485-5749")
	void FaxOfRecord307() {
		assertEquals("281-485-5749", customers.get(306).getFax());
	}

	@Test
	@DisplayName("Record 307: Email is chadwick@casabona.com")
	void EmailOfRecord307() {
		assertEquals("chadwick@casabona.com", customers.get(306).getEmail());
	}

	@Test
	@DisplayName("Record 307: Web is http://www.chadwickcasabona.com")
	void WebOfRecord307() {
		assertEquals("http://www.chadwickcasabona.com", customers.get(306).getWeb());
	}
}
