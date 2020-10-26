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

@Tag("20")
class Record_2679 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2679: FirstName is Pamela")
	void FirstNameOfRecord2679() {
		assertEquals("Pamela", customers.get(2678).getFirstName());
	}

	@Test
	@DisplayName("Record 2679: LastName is Yerke")
	void LastNameOfRecord2679() {
		assertEquals("Yerke", customers.get(2678).getLastName());
	}

	@Test
	@DisplayName("Record 2679: Company is J Miller Flowers")
	void CompanyOfRecord2679() {
		assertEquals("J Miller Flowers", customers.get(2678).getCompany());
	}

	@Test
	@DisplayName("Record 2679: Address is 287 Bowman Ave")
	void AddressOfRecord2679() {
		assertEquals("287 Bowman Ave", customers.get(2678).getAddress());
	}

	@Test
	@DisplayName("Record 2679: City is Purchase")
	void CityOfRecord2679() {
		assertEquals("Purchase", customers.get(2678).getCity());
	}

	@Test
	@DisplayName("Record 2679: County is Westchester")
	void CountyOfRecord2679() {
		assertEquals("Westchester", customers.get(2678).getCounty());
	}

	@Test
	@DisplayName("Record 2679: State is NY")
	void StateOfRecord2679() {
		assertEquals("NY", customers.get(2678).getState());
	}

	@Test
	@DisplayName("Record 2679: ZIP is 10577")
	void ZIPOfRecord2679() {
		assertEquals("10577", customers.get(2678).getZIP());
	}

	@Test
	@DisplayName("Record 2679: Phone is 914-694-3382")
	void PhoneOfRecord2679() {
		assertEquals("914-694-3382", customers.get(2678).getPhone());
	}

	@Test
	@DisplayName("Record 2679: Fax is 914-694-2006")
	void FaxOfRecord2679() {
		assertEquals("914-694-2006", customers.get(2678).getFax());
	}

	@Test
	@DisplayName("Record 2679: Email is pamela@yerke.com")
	void EmailOfRecord2679() {
		assertEquals("pamela@yerke.com", customers.get(2678).getEmail());
	}

	@Test
	@DisplayName("Record 2679: Web is http://www.pamelayerke.com")
	void WebOfRecord2679() {
		assertEquals("http://www.pamelayerke.com", customers.get(2678).getWeb());
	}
}
