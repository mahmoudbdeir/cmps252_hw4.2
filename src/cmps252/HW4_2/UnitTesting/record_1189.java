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

@Tag("18")
class Record_1189 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1189: FirstName is Anna")
	void FirstNameOfRecord1189() {
		assertEquals("Anna", customers.get(1188).getFirstName());
	}

	@Test
	@DisplayName("Record 1189: LastName is Shoals")
	void LastNameOfRecord1189() {
		assertEquals("Shoals", customers.get(1188).getLastName());
	}

	@Test
	@DisplayName("Record 1189: Company is George Brown Assoc")
	void CompanyOfRecord1189() {
		assertEquals("George Brown Assoc", customers.get(1188).getCompany());
	}

	@Test
	@DisplayName("Record 1189: Address is 424 44th St Se")
	void AddressOfRecord1189() {
		assertEquals("424 44th St Se", customers.get(1188).getAddress());
	}

	@Test
	@DisplayName("Record 1189: City is Grand Rapids")
	void CityOfRecord1189() {
		assertEquals("Grand Rapids", customers.get(1188).getCity());
	}

	@Test
	@DisplayName("Record 1189: County is Kent")
	void CountyOfRecord1189() {
		assertEquals("Kent", customers.get(1188).getCounty());
	}

	@Test
	@DisplayName("Record 1189: State is MI")
	void StateOfRecord1189() {
		assertEquals("MI", customers.get(1188).getState());
	}

	@Test
	@DisplayName("Record 1189: ZIP is 49548")
	void ZIPOfRecord1189() {
		assertEquals("49548", customers.get(1188).getZIP());
	}

	@Test
	@DisplayName("Record 1189: Phone is 616-249-7695")
	void PhoneOfRecord1189() {
		assertEquals("616-249-7695", customers.get(1188).getPhone());
	}

	@Test
	@DisplayName("Record 1189: Fax is 616-249-9649")
	void FaxOfRecord1189() {
		assertEquals("616-249-9649", customers.get(1188).getFax());
	}

	@Test
	@DisplayName("Record 1189: Email is anna@shoals.com")
	void EmailOfRecord1189() {
		assertEquals("anna@shoals.com", customers.get(1188).getEmail());
	}

	@Test
	@DisplayName("Record 1189: Web is http://www.annashoals.com")
	void WebOfRecord1189() {
		assertEquals("http://www.annashoals.com", customers.get(1188).getWeb());
	}
}
