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

@Tag("47")
class Record_1160 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1160: FirstName is Maria")
	void FirstNameOfRecord1160() {
		assertEquals("Maria", customers.get(1159).getFirstName());
	}

	@Test
	@DisplayName("Record 1160: LastName is Strohman")
	void LastNameOfRecord1160() {
		assertEquals("Strohman", customers.get(1159).getLastName());
	}

	@Test
	@DisplayName("Record 1160: Company is Freestate Thermal Insltn Inc")
	void CompanyOfRecord1160() {
		assertEquals("Freestate Thermal Insltn Inc", customers.get(1159).getCompany());
	}

	@Test
	@DisplayName("Record 1160: Address is 1643 Commerce Dr")
	void AddressOfRecord1160() {
		assertEquals("1643 Commerce Dr", customers.get(1159).getAddress());
	}

	@Test
	@DisplayName("Record 1160: City is South Bend")
	void CityOfRecord1160() {
		assertEquals("South Bend", customers.get(1159).getCity());
	}

	@Test
	@DisplayName("Record 1160: County is St Joseph")
	void CountyOfRecord1160() {
		assertEquals("St Joseph", customers.get(1159).getCounty());
	}

	@Test
	@DisplayName("Record 1160: State is IN")
	void StateOfRecord1160() {
		assertEquals("IN", customers.get(1159).getState());
	}

	@Test
	@DisplayName("Record 1160: ZIP is 46628")
	void ZIPOfRecord1160() {
		assertEquals("46628", customers.get(1159).getZIP());
	}

	@Test
	@DisplayName("Record 1160: Phone is 574-232-0179")
	void PhoneOfRecord1160() {
		assertEquals("574-232-0179", customers.get(1159).getPhone());
	}

	@Test
	@DisplayName("Record 1160: Fax is 574-232-7633")
	void FaxOfRecord1160() {
		assertEquals("574-232-7633", customers.get(1159).getFax());
	}

	@Test
	@DisplayName("Record 1160: Email is maria@strohman.com")
	void EmailOfRecord1160() {
		assertEquals("maria@strohman.com", customers.get(1159).getEmail());
	}

	@Test
	@DisplayName("Record 1160: Web is http://www.mariastrohman.com")
	void WebOfRecord1160() {
		assertEquals("http://www.mariastrohman.com", customers.get(1159).getWeb());
	}
}
