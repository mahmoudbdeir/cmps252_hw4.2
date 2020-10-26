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

@Tag("38")
class Record_4088 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4088: FirstName is Neal")
	void FirstNameOfRecord4088() {
		assertEquals("Neal", customers.get(4087).getFirstName());
	}

	@Test
	@DisplayName("Record 4088: LastName is Cushen")
	void LastNameOfRecord4088() {
		assertEquals("Cushen", customers.get(4087).getLastName());
	}

	@Test
	@DisplayName("Record 4088: Company is Marshall Air Systems Inc")
	void CompanyOfRecord4088() {
		assertEquals("Marshall Air Systems Inc", customers.get(4087).getCompany());
	}

	@Test
	@DisplayName("Record 4088: Address is 421 N Stonestreet Ave")
	void AddressOfRecord4088() {
		assertEquals("421 N Stonestreet Ave", customers.get(4087).getAddress());
	}

	@Test
	@DisplayName("Record 4088: City is Rockville")
	void CityOfRecord4088() {
		assertEquals("Rockville", customers.get(4087).getCity());
	}

	@Test
	@DisplayName("Record 4088: County is Montgomery")
	void CountyOfRecord4088() {
		assertEquals("Montgomery", customers.get(4087).getCounty());
	}

	@Test
	@DisplayName("Record 4088: State is MD")
	void StateOfRecord4088() {
		assertEquals("MD", customers.get(4087).getState());
	}

	@Test
	@DisplayName("Record 4088: ZIP is 20850")
	void ZIPOfRecord4088() {
		assertEquals("20850", customers.get(4087).getZIP());
	}

	@Test
	@DisplayName("Record 4088: Phone is 301-279-8142")
	void PhoneOfRecord4088() {
		assertEquals("301-279-8142", customers.get(4087).getPhone());
	}

	@Test
	@DisplayName("Record 4088: Fax is 301-279-0024")
	void FaxOfRecord4088() {
		assertEquals("301-279-0024", customers.get(4087).getFax());
	}

	@Test
	@DisplayName("Record 4088: Email is neal@cushen.com")
	void EmailOfRecord4088() {
		assertEquals("neal@cushen.com", customers.get(4087).getEmail());
	}

	@Test
	@DisplayName("Record 4088: Web is http://www.nealcushen.com")
	void WebOfRecord4088() {
		assertEquals("http://www.nealcushen.com", customers.get(4087).getWeb());
	}
}
