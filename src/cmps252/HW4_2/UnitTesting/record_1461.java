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
class Record_1461 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1461: FirstName is Dewitt")
	void FirstNameOfRecord1461() {
		assertEquals("Dewitt", customers.get(1460).getFirstName());
	}

	@Test
	@DisplayName("Record 1461: LastName is Altobello")
	void LastNameOfRecord1461() {
		assertEquals("Altobello", customers.get(1460).getLastName());
	}

	@Test
	@DisplayName("Record 1461: Company is Intevac E O Sensors Division")
	void CompanyOfRecord1461() {
		assertEquals("Intevac E O Sensors Division", customers.get(1460).getCompany());
	}

	@Test
	@DisplayName("Record 1461: Address is 2499 Willow Park Rd")
	void AddressOfRecord1461() {
		assertEquals("2499 Willow Park Rd", customers.get(1460).getAddress());
	}

	@Test
	@DisplayName("Record 1461: City is Bethlehem")
	void CityOfRecord1461() {
		assertEquals("Bethlehem", customers.get(1460).getCity());
	}

	@Test
	@DisplayName("Record 1461: County is Northampton")
	void CountyOfRecord1461() {
		assertEquals("Northampton", customers.get(1460).getCounty());
	}

	@Test
	@DisplayName("Record 1461: State is PA")
	void StateOfRecord1461() {
		assertEquals("PA", customers.get(1460).getState());
	}

	@Test
	@DisplayName("Record 1461: ZIP is 18017")
	void ZIPOfRecord1461() {
		assertEquals("18017", customers.get(1460).getZIP());
	}

	@Test
	@DisplayName("Record 1461: Phone is 610-691-1958")
	void PhoneOfRecord1461() {
		assertEquals("610-691-1958", customers.get(1460).getPhone());
	}

	@Test
	@DisplayName("Record 1461: Fax is 610-691-2995")
	void FaxOfRecord1461() {
		assertEquals("610-691-2995", customers.get(1460).getFax());
	}

	@Test
	@DisplayName("Record 1461: Email is dewitt@altobello.com")
	void EmailOfRecord1461() {
		assertEquals("dewitt@altobello.com", customers.get(1460).getEmail());
	}

	@Test
	@DisplayName("Record 1461: Web is http://www.dewittaltobello.com")
	void WebOfRecord1461() {
		assertEquals("http://www.dewittaltobello.com", customers.get(1460).getWeb());
	}
}
