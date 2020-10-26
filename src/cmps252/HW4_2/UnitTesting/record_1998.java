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

@Tag("6")
class Record_1998 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1998: FirstName is Berta")
	void FirstNameOfRecord1998() {
		assertEquals("Berta", customers.get(1997).getFirstName());
	}

	@Test
	@DisplayName("Record 1998: LastName is Roso")
	void LastNameOfRecord1998() {
		assertEquals("Roso", customers.get(1997).getLastName());
	}

	@Test
	@DisplayName("Record 1998: Company is Mobile Glass Of Mena")
	void CompanyOfRecord1998() {
		assertEquals("Mobile Glass Of Mena", customers.get(1997).getCompany());
	}

	@Test
	@DisplayName("Record 1998: Address is 520 S 4th St")
	void AddressOfRecord1998() {
		assertEquals("520 S 4th St", customers.get(1997).getAddress());
	}

	@Test
	@DisplayName("Record 1998: City is Las Vegas")
	void CityOfRecord1998() {
		assertEquals("Las Vegas", customers.get(1997).getCity());
	}

	@Test
	@DisplayName("Record 1998: County is Clark")
	void CountyOfRecord1998() {
		assertEquals("Clark", customers.get(1997).getCounty());
	}

	@Test
	@DisplayName("Record 1998: State is NV")
	void StateOfRecord1998() {
		assertEquals("NV", customers.get(1997).getState());
	}

	@Test
	@DisplayName("Record 1998: ZIP is 89101")
	void ZIPOfRecord1998() {
		assertEquals("89101", customers.get(1997).getZIP());
	}

	@Test
	@DisplayName("Record 1998: Phone is 702-598-4632")
	void PhoneOfRecord1998() {
		assertEquals("702-598-4632", customers.get(1997).getPhone());
	}

	@Test
	@DisplayName("Record 1998: Fax is 702-598-2988")
	void FaxOfRecord1998() {
		assertEquals("702-598-2988", customers.get(1997).getFax());
	}

	@Test
	@DisplayName("Record 1998: Email is berta@roso.com")
	void EmailOfRecord1998() {
		assertEquals("berta@roso.com", customers.get(1997).getEmail());
	}

	@Test
	@DisplayName("Record 1998: Web is http://www.bertaroso.com")
	void WebOfRecord1998() {
		assertEquals("http://www.bertaroso.com", customers.get(1997).getWeb());
	}
}
