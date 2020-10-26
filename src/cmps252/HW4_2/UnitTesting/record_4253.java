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

@Tag("4")
class Record_4253 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4253: FirstName is Chuck")
	void FirstNameOfRecord4253() {
		assertEquals("Chuck", customers.get(4252).getFirstName());
	}

	@Test
	@DisplayName("Record 4253: LastName is Kemnits")
	void LastNameOfRecord4253() {
		assertEquals("Kemnits", customers.get(4252).getLastName());
	}

	@Test
	@DisplayName("Record 4253: Company is Ramp Industries Inc")
	void CompanyOfRecord4253() {
		assertEquals("Ramp Industries Inc", customers.get(4252).getCompany());
	}

	@Test
	@DisplayName("Record 4253: Address is 2857 Nazareth Rd")
	void AddressOfRecord4253() {
		assertEquals("2857 Nazareth Rd", customers.get(4252).getAddress());
	}

	@Test
	@DisplayName("Record 4253: City is Easton")
	void CityOfRecord4253() {
		assertEquals("Easton", customers.get(4252).getCity());
	}

	@Test
	@DisplayName("Record 4253: County is Northampton")
	void CountyOfRecord4253() {
		assertEquals("Northampton", customers.get(4252).getCounty());
	}

	@Test
	@DisplayName("Record 4253: State is PA")
	void StateOfRecord4253() {
		assertEquals("PA", customers.get(4252).getState());
	}

	@Test
	@DisplayName("Record 4253: ZIP is 18045")
	void ZIPOfRecord4253() {
		assertEquals("18045", customers.get(4252).getZIP());
	}

	@Test
	@DisplayName("Record 4253: Phone is 610-258-9808")
	void PhoneOfRecord4253() {
		assertEquals("610-258-9808", customers.get(4252).getPhone());
	}

	@Test
	@DisplayName("Record 4253: Fax is 610-258-9167")
	void FaxOfRecord4253() {
		assertEquals("610-258-9167", customers.get(4252).getFax());
	}

	@Test
	@DisplayName("Record 4253: Email is chuck@kemnits.com")
	void EmailOfRecord4253() {
		assertEquals("chuck@kemnits.com", customers.get(4252).getEmail());
	}

	@Test
	@DisplayName("Record 4253: Web is http://www.chuckkemnits.com")
	void WebOfRecord4253() {
		assertEquals("http://www.chuckkemnits.com", customers.get(4252).getWeb());
	}
}
