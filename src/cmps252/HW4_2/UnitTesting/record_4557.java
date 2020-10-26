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

@Tag("32")
class Record_4557 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4557: FirstName is Mable")
	void FirstNameOfRecord4557() {
		assertEquals("Mable", customers.get(4556).getFirstName());
	}

	@Test
	@DisplayName("Record 4557: LastName is Hillburg")
	void LastNameOfRecord4557() {
		assertEquals("Hillburg", customers.get(4556).getLastName());
	}

	@Test
	@DisplayName("Record 4557: Company is International Data Oprn Inc")
	void CompanyOfRecord4557() {
		assertEquals("International Data Oprn Inc", customers.get(4556).getCompany());
	}

	@Test
	@DisplayName("Record 4557: Address is 330 N Superior St")
	void AddressOfRecord4557() {
		assertEquals("330 N Superior St", customers.get(4556).getAddress());
	}

	@Test
	@DisplayName("Record 4557: City is Toledo")
	void CityOfRecord4557() {
		assertEquals("Toledo", customers.get(4556).getCity());
	}

	@Test
	@DisplayName("Record 4557: County is Lucas")
	void CountyOfRecord4557() {
		assertEquals("Lucas", customers.get(4556).getCounty());
	}

	@Test
	@DisplayName("Record 4557: State is OH")
	void StateOfRecord4557() {
		assertEquals("OH", customers.get(4556).getState());
	}

	@Test
	@DisplayName("Record 4557: ZIP is 43604")
	void ZIPOfRecord4557() {
		assertEquals("43604", customers.get(4556).getZIP());
	}

	@Test
	@DisplayName("Record 4557: Phone is 419-255-6074")
	void PhoneOfRecord4557() {
		assertEquals("419-255-6074", customers.get(4556).getPhone());
	}

	@Test
	@DisplayName("Record 4557: Fax is 419-255-8104")
	void FaxOfRecord4557() {
		assertEquals("419-255-8104", customers.get(4556).getFax());
	}

	@Test
	@DisplayName("Record 4557: Email is mable@hillburg.com")
	void EmailOfRecord4557() {
		assertEquals("mable@hillburg.com", customers.get(4556).getEmail());
	}

	@Test
	@DisplayName("Record 4557: Web is http://www.mablehillburg.com")
	void WebOfRecord4557() {
		assertEquals("http://www.mablehillburg.com", customers.get(4556).getWeb());
	}
}
