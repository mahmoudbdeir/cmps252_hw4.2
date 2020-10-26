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

@Tag("47")
class Record_1152 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1152: FirstName is Kristi")
	void FirstNameOfRecord1152() {
		assertEquals("Kristi", customers.get(1151).getFirstName());
	}

	@Test
	@DisplayName("Record 1152: LastName is Brunson")
	void LastNameOfRecord1152() {
		assertEquals("Brunson", customers.get(1151).getLastName());
	}

	@Test
	@DisplayName("Record 1152: Company is Blumenstone, Carl L Esq")
	void CompanyOfRecord1152() {
		assertEquals("Blumenstone, Carl L Esq", customers.get(1151).getCompany());
	}

	@Test
	@DisplayName("Record 1152: Address is 27850 Mound Rd")
	void AddressOfRecord1152() {
		assertEquals("27850 Mound Rd", customers.get(1151).getAddress());
	}

	@Test
	@DisplayName("Record 1152: City is Warren")
	void CityOfRecord1152() {
		assertEquals("Warren", customers.get(1151).getCity());
	}

	@Test
	@DisplayName("Record 1152: County is Macomb")
	void CountyOfRecord1152() {
		assertEquals("Macomb", customers.get(1151).getCounty());
	}

	@Test
	@DisplayName("Record 1152: State is MI")
	void StateOfRecord1152() {
		assertEquals("MI", customers.get(1151).getState());
	}

	@Test
	@DisplayName("Record 1152: ZIP is 48092")
	void ZIPOfRecord1152() {
		assertEquals("48092", customers.get(1151).getZIP());
	}

	@Test
	@DisplayName("Record 1152: Phone is 586-751-2612")
	void PhoneOfRecord1152() {
		assertEquals("586-751-2612", customers.get(1151).getPhone());
	}

	@Test
	@DisplayName("Record 1152: Fax is 586-751-7824")
	void FaxOfRecord1152() {
		assertEquals("586-751-7824", customers.get(1151).getFax());
	}

	@Test
	@DisplayName("Record 1152: Email is kristi@brunson.com")
	void EmailOfRecord1152() {
		assertEquals("kristi@brunson.com", customers.get(1151).getEmail());
	}

	@Test
	@DisplayName("Record 1152: Web is http://www.kristibrunson.com")
	void WebOfRecord1152() {
		assertEquals("http://www.kristibrunson.com", customers.get(1151).getWeb());
	}
}
