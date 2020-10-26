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

@Tag("44")
class Record_4436 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4436: FirstName is Evan")
	void FirstNameOfRecord4436() {
		assertEquals("Evan", customers.get(4435).getFirstName());
	}

	@Test
	@DisplayName("Record 4436: LastName is Knisely")
	void LastNameOfRecord4436() {
		assertEquals("Knisely", customers.get(4435).getLastName());
	}

	@Test
	@DisplayName("Record 4436: Company is Pacemarq Inc")
	void CompanyOfRecord4436() {
		assertEquals("Pacemarq Inc", customers.get(4435).getCompany());
	}

	@Test
	@DisplayName("Record 4436: Address is 3112 Lincoln St E")
	void AddressOfRecord4436() {
		assertEquals("3112 Lincoln St E", customers.get(4435).getAddress());
	}

	@Test
	@DisplayName("Record 4436: City is Canton")
	void CityOfRecord4436() {
		assertEquals("Canton", customers.get(4435).getCity());
	}

	@Test
	@DisplayName("Record 4436: County is Stark")
	void CountyOfRecord4436() {
		assertEquals("Stark", customers.get(4435).getCounty());
	}

	@Test
	@DisplayName("Record 4436: State is OH")
	void StateOfRecord4436() {
		assertEquals("OH", customers.get(4435).getState());
	}

	@Test
	@DisplayName("Record 4436: ZIP is 44707")
	void ZIPOfRecord4436() {
		assertEquals("44707", customers.get(4435).getZIP());
	}

	@Test
	@DisplayName("Record 4436: Phone is 330-488-4947")
	void PhoneOfRecord4436() {
		assertEquals("330-488-4947", customers.get(4435).getPhone());
	}

	@Test
	@DisplayName("Record 4436: Fax is 330-488-3602")
	void FaxOfRecord4436() {
		assertEquals("330-488-3602", customers.get(4435).getFax());
	}

	@Test
	@DisplayName("Record 4436: Email is evan@knisely.com")
	void EmailOfRecord4436() {
		assertEquals("evan@knisely.com", customers.get(4435).getEmail());
	}

	@Test
	@DisplayName("Record 4436: Web is http://www.evanknisely.com")
	void WebOfRecord4436() {
		assertEquals("http://www.evanknisely.com", customers.get(4435).getWeb());
	}
}
