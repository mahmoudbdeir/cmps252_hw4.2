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

@Tag("27")
class Record_1900 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1900: FirstName is Kenny")
	void FirstNameOfRecord1900() {
		assertEquals("Kenny", customers.get(1899).getFirstName());
	}

	@Test
	@DisplayName("Record 1900: LastName is Dukes")
	void LastNameOfRecord1900() {
		assertEquals("Dukes", customers.get(1899).getLastName());
	}

	@Test
	@DisplayName("Record 1900: Company is Perrys Water Garden")
	void CompanyOfRecord1900() {
		assertEquals("Perrys Water Garden", customers.get(1899).getCompany());
	}

	@Test
	@DisplayName("Record 1900: Address is 1309 Us Highway 22")
	void AddressOfRecord1900() {
		assertEquals("1309 Us Highway 22", customers.get(1899).getAddress());
	}

	@Test
	@DisplayName("Record 1900: City is Lebanon")
	void CityOfRecord1900() {
		assertEquals("Lebanon", customers.get(1899).getCity());
	}

	@Test
	@DisplayName("Record 1900: County is Hunterdon")
	void CountyOfRecord1900() {
		assertEquals("Hunterdon", customers.get(1899).getCounty());
	}

	@Test
	@DisplayName("Record 1900: State is NJ")
	void StateOfRecord1900() {
		assertEquals("NJ", customers.get(1899).getState());
	}

	@Test
	@DisplayName("Record 1900: ZIP is 8833")
	void ZIPOfRecord1900() {
		assertEquals("8833", customers.get(1899).getZIP());
	}

	@Test
	@DisplayName("Record 1900: Phone is 908-236-5645")
	void PhoneOfRecord1900() {
		assertEquals("908-236-5645", customers.get(1899).getPhone());
	}

	@Test
	@DisplayName("Record 1900: Fax is 908-236-0615")
	void FaxOfRecord1900() {
		assertEquals("908-236-0615", customers.get(1899).getFax());
	}

	@Test
	@DisplayName("Record 1900: Email is kenny@dukes.com")
	void EmailOfRecord1900() {
		assertEquals("kenny@dukes.com", customers.get(1899).getEmail());
	}

	@Test
	@DisplayName("Record 1900: Web is http://www.kennydukes.com")
	void WebOfRecord1900() {
		assertEquals("http://www.kennydukes.com", customers.get(1899).getWeb());
	}
}
