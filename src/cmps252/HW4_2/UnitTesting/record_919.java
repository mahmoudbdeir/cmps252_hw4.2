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
class Record_919 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 919: FirstName is Doris")
	void FirstNameOfRecord919() {
		assertEquals("Doris", customers.get(918).getFirstName());
	}

	@Test
	@DisplayName("Record 919: LastName is Nibert")
	void LastNameOfRecord919() {
		assertEquals("Nibert", customers.get(918).getLastName());
	}

	@Test
	@DisplayName("Record 919: Company is Hallett Funeral Home")
	void CompanyOfRecord919() {
		assertEquals("Hallett Funeral Home", customers.get(918).getCompany());
	}

	@Test
	@DisplayName("Record 919: Address is 2000 E Jefferson St")
	void AddressOfRecord919() {
		assertEquals("2000 E Jefferson St", customers.get(918).getAddress());
	}

	@Test
	@DisplayName("Record 919: City is Phoenix")
	void CityOfRecord919() {
		assertEquals("Phoenix", customers.get(918).getCity());
	}

	@Test
	@DisplayName("Record 919: County is Maricopa")
	void CountyOfRecord919() {
		assertEquals("Maricopa", customers.get(918).getCounty());
	}

	@Test
	@DisplayName("Record 919: State is AZ")
	void StateOfRecord919() {
		assertEquals("AZ", customers.get(918).getState());
	}

	@Test
	@DisplayName("Record 919: ZIP is 85034")
	void ZIPOfRecord919() {
		assertEquals("85034", customers.get(918).getZIP());
	}

	@Test
	@DisplayName("Record 919: Phone is 602-258-9372")
	void PhoneOfRecord919() {
		assertEquals("602-258-9372", customers.get(918).getPhone());
	}

	@Test
	@DisplayName("Record 919: Fax is 602-258-3031")
	void FaxOfRecord919() {
		assertEquals("602-258-3031", customers.get(918).getFax());
	}

	@Test
	@DisplayName("Record 919: Email is doris@nibert.com")
	void EmailOfRecord919() {
		assertEquals("doris@nibert.com", customers.get(918).getEmail());
	}

	@Test
	@DisplayName("Record 919: Web is http://www.dorisnibert.com")
	void WebOfRecord919() {
		assertEquals("http://www.dorisnibert.com", customers.get(918).getWeb());
	}
}
