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
class Record_2567 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2567: FirstName is Wanda")
	void FirstNameOfRecord2567() {
		assertEquals("Wanda", customers.get(2566).getFirstName());
	}

	@Test
	@DisplayName("Record 2567: LastName is Scampoli")
	void LastNameOfRecord2567() {
		assertEquals("Scampoli", customers.get(2566).getLastName());
	}

	@Test
	@DisplayName("Record 2567: Company is Rector, L Dan Esq")
	void CompanyOfRecord2567() {
		assertEquals("Rector, L Dan Esq", customers.get(2566).getCompany());
	}

	@Test
	@DisplayName("Record 2567: Address is 2120 E 4th St")
	void AddressOfRecord2567() {
		assertEquals("2120 E 4th St", customers.get(2566).getAddress());
	}

	@Test
	@DisplayName("Record 2567: City is Long Beach")
	void CityOfRecord2567() {
		assertEquals("Long Beach", customers.get(2566).getCity());
	}

	@Test
	@DisplayName("Record 2567: County is Los Angeles")
	void CountyOfRecord2567() {
		assertEquals("Los Angeles", customers.get(2566).getCounty());
	}

	@Test
	@DisplayName("Record 2567: State is CA")
	void StateOfRecord2567() {
		assertEquals("CA", customers.get(2566).getState());
	}

	@Test
	@DisplayName("Record 2567: ZIP is 90814")
	void ZIPOfRecord2567() {
		assertEquals("90814", customers.get(2566).getZIP());
	}

	@Test
	@DisplayName("Record 2567: Phone is 562-434-8636")
	void PhoneOfRecord2567() {
		assertEquals("562-434-8636", customers.get(2566).getPhone());
	}

	@Test
	@DisplayName("Record 2567: Fax is 562-434-8783")
	void FaxOfRecord2567() {
		assertEquals("562-434-8783", customers.get(2566).getFax());
	}

	@Test
	@DisplayName("Record 2567: Email is wanda@scampoli.com")
	void EmailOfRecord2567() {
		assertEquals("wanda@scampoli.com", customers.get(2566).getEmail());
	}

	@Test
	@DisplayName("Record 2567: Web is http://www.wandascampoli.com")
	void WebOfRecord2567() {
		assertEquals("http://www.wandascampoli.com", customers.get(2566).getWeb());
	}
}
