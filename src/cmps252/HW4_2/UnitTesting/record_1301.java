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

@Tag("42")
class Record_1301 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1301: FirstName is Keri")
	void FirstNameOfRecord1301() {
		assertEquals("Keri", customers.get(1300).getFirstName());
	}

	@Test
	@DisplayName("Record 1301: LastName is Voorhys")
	void LastNameOfRecord1301() {
		assertEquals("Voorhys", customers.get(1300).getLastName());
	}

	@Test
	@DisplayName("Record 1301: Company is Faber Associates Incorporated")
	void CompanyOfRecord1301() {
		assertEquals("Faber Associates Incorporated", customers.get(1300).getCompany());
	}

	@Test
	@DisplayName("Record 1301: Address is 576 Pompton Ave")
	void AddressOfRecord1301() {
		assertEquals("576 Pompton Ave", customers.get(1300).getAddress());
	}

	@Test
	@DisplayName("Record 1301: City is Cedar Grove")
	void CityOfRecord1301() {
		assertEquals("Cedar Grove", customers.get(1300).getCity());
	}

	@Test
	@DisplayName("Record 1301: County is Essex")
	void CountyOfRecord1301() {
		assertEquals("Essex", customers.get(1300).getCounty());
	}

	@Test
	@DisplayName("Record 1301: State is NJ")
	void StateOfRecord1301() {
		assertEquals("NJ", customers.get(1300).getState());
	}

	@Test
	@DisplayName("Record 1301: ZIP is 7009")
	void ZIPOfRecord1301() {
		assertEquals("7009", customers.get(1300).getZIP());
	}

	@Test
	@DisplayName("Record 1301: Phone is 973-857-8177")
	void PhoneOfRecord1301() {
		assertEquals("973-857-8177", customers.get(1300).getPhone());
	}

	@Test
	@DisplayName("Record 1301: Fax is 973-857-4827")
	void FaxOfRecord1301() {
		assertEquals("973-857-4827", customers.get(1300).getFax());
	}

	@Test
	@DisplayName("Record 1301: Email is keri@voorhys.com")
	void EmailOfRecord1301() {
		assertEquals("keri@voorhys.com", customers.get(1300).getEmail());
	}

	@Test
	@DisplayName("Record 1301: Web is http://www.kerivoorhys.com")
	void WebOfRecord1301() {
		assertEquals("http://www.kerivoorhys.com", customers.get(1300).getWeb());
	}
}
