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
class Record_579 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 579: FirstName is Mohammad")
	void FirstNameOfRecord579() {
		assertEquals("Mohammad", customers.get(578).getFirstName());
	}

	@Test
	@DisplayName("Record 579: LastName is Mckaughan")
	void LastNameOfRecord579() {
		assertEquals("Mckaughan", customers.get(578).getLastName());
	}

	@Test
	@DisplayName("Record 579: Company is Derezin, Sheldon")
	void CompanyOfRecord579() {
		assertEquals("Derezin, Sheldon", customers.get(578).getCompany());
	}

	@Test
	@DisplayName("Record 579: Address is 44 W 18th St")
	void AddressOfRecord579() {
		assertEquals("44 W 18th St", customers.get(578).getAddress());
	}

	@Test
	@DisplayName("Record 579: City is New York")
	void CityOfRecord579() {
		assertEquals("New York", customers.get(578).getCity());
	}

	@Test
	@DisplayName("Record 579: County is New York")
	void CountyOfRecord579() {
		assertEquals("New York", customers.get(578).getCounty());
	}

	@Test
	@DisplayName("Record 579: State is NY")
	void StateOfRecord579() {
		assertEquals("NY", customers.get(578).getState());
	}

	@Test
	@DisplayName("Record 579: ZIP is 10011")
	void ZIPOfRecord579() {
		assertEquals("10011", customers.get(578).getZIP());
	}

	@Test
	@DisplayName("Record 579: Phone is 212-929-7508")
	void PhoneOfRecord579() {
		assertEquals("212-929-7508", customers.get(578).getPhone());
	}

	@Test
	@DisplayName("Record 579: Fax is 212-929-3639")
	void FaxOfRecord579() {
		assertEquals("212-929-3639", customers.get(578).getFax());
	}

	@Test
	@DisplayName("Record 579: Email is mohammad@mckaughan.com")
	void EmailOfRecord579() {
		assertEquals("mohammad@mckaughan.com", customers.get(578).getEmail());
	}

	@Test
	@DisplayName("Record 579: Web is http://www.mohammadmckaughan.com")
	void WebOfRecord579() {
		assertEquals("http://www.mohammadmckaughan.com", customers.get(578).getWeb());
	}
}
