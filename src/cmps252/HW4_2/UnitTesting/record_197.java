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

@Tag("33")
class Record_197 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 197: FirstName is Larissa")
	void FirstNameOfRecord197() {
		assertEquals("Larissa", customers.get(196).getFirstName());
	}

	@Test
	@DisplayName("Record 197: LastName is Catalfamo")
	void LastNameOfRecord197() {
		assertEquals("Catalfamo", customers.get(196).getLastName());
	}

	@Test
	@DisplayName("Record 197: Company is Grady, Thomas Esq")
	void CompanyOfRecord197() {
		assertEquals("Grady, Thomas Esq", customers.get(196).getCompany());
	}

	@Test
	@DisplayName("Record 197: Address is 2125 Holliday Rd")
	void AddressOfRecord197() {
		assertEquals("2125 Holliday Rd", customers.get(196).getAddress());
	}

	@Test
	@DisplayName("Record 197: City is Wichita Falls")
	void CityOfRecord197() {
		assertEquals("Wichita Falls", customers.get(196).getCity());
	}

	@Test
	@DisplayName("Record 197: County is Wichita")
	void CountyOfRecord197() {
		assertEquals("Wichita", customers.get(196).getCounty());
	}

	@Test
	@DisplayName("Record 197: State is TX")
	void StateOfRecord197() {
		assertEquals("TX", customers.get(196).getState());
	}

	@Test
	@DisplayName("Record 197: ZIP is 76301")
	void ZIPOfRecord197() {
		assertEquals("76301", customers.get(196).getZIP());
	}

	@Test
	@DisplayName("Record 197: Phone is 940-322-8890")
	void PhoneOfRecord197() {
		assertEquals("940-322-8890", customers.get(196).getPhone());
	}

	@Test
	@DisplayName("Record 197: Fax is 940-322-7305")
	void FaxOfRecord197() {
		assertEquals("940-322-7305", customers.get(196).getFax());
	}

	@Test
	@DisplayName("Record 197: Email is larissa@catalfamo.com")
	void EmailOfRecord197() {
		assertEquals("larissa@catalfamo.com", customers.get(196).getEmail());
	}

	@Test
	@DisplayName("Record 197: Web is http://www.larissacatalfamo.com")
	void WebOfRecord197() {
		assertEquals("http://www.larissacatalfamo.com", customers.get(196).getWeb());
	}
}
