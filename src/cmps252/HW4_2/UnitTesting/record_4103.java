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

@Tag("40")
class Record_4103 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4103: FirstName is Cecelia")
	void FirstNameOfRecord4103() {
		assertEquals("Cecelia", customers.get(4102).getFirstName());
	}

	@Test
	@DisplayName("Record 4103: LastName is Vanderwoude")
	void LastNameOfRecord4103() {
		assertEquals("Vanderwoude", customers.get(4102).getLastName());
	}

	@Test
	@DisplayName("Record 4103: Company is Griffith Strickler Lerman")
	void CompanyOfRecord4103() {
		assertEquals("Griffith Strickler Lerman", customers.get(4102).getCompany());
	}

	@Test
	@DisplayName("Record 4103: Address is 3975 University Dr")
	void AddressOfRecord4103() {
		assertEquals("3975 University Dr", customers.get(4102).getAddress());
	}

	@Test
	@DisplayName("Record 4103: City is Fairfax")
	void CityOfRecord4103() {
		assertEquals("Fairfax", customers.get(4102).getCity());
	}

	@Test
	@DisplayName("Record 4103: County is Fairfax City")
	void CountyOfRecord4103() {
		assertEquals("Fairfax City", customers.get(4102).getCounty());
	}

	@Test
	@DisplayName("Record 4103: State is VA")
	void StateOfRecord4103() {
		assertEquals("VA", customers.get(4102).getState());
	}

	@Test
	@DisplayName("Record 4103: ZIP is 22030")
	void ZIPOfRecord4103() {
		assertEquals("22030", customers.get(4102).getZIP());
	}

	@Test
	@DisplayName("Record 4103: Phone is 703-385-4599")
	void PhoneOfRecord4103() {
		assertEquals("703-385-4599", customers.get(4102).getPhone());
	}

	@Test
	@DisplayName("Record 4103: Fax is 703-385-4784")
	void FaxOfRecord4103() {
		assertEquals("703-385-4784", customers.get(4102).getFax());
	}

	@Test
	@DisplayName("Record 4103: Email is cecelia@vanderwoude.com")
	void EmailOfRecord4103() {
		assertEquals("cecelia@vanderwoude.com", customers.get(4102).getEmail());
	}

	@Test
	@DisplayName("Record 4103: Web is http://www.ceceliavanderwoude.com")
	void WebOfRecord4103() {
		assertEquals("http://www.ceceliavanderwoude.com", customers.get(4102).getWeb());
	}
}
