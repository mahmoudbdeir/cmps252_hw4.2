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

@Tag("15")
class Record_4494 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4494: FirstName is Karl")
	void FirstNameOfRecord4494() {
		assertEquals("Karl", customers.get(4493).getFirstName());
	}

	@Test
	@DisplayName("Record 4494: LastName is Runquist")
	void LastNameOfRecord4494() {
		assertEquals("Runquist", customers.get(4493).getLastName());
	}

	@Test
	@DisplayName("Record 4494: Company is Kytn 104 9 Fm")
	void CompanyOfRecord4494() {
		assertEquals("Kytn 104 9 Fm", customers.get(4493).getCompany());
	}

	@Test
	@DisplayName("Record 4494: Address is 504 S 14th St")
	void AddressOfRecord4494() {
		assertEquals("504 S 14th St", customers.get(4493).getAddress());
	}

	@Test
	@DisplayName("Record 4494: City is Sheboygan")
	void CityOfRecord4494() {
		assertEquals("Sheboygan", customers.get(4493).getCity());
	}

	@Test
	@DisplayName("Record 4494: County is Sheboygan")
	void CountyOfRecord4494() {
		assertEquals("Sheboygan", customers.get(4493).getCounty());
	}

	@Test
	@DisplayName("Record 4494: State is WI")
	void StateOfRecord4494() {
		assertEquals("WI", customers.get(4493).getState());
	}

	@Test
	@DisplayName("Record 4494: ZIP is 53081")
	void ZIPOfRecord4494() {
		assertEquals("53081", customers.get(4493).getZIP());
	}

	@Test
	@DisplayName("Record 4494: Phone is 920-458-9581")
	void PhoneOfRecord4494() {
		assertEquals("920-458-9581", customers.get(4493).getPhone());
	}

	@Test
	@DisplayName("Record 4494: Fax is 920-458-7988")
	void FaxOfRecord4494() {
		assertEquals("920-458-7988", customers.get(4493).getFax());
	}

	@Test
	@DisplayName("Record 4494: Email is karl@runquist.com")
	void EmailOfRecord4494() {
		assertEquals("karl@runquist.com", customers.get(4493).getEmail());
	}

	@Test
	@DisplayName("Record 4494: Web is http://www.karlrunquist.com")
	void WebOfRecord4494() {
		assertEquals("http://www.karlrunquist.com", customers.get(4493).getWeb());
	}
}
