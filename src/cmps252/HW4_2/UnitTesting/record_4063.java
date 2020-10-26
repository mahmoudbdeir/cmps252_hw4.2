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

@Tag("38")
class Record_4063 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4063: FirstName is Kelvin")
	void FirstNameOfRecord4063() {
		assertEquals("Kelvin", customers.get(4062).getFirstName());
	}

	@Test
	@DisplayName("Record 4063: LastName is Preskitt")
	void LastNameOfRecord4063() {
		assertEquals("Preskitt", customers.get(4062).getLastName());
	}

	@Test
	@DisplayName("Record 4063: Company is Freedom Bail Bonds")
	void CompanyOfRecord4063() {
		assertEquals("Freedom Bail Bonds", customers.get(4062).getCompany());
	}

	@Test
	@DisplayName("Record 4063: Address is 220 W Harrison St")
	void AddressOfRecord4063() {
		assertEquals("220 W Harrison St", customers.get(4062).getAddress());
	}

	@Test
	@DisplayName("Record 4063: City is Seattle")
	void CityOfRecord4063() {
		assertEquals("Seattle", customers.get(4062).getCity());
	}

	@Test
	@DisplayName("Record 4063: County is King")
	void CountyOfRecord4063() {
		assertEquals("King", customers.get(4062).getCounty());
	}

	@Test
	@DisplayName("Record 4063: State is WA")
	void StateOfRecord4063() {
		assertEquals("WA", customers.get(4062).getState());
	}

	@Test
	@DisplayName("Record 4063: ZIP is 98119")
	void ZIPOfRecord4063() {
		assertEquals("98119", customers.get(4062).getZIP());
	}

	@Test
	@DisplayName("Record 4063: Phone is 206-285-9447")
	void PhoneOfRecord4063() {
		assertEquals("206-285-9447", customers.get(4062).getPhone());
	}

	@Test
	@DisplayName("Record 4063: Fax is 206-285-5292")
	void FaxOfRecord4063() {
		assertEquals("206-285-5292", customers.get(4062).getFax());
	}

	@Test
	@DisplayName("Record 4063: Email is kelvin@preskitt.com")
	void EmailOfRecord4063() {
		assertEquals("kelvin@preskitt.com", customers.get(4062).getEmail());
	}

	@Test
	@DisplayName("Record 4063: Web is http://www.kelvinpreskitt.com")
	void WebOfRecord4063() {
		assertEquals("http://www.kelvinpreskitt.com", customers.get(4062).getWeb());
	}
}
