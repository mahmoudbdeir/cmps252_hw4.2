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

@Tag("20")
class Record_1573 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1573: FirstName is Parker")
	void FirstNameOfRecord1573() {
		assertEquals("Parker", customers.get(1572).getFirstName());
	}

	@Test
	@DisplayName("Record 1573: LastName is Emhoff")
	void LastNameOfRecord1573() {
		assertEquals("Emhoff", customers.get(1572).getLastName());
	}

	@Test
	@DisplayName("Record 1573: Company is Antinori Bros")
	void CompanyOfRecord1573() {
		assertEquals("Antinori Bros", customers.get(1572).getCompany());
	}

	@Test
	@DisplayName("Record 1573: Address is 66 W 2nd St")
	void AddressOfRecord1573() {
		assertEquals("66 W 2nd St", customers.get(1572).getAddress());
	}

	@Test
	@DisplayName("Record 1573: City is Clifton")
	void CityOfRecord1573() {
		assertEquals("Clifton", customers.get(1572).getCity());
	}

	@Test
	@DisplayName("Record 1573: County is Passaic")
	void CountyOfRecord1573() {
		assertEquals("Passaic", customers.get(1572).getCounty());
	}

	@Test
	@DisplayName("Record 1573: State is NJ")
	void StateOfRecord1573() {
		assertEquals("NJ", customers.get(1572).getState());
	}

	@Test
	@DisplayName("Record 1573: ZIP is 7011")
	void ZIPOfRecord1573() {
		assertEquals("7011", customers.get(1572).getZIP());
	}

	@Test
	@DisplayName("Record 1573: Phone is 973-478-4391")
	void PhoneOfRecord1573() {
		assertEquals("973-478-4391", customers.get(1572).getPhone());
	}

	@Test
	@DisplayName("Record 1573: Fax is 973-478-6729")
	void FaxOfRecord1573() {
		assertEquals("973-478-6729", customers.get(1572).getFax());
	}

	@Test
	@DisplayName("Record 1573: Email is parker@emhoff.com")
	void EmailOfRecord1573() {
		assertEquals("parker@emhoff.com", customers.get(1572).getEmail());
	}

	@Test
	@DisplayName("Record 1573: Web is http://www.parkeremhoff.com")
	void WebOfRecord1573() {
		assertEquals("http://www.parkeremhoff.com", customers.get(1572).getWeb());
	}
}
