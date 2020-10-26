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

@Tag("11")
class Record_2997 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2997: FirstName is Malissa")
	void FirstNameOfRecord2997() {
		assertEquals("Malissa", customers.get(2996).getFirstName());
	}

	@Test
	@DisplayName("Record 2997: LastName is Mackin")
	void LastNameOfRecord2997() {
		assertEquals("Mackin", customers.get(2996).getLastName());
	}

	@Test
	@DisplayName("Record 2997: Company is Concorde French Bakery")
	void CompanyOfRecord2997() {
		assertEquals("Concorde French Bakery", customers.get(2996).getCompany());
	}

	@Test
	@DisplayName("Record 2997: Address is 1111 S Arroyo Pkwy")
	void AddressOfRecord2997() {
		assertEquals("1111 S Arroyo Pkwy", customers.get(2996).getAddress());
	}

	@Test
	@DisplayName("Record 2997: City is South Pasadena")
	void CityOfRecord2997() {
		assertEquals("South Pasadena", customers.get(2996).getCity());
	}

	@Test
	@DisplayName("Record 2997: County is Los Angeles")
	void CountyOfRecord2997() {
		assertEquals("Los Angeles", customers.get(2996).getCounty());
	}

	@Test
	@DisplayName("Record 2997: State is CA")
	void StateOfRecord2997() {
		assertEquals("CA", customers.get(2996).getState());
	}

	@Test
	@DisplayName("Record 2997: ZIP is 91030")
	void ZIPOfRecord2997() {
		assertEquals("91030", customers.get(2996).getZIP());
	}

	@Test
	@DisplayName("Record 2997: Phone is 626-441-0569")
	void PhoneOfRecord2997() {
		assertEquals("626-441-0569", customers.get(2996).getPhone());
	}

	@Test
	@DisplayName("Record 2997: Fax is 626-441-6243")
	void FaxOfRecord2997() {
		assertEquals("626-441-6243", customers.get(2996).getFax());
	}

	@Test
	@DisplayName("Record 2997: Email is malissa@mackin.com")
	void EmailOfRecord2997() {
		assertEquals("malissa@mackin.com", customers.get(2996).getEmail());
	}

	@Test
	@DisplayName("Record 2997: Web is http://www.malissamackin.com")
	void WebOfRecord2997() {
		assertEquals("http://www.malissamackin.com", customers.get(2996).getWeb());
	}
}
