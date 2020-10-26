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

@Tag("17")
class Record_4440 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4440: FirstName is Loren")
	void FirstNameOfRecord4440() {
		assertEquals("Loren", customers.get(4439).getFirstName());
	}

	@Test
	@DisplayName("Record 4440: LastName is Matejek")
	void LastNameOfRecord4440() {
		assertEquals("Matejek", customers.get(4439).getLastName());
	}

	@Test
	@DisplayName("Record 4440: Company is Sr Citsns Law Ctr Jon W Searcy")
	void CompanyOfRecord4440() {
		assertEquals("Sr Citsns Law Ctr Jon W Searcy", customers.get(4439).getCompany());
	}

	@Test
	@DisplayName("Record 4440: Address is 111 W 2nd St")
	void AddressOfRecord4440() {
		assertEquals("111 W 2nd St", customers.get(4439).getAddress());
	}

	@Test
	@DisplayName("Record 4440: City is Owensboro")
	void CityOfRecord4440() {
		assertEquals("Owensboro", customers.get(4439).getCity());
	}

	@Test
	@DisplayName("Record 4440: County is Daviess")
	void CountyOfRecord4440() {
		assertEquals("Daviess", customers.get(4439).getCounty());
	}

	@Test
	@DisplayName("Record 4440: State is KY")
	void StateOfRecord4440() {
		assertEquals("KY", customers.get(4439).getState());
	}

	@Test
	@DisplayName("Record 4440: ZIP is 42303")
	void ZIPOfRecord4440() {
		assertEquals("42303", customers.get(4439).getZIP());
	}

	@Test
	@DisplayName("Record 4440: Phone is 270-684-7011")
	void PhoneOfRecord4440() {
		assertEquals("270-684-7011", customers.get(4439).getPhone());
	}

	@Test
	@DisplayName("Record 4440: Fax is 270-684-1327")
	void FaxOfRecord4440() {
		assertEquals("270-684-1327", customers.get(4439).getFax());
	}

	@Test
	@DisplayName("Record 4440: Email is loren@matejek.com")
	void EmailOfRecord4440() {
		assertEquals("loren@matejek.com", customers.get(4439).getEmail());
	}

	@Test
	@DisplayName("Record 4440: Web is http://www.lorenmatejek.com")
	void WebOfRecord4440() {
		assertEquals("http://www.lorenmatejek.com", customers.get(4439).getWeb());
	}
}
