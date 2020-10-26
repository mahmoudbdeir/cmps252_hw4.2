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

@Tag("43")
class Record_4788 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4788: FirstName is Evangelina")
	void FirstNameOfRecord4788() {
		assertEquals("Evangelina", customers.get(4787).getFirstName());
	}

	@Test
	@DisplayName("Record 4788: LastName is Meharg")
	void LastNameOfRecord4788() {
		assertEquals("Meharg", customers.get(4787).getLastName());
	}

	@Test
	@DisplayName("Record 4788: Company is Communication Concepts Inc")
	void CompanyOfRecord4788() {
		assertEquals("Communication Concepts Inc", customers.get(4787).getCompany());
	}

	@Test
	@DisplayName("Record 4788: Address is 1033 Clifton Ave")
	void AddressOfRecord4788() {
		assertEquals("1033 Clifton Ave", customers.get(4787).getAddress());
	}

	@Test
	@DisplayName("Record 4788: City is Clifton")
	void CityOfRecord4788() {
		assertEquals("Clifton", customers.get(4787).getCity());
	}

	@Test
	@DisplayName("Record 4788: County is Passaic")
	void CountyOfRecord4788() {
		assertEquals("Passaic", customers.get(4787).getCounty());
	}

	@Test
	@DisplayName("Record 4788: State is NJ")
	void StateOfRecord4788() {
		assertEquals("NJ", customers.get(4787).getState());
	}

	@Test
	@DisplayName("Record 4788: ZIP is 7013")
	void ZIPOfRecord4788() {
		assertEquals("7013", customers.get(4787).getZIP());
	}

	@Test
	@DisplayName("Record 4788: Phone is 973-472-6470")
	void PhoneOfRecord4788() {
		assertEquals("973-472-6470", customers.get(4787).getPhone());
	}

	@Test
	@DisplayName("Record 4788: Fax is 973-472-6794")
	void FaxOfRecord4788() {
		assertEquals("973-472-6794", customers.get(4787).getFax());
	}

	@Test
	@DisplayName("Record 4788: Email is evangelina@meharg.com")
	void EmailOfRecord4788() {
		assertEquals("evangelina@meharg.com", customers.get(4787).getEmail());
	}

	@Test
	@DisplayName("Record 4788: Web is http://www.evangelinameharg.com")
	void WebOfRecord4788() {
		assertEquals("http://www.evangelinameharg.com", customers.get(4787).getWeb());
	}
}
