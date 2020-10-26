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

@Tag("4")
class Record_4914 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4914: FirstName is Juliana")
	void FirstNameOfRecord4914() {
		assertEquals("Juliana", customers.get(4913).getFirstName());
	}

	@Test
	@DisplayName("Record 4914: LastName is Keagy")
	void LastNameOfRecord4914() {
		assertEquals("Keagy", customers.get(4913).getLastName());
	}

	@Test
	@DisplayName("Record 4914: Company is Boonsboro Body Shop")
	void CompanyOfRecord4914() {
		assertEquals("Boonsboro Body Shop", customers.get(4913).getCompany());
	}

	@Test
	@DisplayName("Record 4914: Address is 70 W Madison St")
	void AddressOfRecord4914() {
		assertEquals("70 W Madison St", customers.get(4913).getAddress());
	}

	@Test
	@DisplayName("Record 4914: City is Chicago")
	void CityOfRecord4914() {
		assertEquals("Chicago", customers.get(4913).getCity());
	}

	@Test
	@DisplayName("Record 4914: County is Cook")
	void CountyOfRecord4914() {
		assertEquals("Cook", customers.get(4913).getCounty());
	}

	@Test
	@DisplayName("Record 4914: State is IL")
	void StateOfRecord4914() {
		assertEquals("IL", customers.get(4913).getState());
	}

	@Test
	@DisplayName("Record 4914: ZIP is 60602")
	void ZIPOfRecord4914() {
		assertEquals("60602", customers.get(4913).getZIP());
	}

	@Test
	@DisplayName("Record 4914: Phone is 312-214-3979")
	void PhoneOfRecord4914() {
		assertEquals("312-214-3979", customers.get(4913).getPhone());
	}

	@Test
	@DisplayName("Record 4914: Fax is 312-214-7024")
	void FaxOfRecord4914() {
		assertEquals("312-214-7024", customers.get(4913).getFax());
	}

	@Test
	@DisplayName("Record 4914: Email is juliana@keagy.com")
	void EmailOfRecord4914() {
		assertEquals("juliana@keagy.com", customers.get(4913).getEmail());
	}

	@Test
	@DisplayName("Record 4914: Web is http://www.julianakeagy.com")
	void WebOfRecord4914() {
		assertEquals("http://www.julianakeagy.com", customers.get(4913).getWeb());
	}
}
