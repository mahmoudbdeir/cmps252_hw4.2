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

@Tag("33")
class Record_4714 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4714: FirstName is Sabrina")
	void FirstNameOfRecord4714() {
		assertEquals("Sabrina", customers.get(4713).getFirstName());
	}

	@Test
	@DisplayName("Record 4714: LastName is Boeckx")
	void LastNameOfRecord4714() {
		assertEquals("Boeckx", customers.get(4713).getLastName());
	}

	@Test
	@DisplayName("Record 4714: Company is Floors Forever")
	void CompanyOfRecord4714() {
		assertEquals("Floors Forever", customers.get(4713).getCompany());
	}

	@Test
	@DisplayName("Record 4714: Address is 180 Commerce Dr")
	void AddressOfRecord4714() {
		assertEquals("180 Commerce Dr", customers.get(4713).getAddress());
	}

	@Test
	@DisplayName("Record 4714: City is Hauppauge")
	void CityOfRecord4714() {
		assertEquals("Hauppauge", customers.get(4713).getCity());
	}

	@Test
	@DisplayName("Record 4714: County is Suffolk")
	void CountyOfRecord4714() {
		assertEquals("Suffolk", customers.get(4713).getCounty());
	}

	@Test
	@DisplayName("Record 4714: State is NY")
	void StateOfRecord4714() {
		assertEquals("NY", customers.get(4713).getState());
	}

	@Test
	@DisplayName("Record 4714: ZIP is 11788")
	void ZIPOfRecord4714() {
		assertEquals("11788", customers.get(4713).getZIP());
	}

	@Test
	@DisplayName("Record 4714: Phone is 631-353-1702")
	void PhoneOfRecord4714() {
		assertEquals("631-353-1702", customers.get(4713).getPhone());
	}

	@Test
	@DisplayName("Record 4714: Fax is 631-353-4551")
	void FaxOfRecord4714() {
		assertEquals("631-353-4551", customers.get(4713).getFax());
	}

	@Test
	@DisplayName("Record 4714: Email is sabrina@boeckx.com")
	void EmailOfRecord4714() {
		assertEquals("sabrina@boeckx.com", customers.get(4713).getEmail());
	}

	@Test
	@DisplayName("Record 4714: Web is http://www.sabrinaboeckx.com")
	void WebOfRecord4714() {
		assertEquals("http://www.sabrinaboeckx.com", customers.get(4713).getWeb());
	}
}
