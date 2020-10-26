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

@Tag("32")
class Record_1431 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1431: FirstName is Simone")
	void FirstNameOfRecord1431() {
		assertEquals("Simone", customers.get(1430).getFirstName());
	}

	@Test
	@DisplayName("Record 1431: LastName is Virgin")
	void LastNameOfRecord1431() {
		assertEquals("Virgin", customers.get(1430).getLastName());
	}

	@Test
	@DisplayName("Record 1431: Company is Goodman Assoc Inc")
	void CompanyOfRecord1431() {
		assertEquals("Goodman Assoc Inc", customers.get(1430).getCompany());
	}

	@Test
	@DisplayName("Record 1431: Address is 2127 W College St")
	void AddressOfRecord1431() {
		assertEquals("2127 W College St", customers.get(1430).getAddress());
	}

	@Test
	@DisplayName("Record 1431: City is Springfield")
	void CityOfRecord1431() {
		assertEquals("Springfield", customers.get(1430).getCity());
	}

	@Test
	@DisplayName("Record 1431: County is Greene")
	void CountyOfRecord1431() {
		assertEquals("Greene", customers.get(1430).getCounty());
	}

	@Test
	@DisplayName("Record 1431: State is MO")
	void StateOfRecord1431() {
		assertEquals("MO", customers.get(1430).getState());
	}

	@Test
	@DisplayName("Record 1431: ZIP is 65806")
	void ZIPOfRecord1431() {
		assertEquals("65806", customers.get(1430).getZIP());
	}

	@Test
	@DisplayName("Record 1431: Phone is 417-869-0897")
	void PhoneOfRecord1431() {
		assertEquals("417-869-0897", customers.get(1430).getPhone());
	}

	@Test
	@DisplayName("Record 1431: Fax is 417-869-9114")
	void FaxOfRecord1431() {
		assertEquals("417-869-9114", customers.get(1430).getFax());
	}

	@Test
	@DisplayName("Record 1431: Email is simone@virgin.com")
	void EmailOfRecord1431() {
		assertEquals("simone@virgin.com", customers.get(1430).getEmail());
	}

	@Test
	@DisplayName("Record 1431: Web is http://www.simonevirgin.com")
	void WebOfRecord1431() {
		assertEquals("http://www.simonevirgin.com", customers.get(1430).getWeb());
	}
}
