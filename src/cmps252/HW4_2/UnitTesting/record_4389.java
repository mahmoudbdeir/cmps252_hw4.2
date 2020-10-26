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

@Tag("39")
class Record_4389 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4389: FirstName is Latanya")
	void FirstNameOfRecord4389() {
		assertEquals("Latanya", customers.get(4388).getFirstName());
	}

	@Test
	@DisplayName("Record 4389: LastName is Weaving")
	void LastNameOfRecord4389() {
		assertEquals("Weaving", customers.get(4388).getLastName());
	}

	@Test
	@DisplayName("Record 4389: Company is Dabico Inc")
	void CompanyOfRecord4389() {
		assertEquals("Dabico Inc", customers.get(4388).getCompany());
	}

	@Test
	@DisplayName("Record 4389: Address is 15405 S San Pedro St")
	void AddressOfRecord4389() {
		assertEquals("15405 S San Pedro St", customers.get(4388).getAddress());
	}

	@Test
	@DisplayName("Record 4389: City is Gardena")
	void CityOfRecord4389() {
		assertEquals("Gardena", customers.get(4388).getCity());
	}

	@Test
	@DisplayName("Record 4389: County is Los Angeles")
	void CountyOfRecord4389() {
		assertEquals("Los Angeles", customers.get(4388).getCounty());
	}

	@Test
	@DisplayName("Record 4389: State is CA")
	void StateOfRecord4389() {
		assertEquals("CA", customers.get(4388).getState());
	}

	@Test
	@DisplayName("Record 4389: ZIP is 90248")
	void ZIPOfRecord4389() {
		assertEquals("90248", customers.get(4388).getZIP());
	}

	@Test
	@DisplayName("Record 4389: Phone is 310-532-3081")
	void PhoneOfRecord4389() {
		assertEquals("310-532-3081", customers.get(4388).getPhone());
	}

	@Test
	@DisplayName("Record 4389: Fax is 310-532-4936")
	void FaxOfRecord4389() {
		assertEquals("310-532-4936", customers.get(4388).getFax());
	}

	@Test
	@DisplayName("Record 4389: Email is latanya@weaving.com")
	void EmailOfRecord4389() {
		assertEquals("latanya@weaving.com", customers.get(4388).getEmail());
	}

	@Test
	@DisplayName("Record 4389: Web is http://www.latanyaweaving.com")
	void WebOfRecord4389() {
		assertEquals("http://www.latanyaweaving.com", customers.get(4388).getWeb());
	}
}
