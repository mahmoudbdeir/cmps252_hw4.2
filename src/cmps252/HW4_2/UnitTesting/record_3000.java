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

@Tag("2")
class Record_3000 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3000: FirstName is Blair")
	void FirstNameOfRecord3000() {
		assertEquals("Blair", customers.get(2999).getFirstName());
	}

	@Test
	@DisplayName("Record 3000: LastName is Schrumpf")
	void LastNameOfRecord3000() {
		assertEquals("Schrumpf", customers.get(2999).getLastName());
	}

	@Test
	@DisplayName("Record 3000: Company is Treetops Sylvan Resort")
	void CompanyOfRecord3000() {
		assertEquals("Treetops Sylvan Resort", customers.get(2999).getCompany());
	}

	@Test
	@DisplayName("Record 3000: Address is 3661 S Maryland Pky")
	void AddressOfRecord3000() {
		assertEquals("3661 S Maryland Pky", customers.get(2999).getAddress());
	}

	@Test
	@DisplayName("Record 3000: City is Las Vegas")
	void CityOfRecord3000() {
		assertEquals("Las Vegas", customers.get(2999).getCity());
	}

	@Test
	@DisplayName("Record 3000: County is Clark")
	void CountyOfRecord3000() {
		assertEquals("Clark", customers.get(2999).getCounty());
	}

	@Test
	@DisplayName("Record 3000: State is NV")
	void StateOfRecord3000() {
		assertEquals("NV", customers.get(2999).getState());
	}

	@Test
	@DisplayName("Record 3000: ZIP is 89109")
	void ZIPOfRecord3000() {
		assertEquals("89109", customers.get(2999).getZIP());
	}

	@Test
	@DisplayName("Record 3000: Phone is 702-734-3279")
	void PhoneOfRecord3000() {
		assertEquals("702-734-3279", customers.get(2999).getPhone());
	}

	@Test
	@DisplayName("Record 3000: Fax is 702-734-0315")
	void FaxOfRecord3000() {
		assertEquals("702-734-0315", customers.get(2999).getFax());
	}

	@Test
	@DisplayName("Record 3000: Email is blair@schrumpf.com")
	void EmailOfRecord3000() {
		assertEquals("blair@schrumpf.com", customers.get(2999).getEmail());
	}

	@Test
	@DisplayName("Record 3000: Web is http://www.blairschrumpf.com")
	void WebOfRecord3000() {
		assertEquals("http://www.blairschrumpf.com", customers.get(2999).getWeb());
	}
}
