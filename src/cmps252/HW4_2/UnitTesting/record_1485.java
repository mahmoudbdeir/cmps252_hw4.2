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

@Tag("27")
class Record_1485 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1485: FirstName is Octavia")
	void FirstNameOfRecord1485() {
		assertEquals("Octavia", customers.get(1484).getFirstName());
	}

	@Test
	@DisplayName("Record 1485: LastName is Fatula")
	void LastNameOfRecord1485() {
		assertEquals("Fatula", customers.get(1484).getLastName());
	}

	@Test
	@DisplayName("Record 1485: Company is Stocker, Richard J Esq")
	void CompanyOfRecord1485() {
		assertEquals("Stocker, Richard J Esq", customers.get(1484).getCompany());
	}

	@Test
	@DisplayName("Record 1485: Address is 125 S Main")
	void AddressOfRecord1485() {
		assertEquals("125 S Main", customers.get(1484).getAddress());
	}

	@Test
	@DisplayName("Record 1485: City is Buhler")
	void CityOfRecord1485() {
		assertEquals("Buhler", customers.get(1484).getCity());
	}

	@Test
	@DisplayName("Record 1485: County is Reno")
	void CountyOfRecord1485() {
		assertEquals("Reno", customers.get(1484).getCounty());
	}

	@Test
	@DisplayName("Record 1485: State is KS")
	void StateOfRecord1485() {
		assertEquals("KS", customers.get(1484).getState());
	}

	@Test
	@DisplayName("Record 1485: ZIP is 67522")
	void ZIPOfRecord1485() {
		assertEquals("67522", customers.get(1484).getZIP());
	}

	@Test
	@DisplayName("Record 1485: Phone is 620-543-5351")
	void PhoneOfRecord1485() {
		assertEquals("620-543-5351", customers.get(1484).getPhone());
	}

	@Test
	@DisplayName("Record 1485: Fax is 620-543-9502")
	void FaxOfRecord1485() {
		assertEquals("620-543-9502", customers.get(1484).getFax());
	}

	@Test
	@DisplayName("Record 1485: Email is octavia@fatula.com")
	void EmailOfRecord1485() {
		assertEquals("octavia@fatula.com", customers.get(1484).getEmail());
	}

	@Test
	@DisplayName("Record 1485: Web is http://www.octaviafatula.com")
	void WebOfRecord1485() {
		assertEquals("http://www.octaviafatula.com", customers.get(1484).getWeb());
	}
}
