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

@Tag("46")
class Record_4319 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4319: FirstName is Deana")
	void FirstNameOfRecord4319() {
		assertEquals("Deana", customers.get(4318).getFirstName());
	}

	@Test
	@DisplayName("Record 4319: LastName is Kamaunu")
	void LastNameOfRecord4319() {
		assertEquals("Kamaunu", customers.get(4318).getLastName());
	}

	@Test
	@DisplayName("Record 4319: Company is James A Isaacson Dmd")
	void CompanyOfRecord4319() {
		assertEquals("James A Isaacson Dmd", customers.get(4318).getCompany());
	}

	@Test
	@DisplayName("Record 4319: Address is 8827 Columbia")
	void AddressOfRecord4319() {
		assertEquals("8827 Columbia", customers.get(4318).getAddress());
	}

	@Test
	@DisplayName("Record 4319: City is Columbia")
	void CityOfRecord4319() {
		assertEquals("Columbia", customers.get(4318).getCity());
	}

	@Test
	@DisplayName("Record 4319: County is Howard")
	void CountyOfRecord4319() {
		assertEquals("Howard", customers.get(4318).getCounty());
	}

	@Test
	@DisplayName("Record 4319: State is MD")
	void StateOfRecord4319() {
		assertEquals("MD", customers.get(4318).getState());
	}

	@Test
	@DisplayName("Record 4319: ZIP is 21045")
	void ZIPOfRecord4319() {
		assertEquals("21045", customers.get(4318).getZIP());
	}

	@Test
	@DisplayName("Record 4319: Phone is 410-995-4934")
	void PhoneOfRecord4319() {
		assertEquals("410-995-4934", customers.get(4318).getPhone());
	}

	@Test
	@DisplayName("Record 4319: Fax is 410-995-6872")
	void FaxOfRecord4319() {
		assertEquals("410-995-6872", customers.get(4318).getFax());
	}

	@Test
	@DisplayName("Record 4319: Email is deana@kamaunu.com")
	void EmailOfRecord4319() {
		assertEquals("deana@kamaunu.com", customers.get(4318).getEmail());
	}

	@Test
	@DisplayName("Record 4319: Web is http://www.deanakamaunu.com")
	void WebOfRecord4319() {
		assertEquals("http://www.deanakamaunu.com", customers.get(4318).getWeb());
	}
}
