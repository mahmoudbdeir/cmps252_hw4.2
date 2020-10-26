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

@Tag("37")
class Record_3257 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3257: FirstName is Chet")
	void FirstNameOfRecord3257() {
		assertEquals("Chet", customers.get(3256).getFirstName());
	}

	@Test
	@DisplayName("Record 3257: LastName is Pozar")
	void LastNameOfRecord3257() {
		assertEquals("Pozar", customers.get(3256).getLastName());
	}

	@Test
	@DisplayName("Record 3257: Company is Co Cmpgrnd Resrt Rlty Inc")
	void CompanyOfRecord3257() {
		assertEquals("Co Cmpgrnd Resrt Rlty Inc", customers.get(3256).getCompany());
	}

	@Test
	@DisplayName("Record 3257: Address is 333 Ten Eyck St")
	void AddressOfRecord3257() {
		assertEquals("333 Ten Eyck St", customers.get(3256).getAddress());
	}

	@Test
	@DisplayName("Record 3257: City is Brooklyn")
	void CityOfRecord3257() {
		assertEquals("Brooklyn", customers.get(3256).getCity());
	}

	@Test
	@DisplayName("Record 3257: County is Kings")
	void CountyOfRecord3257() {
		assertEquals("Kings", customers.get(3256).getCounty());
	}

	@Test
	@DisplayName("Record 3257: State is NY")
	void StateOfRecord3257() {
		assertEquals("NY", customers.get(3256).getState());
	}

	@Test
	@DisplayName("Record 3257: ZIP is 11206")
	void ZIPOfRecord3257() {
		assertEquals("11206", customers.get(3256).getZIP());
	}

	@Test
	@DisplayName("Record 3257: Phone is 718-821-1912")
	void PhoneOfRecord3257() {
		assertEquals("718-821-1912", customers.get(3256).getPhone());
	}

	@Test
	@DisplayName("Record 3257: Fax is 718-821-1858")
	void FaxOfRecord3257() {
		assertEquals("718-821-1858", customers.get(3256).getFax());
	}

	@Test
	@DisplayName("Record 3257: Email is chet@pozar.com")
	void EmailOfRecord3257() {
		assertEquals("chet@pozar.com", customers.get(3256).getEmail());
	}

	@Test
	@DisplayName("Record 3257: Web is http://www.chetpozar.com")
	void WebOfRecord3257() {
		assertEquals("http://www.chetpozar.com", customers.get(3256).getWeb());
	}
}
