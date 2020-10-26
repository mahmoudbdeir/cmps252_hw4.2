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

@Tag("7")
class Record_1371 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1371: FirstName is Pamela")
	void FirstNameOfRecord1371() {
		assertEquals("Pamela", customers.get(1370).getFirstName());
	}

	@Test
	@DisplayName("Record 1371: LastName is Shurman")
	void LastNameOfRecord1371() {
		assertEquals("Shurman", customers.get(1370).getLastName());
	}

	@Test
	@DisplayName("Record 1371: Company is A G Business Services")
	void CompanyOfRecord1371() {
		assertEquals("A G Business Services", customers.get(1370).getCompany());
	}

	@Test
	@DisplayName("Record 1371: Address is 160 Hamlet Ave")
	void AddressOfRecord1371() {
		assertEquals("160 Hamlet Ave", customers.get(1370).getAddress());
	}

	@Test
	@DisplayName("Record 1371: City is Woonsocket")
	void CityOfRecord1371() {
		assertEquals("Woonsocket", customers.get(1370).getCity());
	}

	@Test
	@DisplayName("Record 1371: County is Providence")
	void CountyOfRecord1371() {
		assertEquals("Providence", customers.get(1370).getCounty());
	}

	@Test
	@DisplayName("Record 1371: State is RI")
	void StateOfRecord1371() {
		assertEquals("RI", customers.get(1370).getState());
	}

	@Test
	@DisplayName("Record 1371: ZIP is 2895")
	void ZIPOfRecord1371() {
		assertEquals("2895", customers.get(1370).getZIP());
	}

	@Test
	@DisplayName("Record 1371: Phone is 401-769-0212")
	void PhoneOfRecord1371() {
		assertEquals("401-769-0212", customers.get(1370).getPhone());
	}

	@Test
	@DisplayName("Record 1371: Fax is 401-769-7306")
	void FaxOfRecord1371() {
		assertEquals("401-769-7306", customers.get(1370).getFax());
	}

	@Test
	@DisplayName("Record 1371: Email is pamela@shurman.com")
	void EmailOfRecord1371() {
		assertEquals("pamela@shurman.com", customers.get(1370).getEmail());
	}

	@Test
	@DisplayName("Record 1371: Web is http://www.pamelashurman.com")
	void WebOfRecord1371() {
		assertEquals("http://www.pamelashurman.com", customers.get(1370).getWeb());
	}
}
