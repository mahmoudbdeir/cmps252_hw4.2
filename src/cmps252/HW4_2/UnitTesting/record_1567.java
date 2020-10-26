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

@Tag("3")
class Record_1567 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1567: FirstName is Iola")
	void FirstNameOfRecord1567() {
		assertEquals("Iola", customers.get(1566).getFirstName());
	}

	@Test
	@DisplayName("Record 1567: LastName is Darville")
	void LastNameOfRecord1567() {
		assertEquals("Darville", customers.get(1566).getLastName());
	}

	@Test
	@DisplayName("Record 1567: Company is Thrash, Thomas W Esq")
	void CompanyOfRecord1567() {
		assertEquals("Thrash, Thomas W Esq", customers.get(1566).getCompany());
	}

	@Test
	@DisplayName("Record 1567: Address is 1001 N County Road 3 E")
	void AddressOfRecord1567() {
		assertEquals("1001 N County Road 3 E", customers.get(1566).getAddress());
	}

	@Test
	@DisplayName("Record 1567: City is Monte Vista")
	void CityOfRecord1567() {
		assertEquals("Monte Vista", customers.get(1566).getCity());
	}

	@Test
	@DisplayName("Record 1567: County is Rio Grande")
	void CountyOfRecord1567() {
		assertEquals("Rio Grande", customers.get(1566).getCounty());
	}

	@Test
	@DisplayName("Record 1567: State is CO")
	void StateOfRecord1567() {
		assertEquals("CO", customers.get(1566).getState());
	}

	@Test
	@DisplayName("Record 1567: ZIP is 81144")
	void ZIPOfRecord1567() {
		assertEquals("81144", customers.get(1566).getZIP());
	}

	@Test
	@DisplayName("Record 1567: Phone is 719-852-8297")
	void PhoneOfRecord1567() {
		assertEquals("719-852-8297", customers.get(1566).getPhone());
	}

	@Test
	@DisplayName("Record 1567: Fax is 719-852-7663")
	void FaxOfRecord1567() {
		assertEquals("719-852-7663", customers.get(1566).getFax());
	}

	@Test
	@DisplayName("Record 1567: Email is iola@darville.com")
	void EmailOfRecord1567() {
		assertEquals("iola@darville.com", customers.get(1566).getEmail());
	}

	@Test
	@DisplayName("Record 1567: Web is http://www.ioladarville.com")
	void WebOfRecord1567() {
		assertEquals("http://www.ioladarville.com", customers.get(1566).getWeb());
	}
}
