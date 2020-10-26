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

@Tag("35")
class Record_1141 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1141: FirstName is Lakesha")
	void FirstNameOfRecord1141() {
		assertEquals("Lakesha", customers.get(1140).getFirstName());
	}

	@Test
	@DisplayName("Record 1141: LastName is Kruckenberg")
	void LastNameOfRecord1141() {
		assertEquals("Kruckenberg", customers.get(1140).getLastName());
	}

	@Test
	@DisplayName("Record 1141: Company is Game Plan Inc")
	void CompanyOfRecord1141() {
		assertEquals("Game Plan Inc", customers.get(1140).getCompany());
	}

	@Test
	@DisplayName("Record 1141: Address is 210 N Allen St")
	void AddressOfRecord1141() {
		assertEquals("210 N Allen St", customers.get(1140).getAddress());
	}

	@Test
	@DisplayName("Record 1141: City is Centralia")
	void CityOfRecord1141() {
		assertEquals("Centralia", customers.get(1140).getCity());
	}

	@Test
	@DisplayName("Record 1141: County is Boone")
	void CountyOfRecord1141() {
		assertEquals("Boone", customers.get(1140).getCounty());
	}

	@Test
	@DisplayName("Record 1141: State is MO")
	void StateOfRecord1141() {
		assertEquals("MO", customers.get(1140).getState());
	}

	@Test
	@DisplayName("Record 1141: ZIP is 65240")
	void ZIPOfRecord1141() {
		assertEquals("65240", customers.get(1140).getZIP());
	}

	@Test
	@DisplayName("Record 1141: Phone is 573-682-7343")
	void PhoneOfRecord1141() {
		assertEquals("573-682-7343", customers.get(1140).getPhone());
	}

	@Test
	@DisplayName("Record 1141: Fax is 573-682-8938")
	void FaxOfRecord1141() {
		assertEquals("573-682-8938", customers.get(1140).getFax());
	}

	@Test
	@DisplayName("Record 1141: Email is lakesha@kruckenberg.com")
	void EmailOfRecord1141() {
		assertEquals("lakesha@kruckenberg.com", customers.get(1140).getEmail());
	}

	@Test
	@DisplayName("Record 1141: Web is http://www.lakeshakruckenberg.com")
	void WebOfRecord1141() {
		assertEquals("http://www.lakeshakruckenberg.com", customers.get(1140).getWeb());
	}
}
