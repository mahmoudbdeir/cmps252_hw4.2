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

@Tag("41")
class Record_2515 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2515: FirstName is Elden")
	void FirstNameOfRecord2515() {
		assertEquals("Elden", customers.get(2514).getFirstName());
	}

	@Test
	@DisplayName("Record 2515: LastName is Terlecki")
	void LastNameOfRecord2515() {
		assertEquals("Terlecki", customers.get(2514).getLastName());
	}

	@Test
	@DisplayName("Record 2515: Company is Industrial De La Morena")
	void CompanyOfRecord2515() {
		assertEquals("Industrial De La Morena", customers.get(2514).getCompany());
	}

	@Test
	@DisplayName("Record 2515: Address is White Marsh Shpg")
	void AddressOfRecord2515() {
		assertEquals("White Marsh Shpg", customers.get(2514).getAddress());
	}

	@Test
	@DisplayName("Record 2515: City is White Marsh")
	void CityOfRecord2515() {
		assertEquals("White Marsh", customers.get(2514).getCity());
	}

	@Test
	@DisplayName("Record 2515: County is Gloucester")
	void CountyOfRecord2515() {
		assertEquals("Gloucester", customers.get(2514).getCounty());
	}

	@Test
	@DisplayName("Record 2515: State is VA")
	void StateOfRecord2515() {
		assertEquals("VA", customers.get(2514).getState());
	}

	@Test
	@DisplayName("Record 2515: ZIP is 23183")
	void ZIPOfRecord2515() {
		assertEquals("23183", customers.get(2514).getZIP());
	}

	@Test
	@DisplayName("Record 2515: Phone is 804-693-2860")
	void PhoneOfRecord2515() {
		assertEquals("804-693-2860", customers.get(2514).getPhone());
	}

	@Test
	@DisplayName("Record 2515: Fax is 804-693-4062")
	void FaxOfRecord2515() {
		assertEquals("804-693-4062", customers.get(2514).getFax());
	}

	@Test
	@DisplayName("Record 2515: Email is elden@terlecki.com")
	void EmailOfRecord2515() {
		assertEquals("elden@terlecki.com", customers.get(2514).getEmail());
	}

	@Test
	@DisplayName("Record 2515: Web is http://www.eldenterlecki.com")
	void WebOfRecord2515() {
		assertEquals("http://www.eldenterlecki.com", customers.get(2514).getWeb());
	}
}
