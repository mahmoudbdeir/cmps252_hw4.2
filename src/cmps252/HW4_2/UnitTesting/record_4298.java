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

@Tag("15")
class Record_4298 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4298: FirstName is Cecile")
	void FirstNameOfRecord4298() {
		assertEquals("Cecile", customers.get(4297).getFirstName());
	}

	@Test
	@DisplayName("Record 4298: LastName is Goehl")
	void LastNameOfRecord4298() {
		assertEquals("Goehl", customers.get(4297).getLastName());
	}

	@Test
	@DisplayName("Record 4298: Company is Mcgill Design Engineering")
	void CompanyOfRecord4298() {
		assertEquals("Mcgill Design Engineering", customers.get(4297).getCompany());
	}

	@Test
	@DisplayName("Record 4298: Address is 115 N Jackson St")
	void AddressOfRecord4298() {
		assertEquals("115 N Jackson St", customers.get(4297).getAddress());
	}

	@Test
	@DisplayName("Record 4298: City is Media")
	void CityOfRecord4298() {
		assertEquals("Media", customers.get(4297).getCity());
	}

	@Test
	@DisplayName("Record 4298: County is Delaware")
	void CountyOfRecord4298() {
		assertEquals("Delaware", customers.get(4297).getCounty());
	}

	@Test
	@DisplayName("Record 4298: State is PA")
	void StateOfRecord4298() {
		assertEquals("PA", customers.get(4297).getState());
	}

	@Test
	@DisplayName("Record 4298: ZIP is 19063")
	void ZIPOfRecord4298() {
		assertEquals("19063", customers.get(4297).getZIP());
	}

	@Test
	@DisplayName("Record 4298: Phone is 610-565-7755")
	void PhoneOfRecord4298() {
		assertEquals("610-565-7755", customers.get(4297).getPhone());
	}

	@Test
	@DisplayName("Record 4298: Fax is 610-565-5567")
	void FaxOfRecord4298() {
		assertEquals("610-565-5567", customers.get(4297).getFax());
	}

	@Test
	@DisplayName("Record 4298: Email is cecile@goehl.com")
	void EmailOfRecord4298() {
		assertEquals("cecile@goehl.com", customers.get(4297).getEmail());
	}

	@Test
	@DisplayName("Record 4298: Web is http://www.cecilegoehl.com")
	void WebOfRecord4298() {
		assertEquals("http://www.cecilegoehl.com", customers.get(4297).getWeb());
	}
}
