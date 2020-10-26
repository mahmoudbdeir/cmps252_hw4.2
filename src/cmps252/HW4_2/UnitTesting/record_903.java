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

@Tag("28")
class Record_903 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 903: FirstName is August")
	void FirstNameOfRecord903() {
		assertEquals("August", customers.get(902).getFirstName());
	}

	@Test
	@DisplayName("Record 903: LastName is Bolton")
	void LastNameOfRecord903() {
		assertEquals("Bolton", customers.get(902).getLastName());
	}

	@Test
	@DisplayName("Record 903: Company is Headstart Hair Care Salons")
	void CompanyOfRecord903() {
		assertEquals("Headstart Hair Care Salons", customers.get(902).getCompany());
	}

	@Test
	@DisplayName("Record 903: Address is 1 Newark St")
	void AddressOfRecord903() {
		assertEquals("1 Newark St", customers.get(902).getAddress());
	}

	@Test
	@DisplayName("Record 903: City is Hoboken")
	void CityOfRecord903() {
		assertEquals("Hoboken", customers.get(902).getCity());
	}

	@Test
	@DisplayName("Record 903: County is Hudson")
	void CountyOfRecord903() {
		assertEquals("Hudson", customers.get(902).getCounty());
	}

	@Test
	@DisplayName("Record 903: State is NJ")
	void StateOfRecord903() {
		assertEquals("NJ", customers.get(902).getState());
	}

	@Test
	@DisplayName("Record 903: ZIP is 7030")
	void ZIPOfRecord903() {
		assertEquals("7030", customers.get(902).getZIP());
	}

	@Test
	@DisplayName("Record 903: Phone is 201-659-0743")
	void PhoneOfRecord903() {
		assertEquals("201-659-0743", customers.get(902).getPhone());
	}

	@Test
	@DisplayName("Record 903: Fax is 201-659-8091")
	void FaxOfRecord903() {
		assertEquals("201-659-8091", customers.get(902).getFax());
	}

	@Test
	@DisplayName("Record 903: Email is august@bolton.com")
	void EmailOfRecord903() {
		assertEquals("august@bolton.com", customers.get(902).getEmail());
	}

	@Test
	@DisplayName("Record 903: Web is http://www.augustbolton.com")
	void WebOfRecord903() {
		assertEquals("http://www.augustbolton.com", customers.get(902).getWeb());
	}
}
