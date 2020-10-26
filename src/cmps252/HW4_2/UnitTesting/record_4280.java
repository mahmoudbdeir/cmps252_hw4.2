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

@Tag("19")
class Record_4280 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4280: FirstName is Debora")
	void FirstNameOfRecord4280() {
		assertEquals("Debora", customers.get(4279).getFirstName());
	}

	@Test
	@DisplayName("Record 4280: LastName is Guntharp")
	void LastNameOfRecord4280() {
		assertEquals("Guntharp", customers.get(4279).getLastName());
	}

	@Test
	@DisplayName("Record 4280: Company is Modern Machine Co")
	void CompanyOfRecord4280() {
		assertEquals("Modern Machine Co", customers.get(4279).getCompany());
	}

	@Test
	@DisplayName("Record 4280: Address is 56 E 13th St")
	void AddressOfRecord4280() {
		assertEquals("56 E 13th St", customers.get(4279).getAddress());
	}

	@Test
	@DisplayName("Record 4280: City is New York")
	void CityOfRecord4280() {
		assertEquals("New York", customers.get(4279).getCity());
	}

	@Test
	@DisplayName("Record 4280: County is New York")
	void CountyOfRecord4280() {
		assertEquals("New York", customers.get(4279).getCounty());
	}

	@Test
	@DisplayName("Record 4280: State is NY")
	void StateOfRecord4280() {
		assertEquals("NY", customers.get(4279).getState());
	}

	@Test
	@DisplayName("Record 4280: ZIP is 10003")
	void ZIPOfRecord4280() {
		assertEquals("10003", customers.get(4279).getZIP());
	}

	@Test
	@DisplayName("Record 4280: Phone is 212-995-0478")
	void PhoneOfRecord4280() {
		assertEquals("212-995-0478", customers.get(4279).getPhone());
	}

	@Test
	@DisplayName("Record 4280: Fax is 212-995-6353")
	void FaxOfRecord4280() {
		assertEquals("212-995-6353", customers.get(4279).getFax());
	}

	@Test
	@DisplayName("Record 4280: Email is debora@guntharp.com")
	void EmailOfRecord4280() {
		assertEquals("debora@guntharp.com", customers.get(4279).getEmail());
	}

	@Test
	@DisplayName("Record 4280: Web is http://www.deboraguntharp.com")
	void WebOfRecord4280() {
		assertEquals("http://www.deboraguntharp.com", customers.get(4279).getWeb());
	}
}
