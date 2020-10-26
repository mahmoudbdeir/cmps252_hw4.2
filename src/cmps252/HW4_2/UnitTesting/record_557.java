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

@Tag("0")
class Record_557 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 557: FirstName is Truman")
	void FirstNameOfRecord557() {
		assertEquals("Truman", customers.get(556).getFirstName());
	}

	@Test
	@DisplayName("Record 557: LastName is Kriskovich")
	void LastNameOfRecord557() {
		assertEquals("Kriskovich", customers.get(556).getLastName());
	}

	@Test
	@DisplayName("Record 557: Company is Bcm Service & Engineering")
	void CompanyOfRecord557() {
		assertEquals("Bcm Service & Engineering", customers.get(556).getCompany());
	}

	@Test
	@DisplayName("Record 557: Address is 8225 Phlox St")
	void AddressOfRecord557() {
		assertEquals("8225 Phlox St", customers.get(556).getAddress());
	}

	@Test
	@DisplayName("Record 557: City is Downey")
	void CityOfRecord557() {
		assertEquals("Downey", customers.get(556).getCity());
	}

	@Test
	@DisplayName("Record 557: County is Los Angeles")
	void CountyOfRecord557() {
		assertEquals("Los Angeles", customers.get(556).getCounty());
	}

	@Test
	@DisplayName("Record 557: State is CA")
	void StateOfRecord557() {
		assertEquals("CA", customers.get(556).getState());
	}

	@Test
	@DisplayName("Record 557: ZIP is 90241")
	void ZIPOfRecord557() {
		assertEquals("90241", customers.get(556).getZIP());
	}

	@Test
	@DisplayName("Record 557: Phone is 562-869-8489")
	void PhoneOfRecord557() {
		assertEquals("562-869-8489", customers.get(556).getPhone());
	}

	@Test
	@DisplayName("Record 557: Fax is 562-869-1844")
	void FaxOfRecord557() {
		assertEquals("562-869-1844", customers.get(556).getFax());
	}

	@Test
	@DisplayName("Record 557: Email is truman@kriskovich.com")
	void EmailOfRecord557() {
		assertEquals("truman@kriskovich.com", customers.get(556).getEmail());
	}

	@Test
	@DisplayName("Record 557: Web is http://www.trumankriskovich.com")
	void WebOfRecord557() {
		assertEquals("http://www.trumankriskovich.com", customers.get(556).getWeb());
	}
}
