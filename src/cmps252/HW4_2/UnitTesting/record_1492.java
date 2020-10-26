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

@Tag("29")
class Record_1492 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1492: FirstName is Minh")
	void FirstNameOfRecord1492() {
		assertEquals("Minh", customers.get(1491).getFirstName());
	}

	@Test
	@DisplayName("Record 1492: LastName is Holaway")
	void LastNameOfRecord1492() {
		assertEquals("Holaway", customers.get(1491).getLastName());
	}

	@Test
	@DisplayName("Record 1492: Company is Palintest")
	void CompanyOfRecord1492() {
		assertEquals("Palintest", customers.get(1491).getCompany());
	}

	@Test
	@DisplayName("Record 1492: Address is 300 Armand Hammer Blvd")
	void AddressOfRecord1492() {
		assertEquals("300 Armand Hammer Blvd", customers.get(1491).getAddress());
	}

	@Test
	@DisplayName("Record 1492: City is Pottstown")
	void CityOfRecord1492() {
		assertEquals("Pottstown", customers.get(1491).getCity());
	}

	@Test
	@DisplayName("Record 1492: County is Montgomery")
	void CountyOfRecord1492() {
		assertEquals("Montgomery", customers.get(1491).getCounty());
	}

	@Test
	@DisplayName("Record 1492: State is PA")
	void StateOfRecord1492() {
		assertEquals("PA", customers.get(1491).getState());
	}

	@Test
	@DisplayName("Record 1492: ZIP is 19464")
	void ZIPOfRecord1492() {
		assertEquals("19464", customers.get(1491).getZIP());
	}

	@Test
	@DisplayName("Record 1492: Phone is 610-327-4362")
	void PhoneOfRecord1492() {
		assertEquals("610-327-4362", customers.get(1491).getPhone());
	}

	@Test
	@DisplayName("Record 1492: Fax is 610-327-8494")
	void FaxOfRecord1492() {
		assertEquals("610-327-8494", customers.get(1491).getFax());
	}

	@Test
	@DisplayName("Record 1492: Email is minh@holaway.com")
	void EmailOfRecord1492() {
		assertEquals("minh@holaway.com", customers.get(1491).getEmail());
	}

	@Test
	@DisplayName("Record 1492: Web is http://www.minhholaway.com")
	void WebOfRecord1492() {
		assertEquals("http://www.minhholaway.com", customers.get(1491).getWeb());
	}
}
