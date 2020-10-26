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

@Tag("17")
class Record_2664 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2664: FirstName is Rhoda")
	void FirstNameOfRecord2664() {
		assertEquals("Rhoda", customers.get(2663).getFirstName());
	}

	@Test
	@DisplayName("Record 2664: LastName is Herzig")
	void LastNameOfRecord2664() {
		assertEquals("Herzig", customers.get(2663).getLastName());
	}

	@Test
	@DisplayName("Record 2664: Company is Treasure Crafts")
	void CompanyOfRecord2664() {
		assertEquals("Treasure Crafts", customers.get(2663).getCompany());
	}

	@Test
	@DisplayName("Record 2664: Address is 666 S Front St")
	void AddressOfRecord2664() {
		assertEquals("666 S Front St", customers.get(2663).getAddress());
	}

	@Test
	@DisplayName("Record 2664: City is Elizabeth")
	void CityOfRecord2664() {
		assertEquals("Elizabeth", customers.get(2663).getCity());
	}

	@Test
	@DisplayName("Record 2664: County is Union")
	void CountyOfRecord2664() {
		assertEquals("Union", customers.get(2663).getCounty());
	}

	@Test
	@DisplayName("Record 2664: State is NJ")
	void StateOfRecord2664() {
		assertEquals("NJ", customers.get(2663).getState());
	}

	@Test
	@DisplayName("Record 2664: ZIP is 7202")
	void ZIPOfRecord2664() {
		assertEquals("7202", customers.get(2663).getZIP());
	}

	@Test
	@DisplayName("Record 2664: Phone is 908-354-8139")
	void PhoneOfRecord2664() {
		assertEquals("908-354-8139", customers.get(2663).getPhone());
	}

	@Test
	@DisplayName("Record 2664: Fax is 908-354-0357")
	void FaxOfRecord2664() {
		assertEquals("908-354-0357", customers.get(2663).getFax());
	}

	@Test
	@DisplayName("Record 2664: Email is rhoda@herzig.com")
	void EmailOfRecord2664() {
		assertEquals("rhoda@herzig.com", customers.get(2663).getEmail());
	}

	@Test
	@DisplayName("Record 2664: Web is http://www.rhodaherzig.com")
	void WebOfRecord2664() {
		assertEquals("http://www.rhodaherzig.com", customers.get(2663).getWeb());
	}
}
