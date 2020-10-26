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

@Tag("30")
class Record_1606 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1606: FirstName is Delores")
	void FirstNameOfRecord1606() {
		assertEquals("Delores", customers.get(1605).getFirstName());
	}

	@Test
	@DisplayName("Record 1606: LastName is Muncey")
	void LastNameOfRecord1606() {
		assertEquals("Muncey", customers.get(1605).getLastName());
	}

	@Test
	@DisplayName("Record 1606: Company is Parrish, J Gilbert Jr")
	void CompanyOfRecord1606() {
		assertEquals("Parrish, J Gilbert Jr", customers.get(1605).getCompany());
	}

	@Test
	@DisplayName("Record 1606: Address is 245 5th Ave")
	void AddressOfRecord1606() {
		assertEquals("245 5th Ave", customers.get(1605).getAddress());
	}

	@Test
	@DisplayName("Record 1606: City is New York")
	void CityOfRecord1606() {
		assertEquals("New York", customers.get(1605).getCity());
	}

	@Test
	@DisplayName("Record 1606: County is New York")
	void CountyOfRecord1606() {
		assertEquals("New York", customers.get(1605).getCounty());
	}

	@Test
	@DisplayName("Record 1606: State is NY")
	void StateOfRecord1606() {
		assertEquals("NY", customers.get(1605).getState());
	}

	@Test
	@DisplayName("Record 1606: ZIP is 10016")
	void ZIPOfRecord1606() {
		assertEquals("10016", customers.get(1605).getZIP());
	}

	@Test
	@DisplayName("Record 1606: Phone is 212-545-3321")
	void PhoneOfRecord1606() {
		assertEquals("212-545-3321", customers.get(1605).getPhone());
	}

	@Test
	@DisplayName("Record 1606: Fax is 212-545-6971")
	void FaxOfRecord1606() {
		assertEquals("212-545-6971", customers.get(1605).getFax());
	}

	@Test
	@DisplayName("Record 1606: Email is delores@muncey.com")
	void EmailOfRecord1606() {
		assertEquals("delores@muncey.com", customers.get(1605).getEmail());
	}

	@Test
	@DisplayName("Record 1606: Web is http://www.deloresmuncey.com")
	void WebOfRecord1606() {
		assertEquals("http://www.deloresmuncey.com", customers.get(1605).getWeb());
	}
}
