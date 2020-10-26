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

@Tag("14")
class Record_1116 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1116: FirstName is Jo")
	void FirstNameOfRecord1116() {
		assertEquals("Jo", customers.get(1115).getFirstName());
	}

	@Test
	@DisplayName("Record 1116: LastName is Menge")
	void LastNameOfRecord1116() {
		assertEquals("Menge", customers.get(1115).getLastName());
	}

	@Test
	@DisplayName("Record 1116: Company is Selective Interiors")
	void CompanyOfRecord1116() {
		assertEquals("Selective Interiors", customers.get(1115).getCompany());
	}

	@Test
	@DisplayName("Record 1116: Address is 942 Seaway Dr")
	void AddressOfRecord1116() {
		assertEquals("942 Seaway Dr", customers.get(1115).getAddress());
	}

	@Test
	@DisplayName("Record 1116: City is Fort Pierce")
	void CityOfRecord1116() {
		assertEquals("Fort Pierce", customers.get(1115).getCity());
	}

	@Test
	@DisplayName("Record 1116: County is Saint Lucie")
	void CountyOfRecord1116() {
		assertEquals("Saint Lucie", customers.get(1115).getCounty());
	}

	@Test
	@DisplayName("Record 1116: State is FL")
	void StateOfRecord1116() {
		assertEquals("FL", customers.get(1115).getState());
	}

	@Test
	@DisplayName("Record 1116: ZIP is 34949")
	void ZIPOfRecord1116() {
		assertEquals("34949", customers.get(1115).getZIP());
	}

	@Test
	@DisplayName("Record 1116: Phone is 772-489-8495")
	void PhoneOfRecord1116() {
		assertEquals("772-489-8495", customers.get(1115).getPhone());
	}

	@Test
	@DisplayName("Record 1116: Fax is 772-489-7678")
	void FaxOfRecord1116() {
		assertEquals("772-489-7678", customers.get(1115).getFax());
	}

	@Test
	@DisplayName("Record 1116: Email is jo@menge.com")
	void EmailOfRecord1116() {
		assertEquals("jo@menge.com", customers.get(1115).getEmail());
	}

	@Test
	@DisplayName("Record 1116: Web is http://www.jomenge.com")
	void WebOfRecord1116() {
		assertEquals("http://www.jomenge.com", customers.get(1115).getWeb());
	}
}
