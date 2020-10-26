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

@Tag("29")
class Record_1646 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1646: FirstName is Benita")
	void FirstNameOfRecord1646() {
		assertEquals("Benita", customers.get(1645).getFirstName());
	}

	@Test
	@DisplayName("Record 1646: LastName is Rotanelli")
	void LastNameOfRecord1646() {
		assertEquals("Rotanelli", customers.get(1645).getLastName());
	}

	@Test
	@DisplayName("Record 1646: Company is United States Water Polo Inc")
	void CompanyOfRecord1646() {
		assertEquals("United States Water Polo Inc", customers.get(1645).getCompany());
	}

	@Test
	@DisplayName("Record 1646: Address is 138 S El Dorado St")
	void AddressOfRecord1646() {
		assertEquals("138 S El Dorado St", customers.get(1645).getAddress());
	}

	@Test
	@DisplayName("Record 1646: City is Stockton")
	void CityOfRecord1646() {
		assertEquals("Stockton", customers.get(1645).getCity());
	}

	@Test
	@DisplayName("Record 1646: County is San Joaquin")
	void CountyOfRecord1646() {
		assertEquals("San Joaquin", customers.get(1645).getCounty());
	}

	@Test
	@DisplayName("Record 1646: State is CA")
	void StateOfRecord1646() {
		assertEquals("CA", customers.get(1645).getState());
	}

	@Test
	@DisplayName("Record 1646: ZIP is 95202")
	void ZIPOfRecord1646() {
		assertEquals("95202", customers.get(1645).getZIP());
	}

	@Test
	@DisplayName("Record 1646: Phone is 209-941-6398")
	void PhoneOfRecord1646() {
		assertEquals("209-941-6398", customers.get(1645).getPhone());
	}

	@Test
	@DisplayName("Record 1646: Fax is 209-941-6161")
	void FaxOfRecord1646() {
		assertEquals("209-941-6161", customers.get(1645).getFax());
	}

	@Test
	@DisplayName("Record 1646: Email is benita@rotanelli.com")
	void EmailOfRecord1646() {
		assertEquals("benita@rotanelli.com", customers.get(1645).getEmail());
	}

	@Test
	@DisplayName("Record 1646: Web is http://www.benitarotanelli.com")
	void WebOfRecord1646() {
		assertEquals("http://www.benitarotanelli.com", customers.get(1645).getWeb());
	}
}
